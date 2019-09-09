package com.info.happo_plus.View;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.info.happo_plus.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class Splash_Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Thread backgound = new Thread(){
            public void run()
            { try{
                    sleep(2 * 1000);
                    go_next();

            }      catch(Exception e)
            {      e.printStackTrace();            } }
        };

        backgound.start();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Kollektif-Bold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));    }

    private void go_next()
    {
        Intent in = new Intent(Splash_Activity.this, Login_Activity.class);
        startActivity(in);
        finish();
    }

}
