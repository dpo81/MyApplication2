package com.example.android.myapplication;

import android.view.View;

/**
 * Created by android on 24/08/17.
 */

public class MyOnClickListener implements View.OnClickListener  {

    EditText txt;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public void onClick(View view) {
        Log.d("Click en el botón", "El texto ingresado fue " + this.getTxt());
    }
}
