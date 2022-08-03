package slotfilter

import org.drinkless.tdlib.TdApi.Message
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

object Formatter {
    private val timeFmtPrint = DateTimeFormatter.ofPattern("MMM dd hh:mm:ss a")
    private val timeFmtFwd = DateTimeFormatter.ofPattern("hh:mm:ss")

    fun formatNewMessageForPrint(message: Message, shouldFwd: Boolean, isPriority: Boolean): String {
        val msgText = message.content.text()
        val msgTime = message.time
        val now = Instant.now()
        val delay = Duration.between(msgTime, now).seconds

        return (if (isPriority) "**" else "  ") +
                (if (shouldFwd) " fwd  | " else "      | ") +
                timeFmtPrint.format(now.atZone(ZoneId.systemDefault())) +
                " - " + delay.toString().padStart(3) +
                " | $msgText"
    }

    fun formatTimeForFwd(time: Instant): String {
        return timeFmtFwd.format(time.atZone(ZoneId.systemDefault()))
    }

    fun formatDeletedForPrint(str: String): String {
        return "deleted | " +
                timeFmtPrint.format(Instant.now().atZone(ZoneId.systemDefault())) +
                "      " +
                " | $str"
    }
}
