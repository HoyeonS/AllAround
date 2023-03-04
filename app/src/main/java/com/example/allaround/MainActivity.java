package com.example.allaround;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LoginBtn = (Button)findViewById(R.id.LoginBtn); //Login Button
        Button SignupBtn = (Button)findViewById(R.id.SignupBtn); //Signup Button

        SignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);



            }
        });
    }
}