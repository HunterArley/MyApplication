package com.example.hunterarley.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button BtnTest1,BtnTest2,BtnTest3,BtnTest4,BtnTest5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnTest1=(Button) findViewById(R.id.btnTest1);
        BtnTest1.setOnClickListener(this);
        BtnTest2=(Button) findViewById(R.id.btnTest2);
        BtnTest2.setOnClickListener(this);
        BtnTest3=(Button) findViewById(R.id.btnTest3);
        BtnTest3.setOnClickListener(this);
        BtnTest4=(Button) findViewById(R.id.btnTest4);
        BtnTest4.setOnClickListener(this);
        BtnTest5=(Button) findViewById(R.id.btnTest5);
        BtnTest5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTest1:
                Intent intent1=new Intent(this, Test1Activity.class);
                startActivity(intent1);
                break;
            case R.id.btnTest2:
                Intent intent2=new Intent(this, Test2Activity.class);
                startActivity(intent2);
                break;
            case R.id.btnTest3:
                Intent intent3=new Intent(this, Test3Activity.class);
                startActivity(intent3);
                break;
            case R.id.btnTest4:
                Intent intent4=new Intent(this, Test4Activity.class);
                startActivity(intent4);
                break;
            case R.id.btnTest5:
                Intent intent5=new Intent(this, Test5Activity.class);
                startActivity(intent5);
                break;
        }
    }
}
