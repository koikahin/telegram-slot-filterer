package slotfilter

import slotfilter.Consts.DISALLOWED_PATTERNS
import slotfilter.Consts.PRIORITY_PATTERNS

private val DISALLOWED_REGEXES = DISALLOWED_PATTERNS.map { Regex(it, RegexOption.IGNORE_CASE) }
private val PRIORITY_REGEXES = PRIORITY_PATTERNS.map { Regex(it, RegexOption.IGNORE_CASE) }

fun String.matchesAny(regexes: List<Regex>) = regexes.any { it.containsMatchIn(this) }
fun String.matchesDisallowed() = matchesAny(DISALLOWED_REGEXES)
fun String.matchesPriority() = matchesAny(PRIORITY_REGEXES)

fun String.isPriority(): Boolean {
    return this.matchesPriority()
}

fun String.shouldFwd(): Boolean {
    return !this.matchesDisallowed()
}
