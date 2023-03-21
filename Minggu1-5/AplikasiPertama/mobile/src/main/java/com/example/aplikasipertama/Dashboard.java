package com.example.aplikasipertama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Dashboard extends AppCompatActivity {
    Button LinearLayout,RelativeLayout,ConstraintLayout1,TabelLayout,
    MaterialDesign,ScrollView,ScrollViewHorizontal,Location;

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    AccountFragment accountFragment = new AccountFragment();
    LogoutFragment logoutFragment = new LogoutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.r,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.r,homeFragment).commit();
                        return true;
                    case R.id.logout:
                        getSupportFragmentManager().beginTransaction().replace(R.id.r,logoutFragment).commit();
                        return true;
                    case R.id.account:
                        getSupportFragmentManager().beginTransaction().replace(R.id.r,accountFragment).commit();
                        return true;
                }
                return false;
            }
        });

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