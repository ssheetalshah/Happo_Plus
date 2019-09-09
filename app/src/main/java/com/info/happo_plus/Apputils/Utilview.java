package com.info.happo_plus.Apputils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class Utilview
{
    public static void fontEdittext(final EditText editTxt, Activity activity)
    {
        /*Typeface type = Typeface.createFromAsset(activity.getAssets(),"fonts/Roboto-Regular.ttf");
        editTxt.setTypeface(type);*/
//        final EditText edtx = editTxt;

        final Typeface type = Typeface.createFromAsset(activity.getAssets(),"fonts/Roboto-Regular.ttf");
        final Typeface type_hin = Typeface.createFromAsset(activity.getAssets(),"fonts/Roboto-Thin.ttf");

        editTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()==0)
                {  editTxt.setTypeface(type_hin);     }
                else
                {editTxt.setTypeface(type);     }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    public static void hidekeyboard(Activity activity)
    {
        InputMethodManager inputManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);

        View currentFocusedView = activity.getCurrentFocus();
        if (currentFocusedView !=null)
        {
            inputManager.hideSoftInputFromWindow(currentFocusedView.getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

}
