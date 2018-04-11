package com.example.hunterarley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Test9Activity extends AppCompatActivity {
    private RadioGroup rgSubject1, rgSubject2, rgSubject3;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test9);
        findView();//获取控件
        setListener();//设置监听器
    }

    private void findView() {
        rgSubject1 = (RadioGroup) findViewById(R.id.rgSubject1);
        rgSubject2 = (RadioGroup) findViewById(R.id.rgSubject2);
        rgSubject3 = (RadioGroup) findViewById(R.id.rgSubject3);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    private void setListener() {
        rgSubject1.setOnCheckedChangeListener(mylistener);
        rgSubject2.setOnCheckedChangeListener(mylistener);
        rgSubject3.setOnCheckedChangeListener(mylistener);
    }

    RadioGroup.OnCheckedChangeListener mylistener = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            //判断是否三组题目都进行了选择
            if (rgSubject1.getCheckedRadioButtonId() != -1
                    && rgSubject2.getCheckedRadioButtonId() != -1
                    && rgSubject3.getCheckedRadioButtonId() != -1) {
                int score = 0;//记录用户的分数
                //加上第一题的选择得分
                switch (rgSubject1.getCheckedRadioButtonId()) {
                    case R.id.rbSubjectOpt1:
                        score += 3;
                        break;
                    case R.id.rbSubjectOpt2:
                        score += 2;
                        break;
                    case R.id.rbSubjectOpt3:
                        score += 1;
                        break;
                    default:
                        break;
                }

                //加上第二题的选择得分
                switch (rgSubject2.getCheckedRadioButtonId()) {
                    case R.id.rbSubject2Opt1:
                        score += 3;
                        break;
                    case R.id.rbSubject2Opt2:
                        score += 2;
                        break;
                    case R.id.rbSubject2Opt3:
                        score += 1;
                        break;
                    default:
                        break;
                }

                //加上第三题的选择得分
                switch (rgSubject3.getCheckedRadioButtonId()) {
                    case R.id.rbSubject3Opt1:
                        score += 3;
                        break;
                    case R.id.rbSubject3Opt2:
                        score += 2;
                        break;
                    case R.id.rbSubject3Opt3:
                        score += 1;
                        break;
                    default:
                        break;
                }

                //对于用户的得分给出评价结果
                if (score >= 8) {
                    tvResult.setText("您是IT达人！");
                } else if (score >= 4) {
                    tvResult.setText("您是一般电脑用户！");
                } else {
                    tvResult.setText("您需要提高电脑知识哦！");
                }
            }
        }
    };
}
