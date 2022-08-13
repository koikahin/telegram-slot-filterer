package slotfilter

object Consts {
//parameters.apiId = 94575
//parameters.apiHash = "a3406de8d171bb422bb6ddf3bbd800e2"

    const val API_ID = 13042228
    const val API_HASH = "5fbacaa51fd4ded26972fba200bd16e7"

    val CHAT_TELEGRAM: Pair<Int, String> = 777000 to "telegram"
    val CHAT_SELF: Pair<Long, String> = 5575012853 to "self"
    val CHAT_SRI: Pair<Long, String> = 5246836860 to "sri"
    val CHAT_ALL_SLOTS: Pair<Long, String> = -1001371184682 to "all"
    val CHAT_MOCKED_ALL_SLOTS: Pair<Long, String> = -1001761172272 to "mocked"

    val CHAT_PRIORITY_SLOTS: Pair<Long, String> = -1001631626725 to "priority"
    val CHAT_FILTERED_SLOTS: Pair<Long, String> = -1001702710052 to "filtered"

    val FORCE_ALLOW_PATTERNS = arrayOf(
        """\bToday.*Pattern\b.*effective 12.*"""
    )

    val DISALLOWED_PATTERNS = arrayOf(
        """\bNA\b""",
        """\bno all""",
        """\bNOT AVAIL""",
        """\bnone avail""",
        """\bno slots avail""",
        """\bcrypto""",
        """\bmoney\b""",
        """\$[0-9]+""",
        """\$\$+""",
        """@AwesomeAdmin_US""",
        """@blackwidow""",
        """http://""",
        """https://""",
        """ping me""",
        """contact me""",
        """fake""",
        """money"""
    )

    val PRIORITY_PATTERNS = arrayOf(
        """\bbulk\b""",
        """\b(several|many|lot).*(slot|avail|opening|booking)"""
    )

    const val MAP_SIZE = 10000
}
