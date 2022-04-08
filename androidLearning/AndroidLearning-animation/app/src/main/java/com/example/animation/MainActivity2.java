package com.example.animation;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private ImageView sun;
    AlphaAnimation fadeOut;
    AlphaAnimation fadeIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sun = findViewById(R.id.sun);

        fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setDuration(2000);
        fadeOut.setRepeatCount(Animation.INFINITE);

        fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(2000);
        fadeIn.setStartOffset(2500);
        fadeIn.setRepeatCount(Animation.INFINITE);

        sun.startAnimation(fadeOut);
    }
}