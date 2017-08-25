package com.example.android.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by android on 24/08/17.
 */

public class MyOnClickListener implements View.OnClickListener  {

    EditText txt;

    public MyOnClickListener(EditText txt) {
        this.txt = txt;
    }

    @Override
    public void onClick(View view) {
        Log.d("Click en el botón", "El texto ingresado fue " + txt.getText());
    }
}
