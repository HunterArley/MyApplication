package com.example.hunterarley.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.widget.TextView;

import org.xml.sax.XMLReader;

public class MainActivity extends AppCompatActivity {
    private TextView Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv=(TextView) findViewById(R.id.Tv);
//        Tv.setText("I am an Android Developer");

        /*String string="<font color=\"#FF0000\">我有一个梦想</font><br>"
                +"<font color=\"#00FF00\">成为一名优秀的</font><br>"
                +"<font color=\"#0000FF\">Android开发者</font><br>"
                +"<font color=\"#0F0FFFF\">制作属于自己的</font><br>"
                +"<font color=\"#0F0F0F\">应用......</font>";*/

        String string="<h1>测试图片</h1><p><img src="+R.mipmap.ic_launcher+"></p><p>tag是<hello></hello></p>";
        Tv.setText(Html.fromHtml(string,imageGetter,tagHandler));
    }

    Html.ImageGetter imageGetter=new Html.ImageGetter() {//定义ImageGetter对象
        @Override
        public Drawable getDrawable(String source) {//当遇到img标签时调用此回调方法
            int id=Integer.parseInt(source);
            Drawable drawable=getResources().getDrawable(id);
            drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());
            return drawable;
        }
    };

    Html.TagHandler tagHandler=new Html.TagHandler() {
        @Override
        public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
            if (opening&&tag.equals("hello")) {
                output.append("hello taghandler tag");
            }
        }
    };
}
