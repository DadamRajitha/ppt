package com.example.demoproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demoproject.ClaimActivity;
import com.example.demoproject.LoginActivity;
import com.example.demoproject.RegisterActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void goToRegister(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    public void goToFileClaim(View view) {
        startActivity(new Intent(this, ClaimActivity.class));
    }
}