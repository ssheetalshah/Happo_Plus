package com.info.happo_plus.View;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.info.happo_plus.Apputils.Utilview;
import com.info.happo_plus.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ForgotPass_Activity extends AppCompatActivity
{
    ImageView backpress;
    Button sendOtp;
    EditText Ed_Email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fogotpass);

        backpress = (ImageView) findViewById(R.id.backpress);
        sendOtp = (Button) findViewById(R.id.button_sendOtp);
        Ed_Email = (EditText) findViewById(R.id.ed_email);

        Click_Listeners();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));    }

    private void Click_Listeners()
    {
        backpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        sendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(ForgotPass_Activity.this , OTP_verification_activity.class);
                startActivity(in1);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Utilview.hidekeyboard(ForgotPass_Activity.this);
    }
}
