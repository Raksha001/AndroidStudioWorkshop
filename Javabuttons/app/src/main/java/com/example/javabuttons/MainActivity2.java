package com.example.javabuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t;
    String s1;//ctrl d copies current line
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = findViewById(R.id.textView3);

        s1 = getIntent().getStringExtra("abc");//user gets info frm intent using a key

        t.setText(s1);//displays data frm 1st screen
    }
}