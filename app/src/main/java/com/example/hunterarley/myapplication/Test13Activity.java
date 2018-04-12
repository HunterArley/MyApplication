package com.example.hunterarley.myapplication;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Test13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test13);

        //定义ProgressDialog对象
        ProgressDialog pd = new ProgressDialog(this);
        //设置pd的标题信息
        pd.setTitle("程序加载中......");
        //调用show方法显示
        pd.show();

    }
}
