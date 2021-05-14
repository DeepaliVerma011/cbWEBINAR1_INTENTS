package com.example.calculatorusingintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView2);

        Intent intentthatStartedThis= getIntent();
        int result= intentthatStartedThis.getIntExtra("result",0);

        tv.setText(String.valueOf(result));

    }
}