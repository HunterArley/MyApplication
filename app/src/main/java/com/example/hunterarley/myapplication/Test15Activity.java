package com.example.hunterarley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class Test15Activity extends AppCompatActivity {
    private TextView textView;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test15);
        findView();//获取控件对象
        setListener();//设置TimePicker的监听器
    }

    private void findView() {
        textView = (TextView) findViewById(R.id.tvTime);
        timePicker = (TimePicker) findViewById(R.id.Tp);
    }

    private void setListener() {
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText("hour:"+hourOfDay+"\nminute:"+minute);
            }
        });
    }
}
