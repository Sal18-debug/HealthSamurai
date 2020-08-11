package com.example.healthsamurai;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.LoginButton);

        final TextView EmailText = (TextView) findViewById(R.id.EditEmailText);
        final TextView PasswordText = (TextView) findViewById(R.id.EditPasswordText);

        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            public void onClick(View v){
                if( (!EmailText.getText().toString().isEmpty()) && (!PasswordText.getText().toString().isEmpty())){
                    String email = EmailText.getText().toString();
                    String password = PasswordText.getText().toString();

                    TextView ErrorMsg = (TextView) findViewById(R.id.ErrorLoginMessage);

                    if(email.equals("test@mail.com") && password.equals("pass")) {
                            startActivity(new Intent(LoginActivity.this, MainPageActivity.class));
                            ErrorMsg.setVisibility(View.INVISIBLE);

                    }else{
                        // error
                        ErrorMsg.setVisibility(View.VISIBLE);
                    }
                }else{
                    TextView ErrorMsg = (TextView) findViewById(R.id.ErrorLoginMessage);
                    ErrorMsg.setVisibility(View.VISIBLE);
                }
            }
        });

        Button regbutton = (Button) findViewById(R.id.registerButton);

        regbutton.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            public void onClick(View v){
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

            }
        });

    }
}
