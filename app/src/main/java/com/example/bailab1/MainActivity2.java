package com.example.bailab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button btnEx1;
    private Button btnEx2;
    private Button btnEx3;
    private Button btnEx4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnEx1 = (Button) findViewById(R.id.btnEx1);
        btnEx2 = (Button) findViewById(R.id.btnEx2);
        btnEx3 = (Button) findViewById(R.id.btnEx3);
        btnEx4 = (Button) findViewById(R.id.btnEx4);
    }
    public  void Bai1 (View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
    public  void Bai2 (View view){
        Intent intent = new Intent(MainActivity2.this,Bai2.class);
        startActivity(intent);
    }
    public  void Bai3 (View view){
        Intent intent = new Intent(MainActivity2.this,Bai3.class);
        startActivity(intent);
    }
    public  void Bai4 (View view){
        Intent intent = new Intent(MainActivity2.this,Bai4.class);
        startActivity(intent);
    }
}