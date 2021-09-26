package com.example.mad_project2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mad_project2.R;

public class LoginActivity extends AppCompatActivity {

    Button signIn;
    EditText email, password;
    TextView signUp;

    FirebaseAuth auth;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();

        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

        signIn =findViewById(R.id.login_button);
        email =findViewById(R.id.email_login);
        password =findViewById(R.id.password_login);
        signUp =findViewById(R.id.signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loginUser();
                progressBar.setVisibility(View.VISIBLE);

            }
        });
    }

    private void loginUser() {
            String userEmail = email.getText().toString();
            String userPassword = password.getText().toString();

            if (TextUtils.isEmpty(userEmail)) {
                Toast.makeText(this,"Email) is Empty!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(userPassword)) {
                Toast.makeText(this,"Password is Empty!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (userPassword.length() < 6) {
                Toast.makeText(this,"Password Length must be greater than 6 letters", Toast.LENGTH_SHORT).show();
                return;
            }

            //Login User
        auth.sign

                public void

                    if () {
                        progressBar.setVisibility(View.GONE);

                    } else {
                        progressBar.setVisibility(View.GONE);

                    }
    }
}