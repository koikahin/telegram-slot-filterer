package slotfilter

import java.util.concurrent.atomic.AtomicLong

class IdGen {
    private val ctr = AtomicLong(0L)
    fun generate() : CorrelationId = CorrelationId(ctr.incrementAndGet())
}
