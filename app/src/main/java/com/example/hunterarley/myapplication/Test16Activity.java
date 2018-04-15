package com.example.hunterarley.myapplication;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class Test16Activity extends AppCompatActivity {
    private TextView Tv;
    private Button BtnDate, BtnTime;
    private final int DATEDIALOG = 0;
    private final int TIMEDIALOG = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test16);
        findView();//获取控件对象
        setListener();//设置监听器
    }

    private void findView() {
        Tv = (TextView) findViewById(R.id.Tv);
        BtnDate = (Button) findViewById(R.id.BtnDate);
        BtnTime = (Button) findViewById(R.id.BtnTime);
    }

    private void setListener() {//设置BtnDate和BtnTime的监听器
        BtnDate.setOnClickListener(myListener);
        BtnTime.setOnClickListener(myListener);
    }

    View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.BtnDate:
                    showDialog(DATEDIALOG);
                    break;
                case R.id.BtnTime:
                    showDialog(TIMEDIALOG);
                    break;
                default:
                    break;
            }
        }
    };

    //当调用showDialog方法是系统的回调方法
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATEDIALOG:
                //定义DatePickerDialog，并进行初始化
                DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    //设置日期改变的监听器
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Tv.setText("year:" + year + "\nmonth:" + month + "\nday:" + dayOfMonth);
                    }
                }, 1993, 4, 18);
                return dpd;
            case TIMEDIALOG:
                //定义TimePickerDialog，并进行初始化
                TimePickerDialog tpd = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                    //设置时间改变的监听器
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Tv.setText(Tv.getText() + "\nhourOfDay:" + hourOfDay + "\nminute:" + minute);
                    }
                }, 12, 0, true);
                return tpd;
            default:
                break;
        }
        return super.onCreateDialog(id);
    }
}
