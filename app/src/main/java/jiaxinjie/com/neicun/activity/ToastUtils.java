package jiaxinjie.com.neicun.activity;

import android.content.Context;
import android.widget.Toast;

/**
 * 姓名：贾新杰
 * 时间：2017/5/31.
 * 邮箱：1205242073@qq.com
 * 备注：
 */
public class ToastUtils {
    private static Toast sToast;

    public static void showToast(Context context, String msg) {

        if (sToast == null){
            sToast =Toast.makeText(context,msg, Toast.LENGTH_SHORT);
        }
        //重新设置Toast弹的文本
        sToast.setText(msg);
        sToast.show();
    }

}

