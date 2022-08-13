package slotfilter

import slotfilter.Consts.DISALLOWED_PATTERNS
import slotfilter.Consts.FORCE_ALLOW_PATTERNS
import slotfilter.Consts.PRIORITY_PATTERNS

private val FORCE_ALLOW_REGEXES = FORCE_ALLOW_PATTERNS.map { Regex(it, RegexOption.IGNORE_CASE) }
private val DISALLOWED_REGEXES = DISALLOWED_PATTERNS.map { Regex(it, RegexOption.IGNORE_CASE) }
private val PRIORITY_REGEXES = PRIORITY_PATTERNS.map { Regex(it, RegexOption.IGNORE_CASE) }

fun String.matchesAny(regexes: List<Regex>) = regexes.any { it.containsMatchIn(this) }
private fun String.matchesForceAllowed() = matchesAny(FORCE_ALLOW_REGEXES)
private fun String.matchesDisallowed() = matchesAny(DISALLOWED_REGEXES)
private fun String.matchesPriority() = matchesAny(PRIORITY_REGEXES)

fun String.isPriority(): Boolean {
    return this.matchesPriority()
}

fun String.shouldFwd(): Boolean {
    return this.matchesForceAllowed() || !this.matchesDisallowed()
}
