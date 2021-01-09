package com.example.throttle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivityOne extends AppCompatActivity {
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        String phraseOne = "Already have an account?";
        String phraseTwo = "<font color='#d71f35'> Login!</font>";

        TextView newAccountMsg = (TextView) findViewById(R.id.login_account_msg);
        newAccountMsg.setText(Html.fromHtml(phraseOne + phraseTwo));

        nextBtn = (Button) findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSignupPageTwo();
            }
        });
    }


    public void launchSignupPageTwo(){
        Intent intent = new Intent(this, SignupActivityTwo.class);
        startActivity(intent);
    }
}

