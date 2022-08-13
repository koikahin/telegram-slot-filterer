package org.drinkless.tdlib.example

import org.junit.jupiter.api.Test
import slotfilter.sizeLimitedMap
import kotlin.test.assertEquals

internal class SizeLimitedSynchMap {
    @Test
    fun mapSizeTest1() {
        val map = sizeLimitedMap<Int, String>(1)
        map.synchronized {
            this[1] = "1"
            assertEquals(this[1], "1")
            assertEquals(this.size, 1)

            this[2] = "2"
            assertEquals(this[1], null)
            assertEquals(this[2], "2")
            assertEquals(this.size, 1)
        }
    }

    @Test
    fun mapSizeTest0() {
        val map = sizeLimitedMap<Int, String>(0)
        map.synchronized {
            this[1] = "1"
            assertEquals(this[1], null)
            assertEquals(this.size, 0)
        }
    }

    @Test
    fun mapSizeTest2() {
        val map = sizeLimitedMap<Int, String>(2)
        map.synchronized {
            this[1] = "1"
            this[2] = "2"
            assertEquals(this[1], "1")
            assertEquals(this[2], "2")
            assertEquals(this[3], null)
            this[3] = "3"
            assertEquals(this[1], null)
            assertEquals(this[3], "3")
            assertEquals(this.size, 2)
        }
    }
}