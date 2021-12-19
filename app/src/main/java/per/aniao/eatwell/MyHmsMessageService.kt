package per.aniao.eatwell

import android.content.Intent
import android.os.Bundle
import android.os.IBinder
import com.huawei.hms.push.HmsMessageService
import com.huawei.hms.push.RemoteMessage
import com.huawei.hms.ui.SafeIntent
import java.lang.Exception

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */
class MyHmsMessageService : HmsMessageService() {
    override fun onNewToken(p0: String?, p1: Bundle?) {
        super.onNewToken(p0, p1)
        println("HW PUSH TOKEN: ->$p0")
        println("HW PUSH Bundle: ->$p1")
    }

    override fun onNewToken(p0: String?) {
        super.onNewToken(p0)
        println("HW PUSH TOKEN: ->$p0")
    }

    override fun onStartCommand(p0: Intent?, p1: Int, p2: Int): Int {
        return super.onStartCommand(p0, p1, p2)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return super.onBind(p0)
    }

    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        println("HW RemoteMessage: ->$p0")
    }

    override fun onDeletedMessages() {
        super.onDeletedMessages()
    }

    override fun onMessageSent(p0: String?) {
        super.onMessageSent(p0)
    }

    override fun onMessageDelivered(p0: String?, p1: Exception?) {
        super.onMessageDelivered(p0, p1)
        println("HW onMessageDelivered: ->$p0")
        println("HW onMessageDelivered Exception: ->$p1")
    }

    override fun onSendError(p0: String?, p1: Exception?) {
        super.onSendError(p0, p1)
        println("HW onSendError: ->$p0")
        println("HW onSendError Exception: ->$p1")
    }

    override fun onTokenError(p0: Exception?) {
        super.onTokenError(p0)
        println("HW onTokenError Exception: ->$p0")
    }

    override fun onTokenError(p0: Exception?, p1: Bundle?) {
        super.onTokenError(p0, p1)
        println("HW onTokenError Exception: ->$p0")
    }

    override fun handleIntentMessage(p0: SafeIntent?) {
        super.handleIntentMessage(p0)
    }

    override fun doMsgReceived(p0: Intent?) {
        super.doMsgReceived(p0)
        println("HW doMsgReceived Exception: ->$p0")
    }
}