package com.example.zenioapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Set up back arrow click listener
        ImageView backArrow = findViewById(R.id.back_arrow);
        backArrow.setOnClickListener(v -> {
            startActivity(new Intent(SignInActivity.this, SplashActivity.class));
            finish();
        });

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(v -> {
            // Basic validation (static app, so just navigate)
            if (!username.getText().toString().isEmpty() &&
                    !password.getText().toString().isEmpty()) {
                startActivity(new Intent(SignInActivity.this, HomeActivity.class));
                finish();
            }
        });
    }
}