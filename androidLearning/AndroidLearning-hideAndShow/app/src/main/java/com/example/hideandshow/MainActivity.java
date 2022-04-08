package com.example.hideandshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button hide;
    private Button show;
    private LinearLayout orange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hide = findViewById(R.id.hide);
        show = findViewById(R.id.show);
        orange = findViewById(R.id.orange);

        hide.setOnClickListener(v->{
            orange.setVisibility(View.INVISIBLE);
        });

        show.setOnClickListener(v->{
            orange.setVisibility(View.VISIBLE);
        });

    }
}