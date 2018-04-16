package com.example.hunterarley.myapplication;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Test18Activity extends AppCompatActivity {
    private Chronometer chronometer;
    private Button btnStart, btnStop, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test18);
        findView();//获取控件对象
        setListener();//设置Button的监听器
    }

    private void findView() {
        chronometer = (Chronometer) findViewById(R.id.Chron);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnReset = (Button) findViewById(R.id.btnReset);
    }

    private void setListener() {
        btnStart.setOnClickListener(myListener);
        btnStop.setOnClickListener(myListener);
        btnReset.setOnClickListener(myListener);
    }

    View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnStart:
                    //开始计时
                    chronometer.start();
                    break;
                case R.id.btnStop:
                    //停止计时
                    chronometer.stop();
                    break;
                case R.id.btnReset:
                    //重置计时器
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    break;
                default:
                    break;
            }
        }
    };
}
