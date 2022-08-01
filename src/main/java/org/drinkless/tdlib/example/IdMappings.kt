package org.drinkless.tdlib.example

import java.util.*
import kotlin.collections.LinkedHashMap

class IdMappings {
    private val idMappings = sizeLimitedSynchronizedMap<Long, MutableMap<Long, Long>>(10_000)
    fun setId(first: Long, second: Long, third: Long) {
        val map = idMappings.getOrPut(first) { Collections.synchronizedMap(mutableMapOf()) }
        map[second] = third
    }

    fun getId(srcMsgId: Long): Map<Long, Long> = (idMappings[srcMsgId] ?: emptyMap())

    fun keys() = idMappings.keys
}

fun <K, V> sizeLimitedSynchronizedMap(max: Int): MutableMap<K, V> = Collections.synchronizedMap(object : LinkedHashMap<K, V>(max) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
        return size > max
    }
})
