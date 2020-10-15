package com.example.emarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void openSignupPage(android.view.View view){
        Intent signup=new Intent(this, SignUpActivity.class);
        startActivity(signup);
    }
}