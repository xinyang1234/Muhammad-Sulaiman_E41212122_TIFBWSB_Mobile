package com.example.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollView extends AppCompatActivity {
    Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        btn01 = findViewById(R.id.Btn1);
        btn02 = findViewById(R.id.Btn2);
        btn03 = findViewById(R.id.Btn3);
        btn04 = findViewById(R.id.Btn4);
        btn05 = findViewById(R.id.Btn5);
        btn06 = findViewById(R.id.Btn6);
        btn07 = findViewById(R.id.Btn7);
        btn08 = findViewById(R.id.Btn8);
        btn09 = findViewById(R.id.Btn9);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ScrollView.this, Dashboard.class);
                startActivity(x);
            }
        });
    }
}