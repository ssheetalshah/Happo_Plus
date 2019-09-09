package com.info.happo_plus.View;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.info.happo_plus.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class Login_Activity extends AppCompatActivity
{
    Button signUp;
    TextView makeAcc,forgetpass;
    EditText usernm, passoword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        makeAcc = (TextView)findViewById(R.id.tx_newAccount);
        signUp = (Button) findViewById(R.id.button_signup);
        forgetpass = (TextView) findViewById(R.id.tx_forgetpass);

        usernm = (EditText) findViewById(R.id.ed_email);
        passoword = (EditText) findViewById(R.id.ed_password);

        Click_listenrs();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));    }

    private void Click_listenrs()
    {
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Login_Activity.this,SignUp_Activity.class);
                startActivity(in1);
            }
        });

        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(Login_Activity.this,ForgotPass_Activity.class);
                startActivity(in3);
            }
        });

       /*Utilview.fontEdittext(usernm,Login_Activity.this);
       Utilview.fontEdittext(passoword, Login_Activity.this);*/
    }
}
