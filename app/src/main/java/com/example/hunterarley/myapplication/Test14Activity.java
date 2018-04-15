package com.example.hunterarley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class Test14Activity extends AppCompatActivity {
    private TextView textView;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test14);
        findView();//获取控件对象
        setListener();//设置datePicker的监听器
    }

    private void findView() {
        textView = (TextView) findViewById(R.id.TvDate);
        datePicker = (DatePicker) findViewById(R.id.Dp);
    }

    private void setListener() {
        //初始化DatePicker对象，并设置日期改变的监听器
        datePicker.init(1993, 4, 18, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                //在TextView中显示获取到的年月日的值
                textView.setText("Year:" + year +
                        "\nMonth:" + (monthOfYear+ 1) +
                        "\nDay:"+dayOfMonth);

                Toast.makeText(Test14Activity.this, "Year:" + year +
                        "Month:" + (monthOfYear+ 1) +
                        "Day:"+dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
