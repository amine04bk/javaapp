package com.example.zenioapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Set up back arrow click listener
        ImageView backArrow = findViewById(R.id.back_arrow);
        backArrow.setOnClickListener(v -> {
            startActivity(new Intent(SignUpActivity.this, SplashActivity.class));
            finish();
        });

        // Set up form fields and register button
        EditText firstName = findViewById(R.id.first_name);
        EditText lastName = findViewById(R.id.last_name);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        EditText age = findViewById(R.id.age);
        Button registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(v -> {
            // Basic validation (static app, so just navigate)
            if (!firstName.getText().toString().isEmpty() &&
                    !lastName.getText().toString().isEmpty() &&
                    !email.getText().toString().isEmpty() &&
                    !password.getText().toString().isEmpty() &&
                    !age.getText().toString().isEmpty()) {
                startActivity(new Intent(SignUpActivity.this, HomeActivity.class));
                finish();
            }
        });
    }
}