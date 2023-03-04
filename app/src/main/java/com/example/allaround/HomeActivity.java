package com.example.allaround;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView WelcomeMessage = (TextView)findViewById(R.id.WelcomMessage);

        WelcomeMessage.setText("Welcome, " + Client.getInstance().getName());
    }
}