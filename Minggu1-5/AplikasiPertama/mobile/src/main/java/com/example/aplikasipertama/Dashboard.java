package com.example.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button LinearLayout,RelativeLayout,ConstraintLayout1,TabelLayout,
    MaterialDesign,ScrollView,ScrollViewHorizontal,Location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        LinearLayout = findViewById(R.id.btnLinearLayout);
        RelativeLayout = findViewById(R.id.btnRelativeLayout);
        ConstraintLayout1 = findViewById(R.id.btnConstraintLayout);
        TabelLayout = findViewById(R.id.btnTabelLayout);
        MaterialDesign = findViewById(R.id.btnMaterialDesign);
        ScrollView = findViewById(R.id.btnScrollView);
        ScrollViewHorizontal = findViewById(R.id.btnScrollViewHorizontal);
        Location = findViewById(R.id.btnLocation);
        LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, MainActivity.class);
                startActivity(x);
            }
        });

        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, Location.class);
                startActivity(x);
            }
        });

        RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, relative.class);
                startActivity(x);
            }
        });

        ConstraintLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, LoginConstraint.class);
                startActivity(x);
            }
        });

        TabelLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, TableLayout.class);
                startActivity(x);
            }
        });

        MaterialDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, materialdesign.class);
                startActivity(x);
            }
        });

        ScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, ScrollView.class);
                startActivity(x);
            }
        });

        ScrollViewHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Dashboard.this, HorizontalScrollView.class);
                startActivity(x);
            }
        });
    }
}