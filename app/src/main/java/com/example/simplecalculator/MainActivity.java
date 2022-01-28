package com.example.simplecalculator;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 =findViewById(R.id.editText1);
        editText2 =findViewById(R.id.editText2);
        textView=findViewById(R.id.textView);
    }

    public void toplam(View view){
        if (editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Enter Number");


        }else{
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result =number1 + number2;
            textView.setText("Result :" + result);
        }

    }
    public void cikarma (View view){
        if (editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Enter Number");

        }else{
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result =number1 - number2;
            textView.setText("Result :" + result);
        }

    }
    public void carpma(View view){
        if (editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Enter Number");

        }else{
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result =number1 * number2;
            textView.setText("Result :" + result);
        }

    }
    public void bolme(View view){
        if (editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Enter Number");

        }else{
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result =number1 / number2;
            textView.setText("Result :" + result);
        }
    }

}