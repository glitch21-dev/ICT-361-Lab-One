package com.example.ict361lab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textCounter = findViewById(R.id.textCounter);
        Button btnIncrement = findViewById(R.id.btnIncrement);

        btnIncrement.setOnClickListener(v -> {
            clicks++;
            textCounter.setText("Clicks: " + clicks);
        });
    }
}