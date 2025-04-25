package com.example.zenioapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class HeartRateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate);

        // Simulate measurement process and navigate to MeasureActivity after 3 seconds
        new Handler().postDelayed(() -> {
            startActivity(new Intent(HeartRateActivity.this, MeasureActivity.class));
        }, 3000);
    }
}