package com.example.image;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ImageView star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        star = new ImageView(this);
        star.setImageResource(R.drawable.star_kids);
        star.setId(View.generateViewId());
        int star_id = star.getId();
        Log.d(TAG, "onCreate: " + star_id);

        ConstraintLayout mainLayout = findViewById(R.id.main);
        mainLayout.addView(star);

        star.getLayoutParams().height = 300;
        star.getLayoutParams().width = 300;

        ConstraintSet set = new ConstraintSet();
        set.clone(mainLayout);
        set.connect(star_id, ConstraintSet.TOP, R.id.box, ConstraintSet.TOP, 50);
        set.connect(star_id, ConstraintSet.LEFT, mainLayout.getId(), ConstraintSet.LEFT, 200);
        set.applyTo(mainLayout);
    }
}