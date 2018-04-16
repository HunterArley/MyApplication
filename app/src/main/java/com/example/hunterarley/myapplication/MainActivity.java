package com.example.hunterarley.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button BtnTest1,BtnTest2,BtnTest3,BtnTest4,BtnTest5,
            BtnTest6,BtnTest7,BtnTest8,BtnTest9,BtnTest10,
            BtnTest11,BtnTest12,BtnTest13,BtnTest14,BtnTest15,
            BtnTest16,BtnTest17,BtnTest18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
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
        BtnTest6=(Button) findViewById(R.id.btnTest6);
        BtnTest6.setOnClickListener(this);
        BtnTest7=(Button) findViewById(R.id.btnTest7);
        BtnTest7.setOnClickListener(this);
        BtnTest8=(Button) findViewById(R.id.btnTest8);
        BtnTest8.setOnClickListener(this);
        BtnTest9=(Button) findViewById(R.id.btnTest9);
        BtnTest9.setOnClickListener(this);
        BtnTest10=(Button) findViewById(R.id.btnTest10);
        BtnTest10.setOnClickListener(this);
        BtnTest11=(Button) findViewById(R.id.btnTest11);
        BtnTest11.setOnClickListener(this);
        BtnTest12=(Button) findViewById(R.id.btnTest12);
        BtnTest12.setOnClickListener(this);
        BtnTest13=(Button) findViewById(R.id.btnTest13);
        BtnTest13.setOnClickListener(this);
        BtnTest14=(Button) findViewById(R.id.btnTest14);
        BtnTest14.setOnClickListener(this);
        BtnTest15=(Button) findViewById(R.id.btnTest15);
        BtnTest15.setOnClickListener(this);
        BtnTest16=(Button) findViewById(R.id.btnTest16);
        BtnTest16.setOnClickListener(this);
        BtnTest17=(Button) findViewById(R.id.btnTest17);
        BtnTest17.setOnClickListener(this);
        BtnTest18=(Button) findViewById(R.id.btnTest18);
        BtnTest18.setOnClickListener(this);
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
            case R.id.btnTest6:
                Intent intent6=new Intent(this, Test6Activity.class);
                startActivity(intent6);
                break;
            case R.id.btnTest7:
                Intent intent7=new Intent(this, Test7Activity.class);
                startActivity(intent7);
                break;
            case R.id.btnTest8:
                Intent intent8=new Intent(this, Test8Activity.class);
                startActivity(intent8);
                break;
            case R.id.btnTest9:
                Intent intent9=new Intent(this, Test9Activity.class);
                startActivity(intent9);
                break;
            case R.id.btnTest10:
                Intent intent10=new Intent(this, Test10Activity.class);
                startActivity(intent10);
                break;
            case R.id.btnTest11:
                Intent intent11=new Intent(this, Test11Activity.class);
                startActivity(intent11);
                break;
            case R.id.btnTest12:
                Intent intent12=new Intent(this, Test12Activity.class);
                startActivity(intent12);
                break;
            case R.id.btnTest13:
                Intent intent13=new Intent(this, Test13Activity.class);
                startActivity(intent13);
                break;
            case R.id.btnTest14:
                Intent intent14=new Intent(this, Test14Activity.class);
                startActivity(intent14);
                break;
            case R.id.btnTest15:
                Intent intent15=new Intent(this, Test15Activity.class);
                startActivity(intent15);
                break;
            case R.id.btnTest16:
                Intent intent16=new Intent(this, Test16Activity.class);
                startActivity(intent16);
                break;
            case R.id.btnTest17:
                Intent intent17=new Intent(this, Test17Activity.class);
                startActivity(intent17);
                break;
            case R.id.btnTest18:
                Intent intent18=new Intent(this, Test18Activity.class);
                startActivity(intent18);
                break;
        }
    }
}
