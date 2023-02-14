package com.example.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

public class relative extends AppCompatActivity {
    EditText UsernameNew,PasswordNew;
    Button BackBtn,RegisterBtn,BtnShowPassword;
    EditText passEdit;
    CheckBox mCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        BackBtn = findViewById(R.id.btnback);
        RegisterBtn = findViewById(R.id.btnRegister);
        mCheckBox = findViewById(R.id.checkBox2);
        passEdit = findViewById(R.id.NewPassword);

        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    passEdit.setTransformationMethod(null);
                }else {
                    passEdit.setTransformationMethod( new PasswordTransformationMethod());
                }
            }
        });

        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(relative.this, "Kembali", Toast.LENGTH_SHORT).show();
                Intent x = new Intent(relative.this, MainActivity.class);
                startActivity(x);
            }
        });

        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(relative.this, "Kembali", Toast.LENGTH_SHORT).show();
                Intent x = new Intent(relative.this, MainActivity.class);
                startActivity(x);
            }
        });
    }
}