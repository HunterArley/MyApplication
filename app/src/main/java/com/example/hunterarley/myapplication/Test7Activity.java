package com.example.hunterarley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Test7Activity extends AppCompatActivity {

    private CheckBox cbBasketball, cbPingbangball, cbFootball;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test7);
        findView();//获取页面中的控件
        setListener();//设置控件的监听器
    }

    private void findView() {
        cbBasketball = (CheckBox) findViewById(R.id.cbBasketball);
        cbPingbangball = (CheckBox) findViewById(R.id.cbPingbangball);
        cbFootball = (CheckBox) findViewById(R.id.cbFootball);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    private void setListener() {
        cbBasketball.setOnCheckedChangeListener(myCheckChangeListener);
        cbPingbangball.setOnCheckedChangeListener(myCheckChangeListener);
        cbFootball.setOnCheckedChangeListener(myCheckChangeListener);
    }

    CompoundButton.OnCheckedChangeListener myCheckChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            //设置TextView的内容显示CheckBox的选择结果
            setText();
        }
    };

    private void setText() {
        String string;
        tvResult.setText("");//清空extView的内容
        //如果cbBasketball被选中，则加入tvResult内容显示
        if (cbBasketball.isChecked()) {
            string = tvResult.getText().toString() + cbBasketball.getText().toString() + ",";
            tvResult.setText(string);
        }
        //如果cbPingbangball被选中，则加入tvResult内容显示
        if (cbPingbangball.isChecked()) {
            string = tvResult.getText().toString() + cbPingbangball.getText().toString() + ",";
            tvResult.setText(string);
        }
        //如果cbFootball被选中，则加入tvResult内容显示
        if (cbFootball.isChecked()) {
            string=tvResult.getText().toString()+cbFootball.getText().toString();
            tvResult.setText(string);
        }
    }
}
