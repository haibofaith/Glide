package com.simple.glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        /**
         * 写完这行代码，发生了一个很蛋疼的事，居然忘了加网络权限，三天不练手生
         * */
        img = (ImageView) findViewById(R.id.img);
        Glide.with(this).load("http://www.jcodecraeer.com/uploads/20150327/1427445293711143.png").error(R.mipmap.ic_launcher).into(img);
    }
}
