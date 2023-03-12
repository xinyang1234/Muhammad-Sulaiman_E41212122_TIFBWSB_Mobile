package com.example.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Editusernametxt,Editpasswordtxt;
    CheckBox mCheckBox;
    Button btnLogin,btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Editusernametxt = findViewById(R.id.usernametxt);
        Editpasswordtxt = findViewById(R.id.passwordtxt);
        btnLogin =findViewById(R.id.loginbtn);
        btnRegister =findViewById(R.id.tidakPunyaAkun);
        mCheckBox = findViewById(R.id.checkBox2);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this, relative.class);
                startActivity(x);
            }
        });
        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Editpasswordtxt.setTransformationMethod(null);
                }else {
                    Editpasswordtxt.setTransformationMethod( new PasswordTransformationMethod());
                }
            }
        });
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
                                Intent x = new Intent(MainActivity.this, Dashboard.class);
                                startActivity(x);
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