package xh.zero.knownews.leancloud

import android.app.Application
import com.avos.avoscloud.AVOSCloud

/**
 * Created by Bamboo on 2018/3/6.
 */

class LeanCloudApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AVOSCloud.initialize(this,"ls9L0FeBS0SYxcqqvwCuzKST-gzGzoHsz","LckBLqjznS7GReVpMcmuQyNG")
        AVOSCloud.setDebugLogEnabled(true)
    }
}
