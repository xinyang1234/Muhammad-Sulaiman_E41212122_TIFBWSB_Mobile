/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.aplikasimapsandsensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Beranda extends AppCompatActivity {

    private ImageView lightsensor, allsensor, proximity, map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        lightsensor = findViewById(R.id.img_light_sensor);
        allsensor = findViewById(R.id.img_lis_all_sensor);
        proximity = findViewById(R.id.img_proximity_sensor);
        map = findViewById(R.id.img_Maps);
        allsensor.setOnClickListener((View)->{
            Intent intent = new Intent(Beranda.this, all_sensor.class);
            startActivity(intent);
        });
        lightsensor.setOnClickListener((View)->{
            Intent intent = new Intent(Beranda.this, LightSensor.class);
            startActivity(intent);
        });
        proximity.setOnClickListener((View)->{
            Intent intent = new Intent(Beranda.this, ProximitySensor.class);
            startActivity(intent);
        });
        map.setOnClickListener((View)->{
            Intent intent = new Intent(Beranda.this, MainActivity.class);
            startActivity(intent);
        });

    }
}