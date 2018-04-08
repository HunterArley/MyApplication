package com.example.hunterarley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Test1Activity extends AppCompatActivity {
    private TextView Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Tv=(TextView) findViewById(R.id.Tv);
        Tv.setText("I am an Android Developer");
    }
}
