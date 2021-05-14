package com.example.calculatorusingintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btn;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
num1= findViewById(R.id.editTextNumber);
num2=findViewById(R.id.editTextNumber2);
btn=findViewById(R.id.button);
tvResult=findViewById(R.id.textView);


    }

    public void add(View view) {

        int var1= Integer.valueOf(num1.getText().toString());
        int var2= Integer.valueOf(num2.getText().toString());
        int var = var1+var2;

        tvResult.setText(String.valueOf(var));

        Intent i= new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("result",var);
        startActivity(i);
    }
}