package slotfilter

import java.util.*
import kotlin.collections.LinkedHashMap

val newLine: String = System.getProperty("line.separator")

fun <K, V> sizeLimitedSynchronizedMap(maxSize: Int): MutableMap<K, V> = Collections.synchronizedMap(object : LinkedHashMap<K, V>(maxSize) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
        return size > maxSize
    }
})
