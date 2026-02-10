package com.basiccalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numberOneText;
    EditText numberTwoText;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOneText = findViewById(R.id.numberOneText);
        numberTwoText = findViewById(R.id.numberTwoText);
        resultText = findViewById(R.id.resultText);
    }

    @SuppressLint("SetTextI18n")
    public void onPlus(View view){
        String numberOneString = numberOneText.getText().toString();
        String numberTwoString = numberTwoText.getText().toString();

        if (!(numberOneString.isEmpty() || numberTwoString.isEmpty())){
            int numberOne = Integer.parseInt(numberOneString);
            int numberTwo = Integer.parseInt(numberTwoText.getText().toString());
            int result = numberOne + numberTwo;
            resultText.setText("Result: " + result);
        } else {
            resultText.setText("Enter a number!");
        }
    }

    @SuppressLint("SetTextI18n")
    public void onSubtraction(View view){
        String numberOneString = numberOneText.getText().toString();
        String numberTwoString = numberTwoText.getText().toString();

        if (!(numberOneString.isEmpty() || numberTwoString.isEmpty())){
            int numberOne = Integer.parseInt(numberOneString);
            int numberTwo = Integer.parseInt(numberTwoText.getText().toString());
            int result = numberOne - numberTwo;
            resultText.setText("Result: " + result);
        } else {
            resultText.setText("Enter a number!");
        }
    }

    @SuppressLint("SetTextI18n")
    public void onDivide(View view){
        String numberOneString = numberOneText.getText().toString();
        String numberTwoString = numberTwoText.getText().toString();

        if (!(numberOneString.isEmpty() || numberTwoString.isEmpty())){
            int numberOne = Integer.parseInt(numberOneString);
            int numberTwo = Integer.parseInt(numberTwoText.getText().toString());
            int result = numberOne / numberTwo;
            resultText.setText("Result: " + result);
        } else {
            resultText.setText("Enter a number!");
        }
    }

    @SuppressLint("SetTextI18n")
    public void onMultiply(View view){
        String numberOneString = numberOneText.getText().toString();
        String numberTwoString = numberTwoText.getText().toString();

        if (!(numberOneString.isEmpty() || numberTwoString.isEmpty())){
            int numberOne = Integer.parseInt(numberOneString);
            int numberTwo = Integer.parseInt(numberTwoText.getText().toString());
            int result = numberOne * numberTwo;
            resultText.setText("Result: " + result);
        } else {
            resultText.setText("Enter a number!");
        }
    }
}