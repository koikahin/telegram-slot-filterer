@file:Suppress("ClassName")

package org.drinkless.tdlib.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AllowedMessagesKtTest {
    @Test
    fun allowedTest() {
        "NAa" iss allowed
        "NA" iss disallowed
        "nA" iss disallowed
        " na" iss disallowed
        "ana" iss allowed
        "n a" iss allowed
        "na all" iss disallowed
        ".na" iss disallowed
        "not av" iss allowed
        "not available" iss disallowed
        "whynot available" iss allowed
        "none available" iss disallowed
        "no slots available" iss disallowed
        "ch, del no slots available" iss disallowed
        "none available in che" iss disallowed
        "anone avail" iss allowed
        "make money" iss disallowed
        "get rich mining crypto" iss disallowed
        "i earned $400" iss disallowed
        "make $$$" iss disallowed
        "make $" iss allowed
    }

    @Test
    fun priorityTest() {
        "bulk" iss priority
        "bulk available" iss priority
        "Bulk Available" iss priority
        "opened up in bulK" iss priority
        "slots available in bulk" iss priority
        "several slots are available" iss priority
        "many slots are available" iss priority
        "many slots are available in ch" iss priority
        "several slots available in ch" iss priority
        "several slots available in ch" iss priority
        "severalare available" iss not_priority
    }
}


object disallowed
object allowed
object priority
object not_priority

private infix fun String.iss(obj: Any) = when(obj) {
    is disallowed -> this.matchesDisallowed() shouldBe true
    is allowed -> this.matchesDisallowed() shouldBe false
    is priority -> this.matchesPriority() shouldBe true
    is not_priority -> this.matchesPriority() shouldBe false
    else -> throw Exception("Invalid")
}

private infix fun Any.shouldBe(expected: Any) = assertEquals(expected, this)
