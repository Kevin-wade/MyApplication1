package com.jnu.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MainActivity.java是整个安卓工程的入口，
//其中，里面的protected void onCreate(Bundle savedInstanceState) {}方法中的setContentView(R.layout.activity_main);
// 方法指明，要加载res文件下的activity_main.xml的布局文件。之所以可以这样搞。是因为它有一个Eclipse会自动更新的gen文件夹。gen文件夹的R.java文件，会随你的xml更新而更新。
        textViewHelloWorld = this.findViewById(R.id.text_hello_world);
        if(null!=textViewHelloWorld){
            textViewHelloWorld.setText("test");
        }
        else{
            Log.i("MainActivity","the control is null");
        }
        setContentView(R.layout.activity_main);//这个得在29行前面才不会是null，否则报错啦

        textViewHelloWorld = this.findViewById(R.id.text_hello_world);//第一种
        String strHelloWorld=textViewHelloWorld.getText().toString();
        Log.i("MainActivity",strHelloWorld);

        textViewHelloWorld.setText("test");
        textViewHelloWorld.setText(R.string.string_hello_world);//第二种 有get肯定有set

        String strHelloWorld2=this.getResources().getText(R.string.string_hello_world).toString();//第三种
//Log.i("MainActivity",strHelloWorld2);//alt+enter添加import
        textViewHelloWorld.setText(strHelloWorld2);
    }
}