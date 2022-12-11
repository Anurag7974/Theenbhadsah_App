package com.example.theenbhadsah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signUpScreen extends AppCompatActivity {

   Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        button = findViewById(R.id.Login);

        getWindow().setStatusBarColor(ContextCompat.getColor(signUpScreen.this,R.color.orange));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signUpScreen.this, loginScreen.class);
                startActivity(intent);
            }
        });

    }
}