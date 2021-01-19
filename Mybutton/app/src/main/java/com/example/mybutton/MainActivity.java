package com.example.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b; //declaration above main method
    Button d;
    EditText e;
    String s;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        d = findViewById(R.id.button2);
        e = findViewById(R.id.editTextTextPersonName);
        t = findViewById(R.id.textView);
        
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=e.getText().toString(); //string is declared
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
                t.setText(s);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Mybutton1.class);//classnm obj_name = new classnm(); obj for a class intent predefined class for switching btw screens
                startActivity(i);
                Toast.makeText(MainActivity.this,"Signed in!I'm developer",Toast.LENGTH_SHORT).show();
            }
        });//initial inside main method
    }
}
/*ctrl shift / - to comment*/