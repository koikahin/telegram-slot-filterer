package slotfilter

import java.util.*

class IdMappings {
    private val mappings = sizeLimitedSynchronizedMap<Long, MutableMap<Long, Long>>(10_000)
    fun setId(first: Long, second: Long, third: Long) {
        val map = mappings.getOrPut(first) { Collections.synchronizedMap(mutableMapOf()) }
        map[second] = third
    }

    fun getId(srcMsgId: Long): Map<Long, Long> = (mappings[srcMsgId] ?: emptyMap())

    fun keys(): Set<Long> = mappings.keys
}
