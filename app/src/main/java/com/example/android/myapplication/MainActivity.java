package com.example.android.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)super.findViewById(R.id.btn);
        EditText txt = (EditText)super.findViewById(R.id.txt);
        MyOnClickListener clickListener = new MyOnClickListener(txt);
        btn.setOnClickListener(clickListener);
    }
}
