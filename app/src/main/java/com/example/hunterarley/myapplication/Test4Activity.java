package com.example.hunterarley.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4Activity extends AppCompatActivity {
    private EditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4);
        etPhone = (EditText) findViewById(R.id.etPhone);
        etPhone.addTextChangedListener(new TextWatcher() {
            //文字改变前的回调方法
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            //文字改变时的回调方法
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            //文字改变后的回调方法
            @Override
            public void afterTextChanged(Editable s) {
                //得到Editable对象的string
                String phoneStr = s.toString();
                //判断输入的内容是否为phone
                boolean b = isPhoneNumber(phoneStr);
                if (b) {
                    //b为true时，设置etPhone的字体颜色为绿色
                    etPhone.setTextColor(Color.rgb(0, 255, 0));
                } else {
                    //b为false时，设置etPhone的字体颜色为红色
                    etPhone.setTextColor(Color.rgb(255, 0, 0));
                }

            }
        });
    }

    //判断参数字符串是否为电话格式
    public boolean isPhoneNumber(String string) {
        //定义电话格式的正则表达式
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (string.length() != 11) {
            Toast.makeText(this, "手机号应为11位数", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            //设定查看模式
            Pattern pattern = Pattern.compile(regex);
            //判断string是否匹配，返回匹配结果
            Matcher matcher = pattern.matcher(string);
            return matcher.matches();
        }
    }
}
