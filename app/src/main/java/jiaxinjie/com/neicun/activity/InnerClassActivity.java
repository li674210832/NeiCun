package jiaxinjie.com.neicun.activity;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jiaxinjie.com.neicun.R;
import jiaxinjie.com.neicun.UserUtils;

public class InnerClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_class);
        //Demo();
        demo2();
    }
    private void Demo() {
        new Thread(){
            @Override
            public void run() {
                SystemClock.sleep(100000);
            }
        }.start();
    }
    private void demo2() {
        User user=new User("yyy");
        UserUtils.setUser(user);
    }

    //B.定义一个内部类
    public  static class User{
        private String name;

        public User(String name) {
            this.name = name;
        }
    }
}
