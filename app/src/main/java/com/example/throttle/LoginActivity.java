package com.example.throttle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String phraseOne = "Do not have an account?";
        String phraseTwo = "<font color='#d71f35'> Sign Up Here!</font>";

        TextView newAccountMsg = (TextView) findViewById(R.id.signup_account_msg);
        newAccountMsg.setText(Html.fromHtml(phraseOne + phraseTwo));
    }
}