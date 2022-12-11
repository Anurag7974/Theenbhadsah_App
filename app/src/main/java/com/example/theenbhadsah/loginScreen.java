package com.example.theenbhadsah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginScreen extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        getWindow().setStatusBarColor(ContextCompat.getColor(loginScreen.this,R.color.orange));

        button = findViewById(R.id.signUp);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginScreen.this, signUpScreen.class );
                startActivity(intent);
            }
        });
    }
}