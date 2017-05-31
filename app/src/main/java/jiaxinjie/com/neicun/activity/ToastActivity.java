package jiaxinjie.com.neicun.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Date;

import jiaxinjie.com.neicun.R;

/**
 * 姓名：贾新杰
 * 时间：2017/5/31.
 * 邮箱：1205242073@qq.com
 * 备注：
 */
public class ToastActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        initView();
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:

                //Toast.makeText(this, ""+new Date().getTime(), Toast.LENGTH_SHORT).show();
                ToastUtils.showToast(this,"单例的吐司" +new Date().getTime());

                break;
        }
    }
}
