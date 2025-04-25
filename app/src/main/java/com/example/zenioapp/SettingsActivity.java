package com.example.zenioapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button profileButton = findViewById(R.id.profile_button);
        Button languageButton = findViewById(R.id.language_button);
        Button rateButton = findViewById(R.id.rate_button);
        Button exportButton = findViewById(R.id.export_button);
        Button notificationButton = findViewById(R.id.notification_button);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Settings as the selected item
        bottomNavigationView.setSelectedItemId(R.id.nav_settings);

        profileButton.setOnClickListener(v -> startActivity(new Intent(SettingsActivity.this, ProfileActivity.class)));
        languageButton.setOnClickListener(v -> startActivity(new Intent(SettingsActivity.this, LanguageActivity.class)));
        rateButton.setOnClickListener(v -> startActivity(new Intent(SettingsActivity.this, RateActivity.class)));
        exportButton.setOnClickListener(v -> {/* Static app: no action */});
        notificationButton.setOnClickListener(v -> startActivity(new Intent(SettingsActivity.this, NotificationActivity.class)));

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                startActivity(new Intent(SettingsActivity.this, HomeActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.nav_settings) {
                return true;  // Already on Settings screen
            } else if (itemId == R.id.nav_profile) {
                startActivity(new Intent(SettingsActivity.this, ProfileActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.nav_analytics) {
                startActivity(new Intent(SettingsActivity.this, AnalyticsActivity.class));
                finish();
                return true;
            }
            return false;
        });
    }
}