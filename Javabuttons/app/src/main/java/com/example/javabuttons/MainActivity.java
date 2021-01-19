package com.example.javabuttons;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button t,tv,go;
    EditText n,e,m;
    String s,st,str;
    TextView me,id,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.button);
        tv =findViewById(R.id.button1);
        go =findViewById(R.id.button2);
        n = findViewById(R.id.editTextTextPersonName);
        e = findViewById(R.id.editTextTextPersonName2);
        m = findViewById(R.id.editTextTextPersonName3);
        me = findViewById(R.id.textView);
        id = findViewById(R.id.textView1);
        no = findViewById(R.id.textView2);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=n.getText().toString() + "\n" + e.getText().toString() + "\n"+ m.getText().toString(); //string is declared
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=n.getText().toString(); //string is declared
                me.setText(s);
                st=e.getText().toString(); //string is declared
                id.setText(st);
                str=m.getText().toString(); //string is declared
                no.setText(str);
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=n.getText().toString() + "\n" + e.getText().toString() + "\n"+ m.getText().toString();
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("abc",s); //to put or pass data frm one screen to another
                startActivity(i);//starts the intent activity
                Toast.makeText(MainActivity.this,"Signed in!I'm developer",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.boards,menu);
        return super.onCreateOptionsMenu(menu);
    }//adds menu to android app-on create res new menu -menu folder created | menu new menu resource file ie.boards

    public void abt(MenuItem item) {
        s=n.getText().toString() + "\n" + e.getText().toString() + "\n"+ m.getText().toString();//starts the intent activity
        Toast.makeText(MainActivity.this,"About Clicked!",Toast.LENGTH_SHORT).show();
        new AlertDialog.Builder(MainActivity.this)//for alert message
                .setTitle("Alert!")
                .setMessage("Battery low!")
                .setPositiveButton("Okayyy!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(MainActivity.this,MainActivity2.class);
                        i.putExtra("abc",s); //to put or pass data frm one screen to another
                        startActivity(i);
                    }
                })
                .setNegativeButton("No",null)//more buttons
                .setNeutralButton("LOL",null)//more buttons
                .show();
    }

    public void help(MenuItem item) {
        Dialog dia = new Dialog(MainActivity.this);
        dia.setContentView(R.layout.cusdialog);//to create custom alert boxes of your own
        dia.show();
    }

    public void website(View view) {
        Toast.makeText(MainActivity.this,"Help Assured!",Toast.LENGTH_SHORT).show();
        Intent w = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(w);
    }
}