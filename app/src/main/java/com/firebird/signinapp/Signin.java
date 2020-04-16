package com.firebird.signinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signin extends AppCompatActivity {

    EditText username, password;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signInButton = findViewById(R.id.signinBtn);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userUsername = "";
                String userPassword = "";

                userUsername = username.getText().toString();
                userPassword = password.getText().toString();

                if (userUsername.equals("Neel") && userPassword.equals("Neel"))
                {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong username or password",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
