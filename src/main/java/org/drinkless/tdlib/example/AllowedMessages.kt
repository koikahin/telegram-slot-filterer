package org.drinkless.tdlib.example


private val DISALLOWED = arrayOf(
    "\\bNA\\b",
    "\\bNOT AVAIL",
    "\\bnone avail",
    "\\bno slots avail",
    "\\bcrypto",
    "\\bmoney\\b",
    "\\$[0-9]+",
    "\\$\\$+",
    "@AwesomeAdmin_US",
    "@blackwidow",
    "http://",
    "https://",
    "ping me",
    "contact me",
    "fake",
    "money"
)

private val PRIORITY = arrayOf(
    "\\bbulk\\b",
    "\\b(several|many|lot).*(slot|avail|opening|booking)"
)

private val DISALLOWED_REGEXES = DISALLOWED.map { Regex(it, RegexOption.IGNORE_CASE) }
private val PRIORITY_REGEXES = PRIORITY.map { Regex(it, RegexOption.IGNORE_CASE) }

fun String.matchesAny(regexes: List<Regex>) = regexes.any { it.containsMatchIn(this) }
fun String.matchesDisallowed() = matchesAny(DISALLOWED_REGEXES)
fun String.matchesPriority() = matchesAny(PRIORITY_REGEXES)

fun String.shouldFwdPriority(): Boolean {
    return this.matchesPriority()
}

fun String.shouldFwd(): Boolean {
    return !this.matchesDisallowed()
}

//
//fun String?.shouldFwdPriority(): Boolean {
//    if (this == null) return false
//    return this.matches(Regex("^.*\\bbulk\\b.*$", RegexOption.IGNORE_CASE))
//}
//
//fun String?.shouldFwd(): Boolean {
//    if (this == null) return true
//    return !(this.matches(Regex("^.*\\bNA\\b.*$", RegexOption.IGNORE_CASE))
//            || this.matches(Regex("^.*NOT AVAIL.*$", RegexOption.IGNORE_CASE)))
//}
//
