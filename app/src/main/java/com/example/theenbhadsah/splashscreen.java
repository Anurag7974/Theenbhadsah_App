package com.example.theenbhadsah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    ImageView logo;
    TextView title, title2;
    Animation upperanimation, buttom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        logo = findViewById(R.id.logo);
        title = findViewById(R.id.title);
        title2 = findViewById(R.id.title2);

        upperanimation = AnimationUtils.loadAnimation(this, R.anim.upper_animation);
        buttom = AnimationUtils.loadAnimation(this, R.anim.buttom);

        logo.setAnimation(upperanimation);
        title.setAnimation(buttom);
        title2.setAnimation(buttom);

    }
}