package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private TextView textView, textView2;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
    }
    public void calculate(View view)
    {

        if(TextUtils.isEmpty(editTextNumber.getText().toString()))
        {
            textView2.setText("Please Enter the value");
        }
        else
        {
            String s= editTextNumber.getText().toString();
            int kg=Integer.parseInt(s);
            double pound=kg*2.205;
            int gram=kg*1000;
            textView2.setText("The Value in Grams is : "+gram+"\n The value in pounds is : "+pound);
        }


    }
}
