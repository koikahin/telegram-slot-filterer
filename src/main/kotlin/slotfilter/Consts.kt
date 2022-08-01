package slotfilter

object Consts {
//parameters.apiId = 94575
//parameters.apiHash = "a3406de8d171bb422bb6ddf3bbd800e2"

    const val API_ID = 13042228
    const val API_HASH = "5fbacaa51fd4ded26972fba200bd16e7"

    const val CHAT_TELEGRAM: Long = 777000
    const val CHAT_SELF: Long = 5575012853

    const val CHAT_SRI: Long = 5246836860

    const val CHAT_ALL_SLOTS: Long = -1001371184682
    const val CHAT_MOCKED_ALL_SLOTS: Long = -1001761172272

    const val CHAT_FILTERED_SLOTS: Long = -1001702710052

    val DISALLOWED_PATTERNS = arrayOf(
        """\bNA\b""",
        """\bNA\b""",
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
}
