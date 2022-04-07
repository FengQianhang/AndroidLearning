package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private TextView ans;
    private Button c_1;
    private Button c_2;
    private Button c_pl;
    private Button c_eq;

    private Stack<Integer> mIntegers;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIntegers = new Stack<>();
        ans = findViewById(R.id.ans);
        c_1 = findViewById(R.id.c_1);
        c_2 = findViewById(R.id.c_2);
        c_pl = findViewById(R.id.c_pl);
        c_eq = findViewById(R.id.c_eq);

        c_1.setOnClickListener(v -> {
            mIntegers.push(1);
            ans.setText("1");
        });

        c_2.setOnClickListener(v -> {
            mIntegers.push(2);
            ans.setText("2");
        });

        c_pl.setOnClickListener(v -> {
            ans.setText("+");
        });

        c_eq.setOnClickListener(v -> {
            int add = 0;
            while (!mIntegers.empty()) {
                add += mIntegers.pop();
            }
            ans.setText(add+"");
        });

    }
}