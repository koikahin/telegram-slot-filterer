package slotfilter

import org.drinkless.tdlib.TdApi.Message
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

object Formatter {
    private val timeFmtPrint = DateTimeFormatter.ofPattern("MMM dd hh:mm:ss a")
    private val timeFmtFwd = DateTimeFormatter.ofPattern("hh:mm:ss")
    private val timezone = ZoneId.of("America/New_York")

    fun formatNewMessageForPrint(message: Message, shouldFwd: Boolean, isPriority: Boolean): String {
        val msgText = message.content.text()
        val msgTime = message.time
        val now = Instant.now()
        val delay = Duration.between(msgTime, now).seconds

        return (if (isPriority) "**" else "  ") +
                (if (shouldFwd) " fwd  | " else "      | ") +
                timeFmtPrint.format(now.atZone(timezone)) +
                " - " + delay.toString().padStart(3) +
                " | $msgText"
    }

    fun formatTimeForFwd(time: Instant): String {
        return timeFmtFwd.format(time.atZone(timezone))
    }

    fun formatDeletedForPrint(str: String): String {
        return "deleted | " +
                timeFmtPrint.format(Instant.now().atZone(timezone)) +
                "      " +
                " | $str"
    }

    fun formatPinnedForPrint(str: String): String {
        return "    pin | " +
                timeFmtPrint.format(Instant.now().atZone(timezone)) +
                "      " +
                " | $str"
    }

    fun formatUnpinnedForPrint(str: String): String {
        return "  unpin | " +
                timeFmtPrint.format(Instant.now().atZone(timezone)) +
                "      " +
                " | $str"
    }
}
