package com.example.greeting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText enterName;
    private Button send;
    private TextView showWel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterName = findViewById(R.id.enterName);
        send = findViewById(R.id.send);
        showWel = findViewById(R.id.showWel);

        send.setOnClickListener(v -> {
            String text = enterName.getText().toString();
            if (text != null) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                showWel.setText("Welcome" + text);
            }
        });
    }
}