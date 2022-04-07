package com.example.dragging;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView car0;
    private RelativeLayout parentView;

    private int lastX;
    private int lastY;
    private int maxRight;
    private int maxBottom;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        car0 = findViewById(R.id.car0);
        parentView = findViewById(R.id.parentView);

        car0.setOnTouchListener((v, event) -> {
//                相对于屏幕, 指针的坐标
            int eventX = (int) event.getRawX();
            int eventY = (int) event.getRawY();
            ImageView car = (ImageView) v;

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    if (maxRight == 0) {
                        maxRight = parentView.getRight();
                        maxBottom = parentView.getBottom();
                    }
                    break;

                case MotionEvent.ACTION_MOVE:

                    int dx = eventX - lastX;
                    int dy = eventY - lastY;

                    int left = car.getLeft() + dx;
                    int top = car.getTop() + dy;
                    int right = car.getRight() + dx;
                    int bottom = car.getBottom() + dy;


                    if (left < 0) {
                        right -= left;
                        left = 0;
                    }

                    if (top < 0) {
                        bottom -= top;
                        top = 0;
                    }

                    if (right > maxRight) {
                        left -= right - maxRight;
                        right = maxRight;
                    }

                    if (bottom > maxBottom) {
                        top -= bottom - maxBottom;
                        bottom = maxBottom;
                    }

                    car.layout(left, top, right, bottom);
                    break;
            }

            lastX = eventX;
            lastY = eventY;
            return true;
        });
    }
}