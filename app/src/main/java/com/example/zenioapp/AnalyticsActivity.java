package com.example.zenioapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AnalyticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Analytics as the selected item
        bottomNavigationView.setSelectedItemId(R.id.nav_analytics);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                startActivity(new Intent(AnalyticsActivity.this, HomeActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.nav_settings) {
                startActivity(new Intent(AnalyticsActivity.this, SettingsActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.nav_profile) {
                startActivity(new Intent(AnalyticsActivity.this, ProfileActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.nav_analytics) {
                return true;  // Already on Analytics screen
            }
            return false;
        });
    }
}