package com.example.allaround;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;



public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button SignupStartBtn = (Button)findViewById(R.id.SignupStartBtn);
        EditText EditName = (EditText)findViewById(R.id.EditName);
        EditText EditEmail2 = (EditText)findViewById(R.id.EditEmail2);
        EditText EditPassword = (EditText)findViewById(R.id.EditPassword2);
        EditText EditBankName = (EditText)findViewById(R.id.BankName);
        EditText EditBankId = (EditText)findViewById(R.id.BankId);
        EditText EditMonthly = (EditText)findViewById(R.id.MonthlyGoal);



        SignupStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = EditName.getText().toString();
                String email = EditEmail2.getText().toString();
                String password = EditPassword.getText().toString();
                String bankname = EditBankName.getText().toString();
                String bankId = EditBankId.getText().toString();
                String monthlygoal = EditMonthly.getText().toString();


                Client.getInstance().setName(name);
                Client.getInstance().setEmail(email);
                Client.getInstance().setPassword(password);
                Client.getInstance().setBankName(bankname);
                Client.getInstance().setBankId(bankId);
                Client.getInstance().setMontlyGoal(Integer.parseInt("100"));

                Intent intent = new Intent(SignupActivity.this,HomeActivity.class);
                startActivity(intent);











            }
        });
    }
}