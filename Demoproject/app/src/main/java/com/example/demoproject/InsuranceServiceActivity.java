package com.example.demoproject;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

    public class InsuranceServiceActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_insurance_service);

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable back button
        }

        @Override
        public boolean onSupportNavigateUp() {
            onBackPressed(); // Navigate back to previous activity
            return true;
        }
    }



