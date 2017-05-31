package jiaxinjie.com.neicun;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * 姓名：贾新杰
 * 时间：2017/5/31.
 * 邮箱：1205242073@qq.com
 * 备注：
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化内存优化工具
        LeakCanary.install(this);
    }
}
