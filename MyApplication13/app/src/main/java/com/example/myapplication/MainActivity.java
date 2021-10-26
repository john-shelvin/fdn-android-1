package com.example.myapplication;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) this.findViewById(R.id.button1);
        Button btn2 = (Button) this.findViewById((R.id.button2));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                setTitle("button1 被用户点击了");
                Log.i("widgetDemo", "button1 被用户点击了。");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                long sysTime = System.currentTimeMillis();
                setTitle((String) DateFormat.format("hh:mm:ss", sysTime));
                Log.i("widgetDemo", (String) DateFormat.format("hh:mm:ss", sysTime));
            }
        });
    }
}