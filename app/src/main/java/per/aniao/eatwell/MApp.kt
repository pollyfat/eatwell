package per.aniao.eatwell

import android.app.Application
import android.widget.Toast
import com.huawei.agconnect.AGConnectOptionsBuilder
import com.huawei.hms.aaid.HmsInstanceId
import dagger.hilt.android.HiltAndroidApp
import kotlin.concurrent.thread

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */
@HiltAndroidApp
class MApp: Application() {
    override fun onCreate() {
        super.onCreate()

        thread {
            val appId = AGConnectOptionsBuilder().build(this).getString("client/app_id")
            val pushToken = HmsInstanceId.getInstance(this).getToken(appId, "HCM")
            println("HW GEN PUSH TOKEN: $pushToken")
            Toast.makeText(this, pushToken, Toast.LENGTH_SHORT).show()
        }
    }
}