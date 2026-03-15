package com.assignment.group2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupform);

        TextView signInText = findViewById(R.id.textView13);
        signInText.setOnClickListener(v -> {
            finish(); // Go back to MainActivity
        });
    }
}