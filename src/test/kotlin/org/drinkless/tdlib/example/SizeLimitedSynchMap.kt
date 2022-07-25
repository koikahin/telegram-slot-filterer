package org.drinkless.tdlib.example

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SizeLimitedSynchMap {
    @Test
    fun mapSizeTest1() {
        val map = sizeLimitedSynchronizedMap<Int, String>(1)
        map[1] = "1"
        assertEquals(map[1], "1")
        assertEquals(map.size, 1)

        map[2] = "2"
        assertEquals(map[1], null)
        assertEquals(map[2], "2")
        assertEquals(map.size, 1)
    }

    @Test
    fun mapSizeTest0() {
        val map = sizeLimitedSynchronizedMap<Int, String>(0)
        map[1] = "1"
        assertEquals(map[1], null)
        assertEquals(map.size, 0)
    }

    @Test
    fun mapSizeTest2() {
        val map = sizeLimitedSynchronizedMap<Int, String>(2)
        map[1] = "1"
        map[2] = "2"
        assertEquals(map[1], "1")
        assertEquals(map[2], "2")
        assertEquals(map[3], null)
        map[3] = "3"
        assertEquals(map[1], null)
        assertEquals(map[3], "3")
        assertEquals(map.size, 2)
    }
}