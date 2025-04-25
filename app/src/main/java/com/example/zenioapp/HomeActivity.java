package com.example.zenioapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button measureButton = findViewById(R.id.measure_button);
        Button bloodPressureButton = findViewById(R.id.blood_pressure_button);
        Button bloodSugarButton = findViewById(R.id.blood_sugar_button);
        ImageView notificationIcon = findViewById(R.id.notification_icon);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home as the selected item
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        measureButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, HeartRateActivity.class)));
        bloodPressureButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, AnalyticsActivity.class)));
        bloodSugarButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, AnalyticsActivity.class)));

        notificationIcon.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, NotificationActivity.class)));

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                return true;  // Already on Home screen
            } else if (itemId == R.id.nav_settings) {
                startActivity(new Intent(HomeActivity.this, SettingsActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.nav_profile) {
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.nav_analytics) {
                startActivity(new Intent(HomeActivity.this, AnalyticsActivity.class));
                finish();
                return true;
            }
            return false;
        });
    }
}