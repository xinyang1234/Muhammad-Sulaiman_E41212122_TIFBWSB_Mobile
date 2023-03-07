package com.example.aplikasipertama;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Location extends AppCompatActivity {

    EditText Lokasi;
    Button btnLokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        btnLokasi = findViewById(R.id.btnCariLokasi);
        Lokasi = findViewById(R.id.txtlokasi);

        btnLokasi.setOnClickListener(v -> {
            String location = Lokasi.getText().toString();
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("geo:0,0?q=-7.91175000,113.82178800 (" + location + ")"));
            startActivity(intent);

        });
    }
}