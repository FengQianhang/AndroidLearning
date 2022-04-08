package com.example.animation;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView ball1;
    private ImageView ball2;
    private ImageView ball3;
    private ImageView ball4;

    ScaleAnimation scale;
    TranslateAnimation trans;
    RotateAnimation rotate;
    AlphaAnimation alpha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball1 = findViewById(R.id.ball1);
        scale = new ScaleAnimation(0, 2, 0, 2);
        scale.setDuration(10000);
        scale.setRepeatCount(Animation.INFINITE);
        ball1.startAnimation(scale);

        ball2 = findViewById(R.id.ball2);
        rotate = new RotateAnimation(0, 300);
        rotate.setDuration(10000);
        rotate.setRepeatCount(Animation.INFINITE);
        ball2.startAnimation(rotate);

        ball3 = findViewById(R.id.ball3);
        trans = new TranslateAnimation(0, 200, 0, 100);
        trans.setDuration(10000);
        trans.setRepeatCount(Animation.INFINITE);
        ball3.startAnimation(trans);

        ball4 = findViewById(R.id.ball4);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(10000);
        alpha.setRepeatCount(Animation.INFINITE);
        ball4.startAnimation(alpha);

    }
}