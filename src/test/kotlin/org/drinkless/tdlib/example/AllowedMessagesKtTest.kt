@file:Suppress("ClassName")

package org.drinkless.tdlib.example

import slotfilter.matchesDisallowed
import slotfilter.matchesPriority
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AllowedMessagesKtTest {
    @Test
    fun allowedTest() {
        "NAa" shouldBe allowed
        "NA" shouldBe disallowed
        "nA" shouldBe disallowed
        " na" shouldBe disallowed
        "ana" shouldBe allowed
        "n a" shouldBe allowed
        "na all" shouldBe disallowed
        ".na" shouldBe disallowed
        "not av" shouldBe allowed
        "not available" shouldBe disallowed
        "whynot available" shouldBe allowed
        "none available" shouldBe disallowed
        "no slots available" shouldBe disallowed
        "ch, del no slots available" shouldBe disallowed
        "none available in che" shouldBe disallowed
        "anone avail" shouldBe allowed
        "make money" shouldBe disallowed
        "get rich mining crypto" shouldBe disallowed
        "i earned $400" shouldBe disallowed
        "make $$$" shouldBe disallowed
        "make $" shouldBe allowed

        "@AwesomeAdmin_US" shouldBe disallowed
        "@blackwidow" shouldBe disallowed
        "blackwidow" shouldBe allowed
        "AwesomeAdmin_US" shouldBe allowed
        "http" shouldBe allowed
        "http:" shouldBe allowed
        "http://" shouldBe disallowed
        "httpd" shouldBe allowed
        "https://" shouldBe disallowed
        "https" shouldBe allowed
        "PINg me for !" shouldBe disallowed
        "this is fake" shouldBe disallowed
        "contact me at 92832983" shouldBe disallowed
        "Pattern worked: Fresh H1B Dropbox Mumbai in Nov 2023" shouldBe allowed
        "making money" shouldBe disallowed
        "make money by" shouldBe disallowed
        "make a lot of money" shouldBe disallowed
        "like making a lot of money" shouldBe disallowed
    }

    @Test
    fun priorityTest() {
        "bulk" shouldBe priority
        "bulk available" shouldBe priority
        "Bulk Available" shouldBe priority
        "opened up in bulK" shouldBe priority
        "slots available in bulk" shouldBe priority
        "several slots are available" shouldBe priority
        "many slots are available" shouldBe priority
        "many slots are available in ch" shouldBe priority
        "several slots available in ch" shouldBe priority
        "several slots available in ch" shouldBe priority
        "severalare available" shouldBe priority
        "saw many openings" shouldBe priority
        "several" shouldBe not_priority
        "openings" shouldBe not_priority
    }
}


object disallowed
object allowed
object priority
object not_priority

private infix fun String.shouldBe(obj: Any) = when(obj) {
    is disallowed -> this.matchesDisallowed() shouldBe true
    is allowed -> this.matchesDisallowed() shouldBe false
    is priority -> this.matchesPriority() shouldBe true
    is not_priority -> this.matchesPriority() shouldBe false
    else -> throw Exception("Invalid")
}

private infix fun Any.shouldBe(expected: Any) = assertEquals(expected, this)
