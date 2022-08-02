package slotfilter

import org.drinkless.tdlib.TdApi
import java.time.Instant
import kotlin.collections.LinkedHashMap

val newLine: String = System.getProperty("line.separator")

fun <K, V> sizeLimitedMap(maxSize: Int): Unsafe<MutableMap<K, V>> = Unsafe(object : LinkedHashMap<K, V>(maxSize) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
        return size > maxSize
    }
})

class Unsafe<T : Any>(val inner: T) {
    inline operator fun <R> invoke(fn: T.() -> R): R = synchronized(inner){
        inner.fn()
    }
}


fun TdApi.MessageContent.text(): String = when (this) {
    is TdApi.MessageText -> {
        this.text.text
    }

    is TdApi.MessagePhoto -> {
        this.photo
        this.caption.text
    }

    else -> {
        "<unknown type ${this.javaClass.simpleName}>"
    }
}

val TdApi.Message.time: Instant get() = Instant.ofEpochSecond(date.toLong())
