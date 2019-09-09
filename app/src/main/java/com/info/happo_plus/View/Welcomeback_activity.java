package com.info.happo_plus.View;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.info.happo_plus.Apputils.Utilview;
import com.info.happo_plus.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class Welcomeback_activity extends AppCompatActivity
{

    private EditText Ed_Name, Ed_Pass, Ed_ConfirmPass;
    private ImageView back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        Ed_Name = (EditText) findViewById(R.id.ed_name);
        Ed_Pass = (EditText) findViewById(R.id.ed_pass);
        Ed_ConfirmPass = (EditText) findViewById(R.id.ed_confirmpass);
        back = (ImageView) findViewById(R.id.backpress);


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
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();      }});

        }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Utilview.hidekeyboard(Welcomeback_activity.this);
    }

}
