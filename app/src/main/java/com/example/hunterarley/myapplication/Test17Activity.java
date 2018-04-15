package com.example.hunterarley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test17);

        //在Android中得倒系统时间的方法
        //定义获取的时间格式
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        //通过系统的时间戳得到date对象
        Date curDate = new Date(System.currentTimeMillis());
        //格式化Date对象，改成我们要求的格式
        String string = formatter.format(curDate);
    }
}
