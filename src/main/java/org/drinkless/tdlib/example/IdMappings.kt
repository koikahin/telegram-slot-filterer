package org.drinkless.tdlib.example

import java.util.*
import java.util.concurrent.ConcurrentHashMap
import kotlin.collections.LinkedHashMap

class IdMappings {
    private val mapping = sizeLimitedSynchronizedMap<Long, Long>(10_000)
    fun set(sourceMessageId: Long, targetMessageId: Long) {
//        println("$sourceMessageId -> $targetMessageId" )
        mapping[sourceMessageId] = targetMessageId
    }

    fun get(sourceMessageId: Long): Long? {
        val fwdId = mapping[sourceMessageId]
//        if (fwdId == null)
//            System.err.println("Couldn't find corresponding forwarded id to: $sourceMessageId")
//        else
//            println("returning mapping $sourceMessageId -> $fwdId")
        return fwdId
    }
}

fun <K, V> sizeLimitedSynchronizedMap(max: Int): MutableMap<K, V> = Collections.synchronizedMap(object : LinkedHashMap<K, V>(max) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
        return size > max
    }
})
