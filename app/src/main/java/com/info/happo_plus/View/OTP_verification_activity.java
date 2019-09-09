package com.info.happo_plus.View;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.info.happo_plus.Apputils.Utilview;
import com.info.happo_plus.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class OTP_verification_activity extends AppCompatActivity
{
    private Button Confirm;
    private ImageView img_Back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        Confirm = (Button) findViewById(R.id.button_confirm);
        img_Back = (ImageView) findViewById(R.id.backpress);

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(OTP_verification_activity.this,Welcomeback_activity.class);
                startActivity(in);

            }
        });

        img_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Kollektif-Bold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Utilview.hidekeyboard(OTP_verification_activity.this);
    }
}


