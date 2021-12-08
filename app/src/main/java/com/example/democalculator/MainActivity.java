package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    double number1,number2,answer;
    char c = '0';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    result = (TextView) findViewById(R.id.tv1);
    }

    public void clear ( View view)
    {
        result.setText("");
    }
    public void backspace ( View view) {
        String s = result.getText().toString();
        if (s.length() != 0) {
            s = s.substring(0, s.length() - 1);
            result.setText(s);
        }
    }
     public void num1( View view)
     {
         String s = result.getText().toString();
         result.setText(s+1);
     }
    public void num2( View view)
    {
        String s = result.getText().toString();
        result.setText(s+2);
    }
    public void num3( View view)
    {
        String s = result.getText().toString();
        result.setText(s+3);
    }
    public void num4( View view)
    {
        String s = result.getText().toString();
        result.setText(s+4);
    }
    public void num5( View view)
    {
        String s = result.getText().toString();
        result.setText(s+5);
    }
    public void num6( View view)
    {
        String s = result.getText().toString();
        result.setText(s+6);
    }
    public void num7( View view)
    {
        String s = result.getText().toString();
        result.setText(s+7);
    }
    public void num8( View view)
    {
        String s = result.getText().toString();
        result.setText(s+8);
    }
    public void num9( View view)
    {
        String s = result.getText().toString();
        result.setText(s+9);
    }
    public void num0( View view)
    {
        String s = result.getText().toString();
       if (s.length() != 0)
       {result.setText(s+0);
    }}
 public void plus (View view ){
        String s= result.getText().toString();
        number1 = Double.parseDouble(s);
        result.setText("");
        c = '+' ;
 }

    public void minus (View view ){
        String s= result.getText().toString();
        number1 = Double.parseDouble(s);
        result.setText("");
        c = '-';
    }

    public void multiply (View view ){
        String s= result.getText().toString();
        number1 = Double.parseDouble(s);
        result.setText("");
        c = '*';
    }

    public void divide (View view ){
        String s= result.getText().toString();
        number1 = Double.parseDouble(s);
        result.setText("");
        c = '/';
    }

    public void equal (View view ){
        if (c !=0 ){
        String s= result.getText().toString();
        number2 = Double.parseDouble(s);
        if (c == '+'){
            answer = number1+number2;
            s = String.valueOf(answer);
            result.setText(s);
            c = '-';
        }
        if (c == '*'){
            answer = number1-number2;
            s = String.valueOf(answer);
            result.setText(s);
            c = '0';
        }
        if (c == '*'){
            answer = number1*number2;
            s = String.valueOf(answer);
            result.setText(s);
            c = '0';
        }
        if (c == '/'){
            answer = number1 / number2;
            s = String.valueOf(answer);
            result.setText(s);
            c= '1' 
            c = '0';

        }
    }}
}

