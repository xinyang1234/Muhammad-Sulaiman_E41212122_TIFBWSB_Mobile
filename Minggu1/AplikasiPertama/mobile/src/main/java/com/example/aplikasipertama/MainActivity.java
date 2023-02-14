package com.example.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Editusernametxt,Editpasswordtxt;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Editusernametxt = findViewById(R.id.usernametxt);
        Editpasswordtxt = findViewById(R.id.passwordtxt);
        btnLogin =findViewById(R.id.loginbtn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String datausername = Editusernametxt.getText().toString();
                String datapassword = Editpasswordtxt.getText().toString();
                switch (datausername){
                    case "a" :
                        switch (datapassword){
                            case "a" :
                                Toast.makeText(MainActivity.this, "Berhasil Masuk", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                Toast.makeText(MainActivity.this, "Gagal Masuk", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Gagal Masuk", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}