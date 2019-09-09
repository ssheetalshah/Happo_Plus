package com.info.happo_plus.View;

import android.content.Context;
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


public class SignUp_Activity extends AppCompatActivity
{
    private Button SignUp;
    private EditText Ed_Name, Ed_Email, Ed_Phone, Ed_Pass, Ed_ConfirmPass;
    private ImageView img_Back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        SignUp = (Button) findViewById(R.id.SignUp);
        Ed_Name = (EditText) findViewById(R.id.ed_name);
        Ed_Email = (EditText) findViewById(R.id.ed_email);
        Ed_Phone = (EditText) findViewById(R.id.ed_phonenum);
        Ed_Pass = (EditText) findViewById(R.id.ed_password);
        Ed_ConfirmPass = (EditText) findViewById(R.id.ed_confirm_password);
        img_Back = (ImageView) findViewById(R.id.backpress);

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
        img_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Utilview.hidekeyboard(SignUp_Activity.this);
    }
}
