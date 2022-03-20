package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private int value, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getNumbers() {
        result = findViewById(R.id.result);
    }

    public void additionOperation(View v) {

        getNumbers();
        total += value;
        value = 0;
        result.setText(Integer.toString(total));
    }

    public void subtractionOperation(View v) {
        getNumbers();
        total -= value;
        value = 0;
        result.setText(Integer.toString(total));
    }

    public void multiplicationOperation(View v) {
        getNumbers();
        total *= value;
        value = 0;
        result.setText(Integer.toString(total));
    }

    public void divisionOperation(View v) {
        getNumbers();
        total /= value;
        value = 0;
        result.setText(Integer.toString(total));
    }

    public void clear(View v) {
        total = 0;
        value = 0;
        result.setText(Integer.toString(total));
    }

    public void moduloOperation(View v) {
        getNumbers();
        if (value == 0) {
            result.setText("Error");
            return;
        }
        total %= value;
        value = 0;
        result.setText(Integer.toString(total));
    }

    public void equalsOperation(View v) {
        result.setText(Integer.toString(total));
        value = 0;

    }

    public void oneButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 1;
        result.setText(Integer.toString(value));
    }

    public void twoButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 2;
        result.setText(Integer.toString(value));
    }

    public void threeButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 3;
        result.setText(Integer.toString(value));
    }

    public void fourButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 4;
        result.setText(Integer.toString(value));
    }

    public void fiveButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 5;
        result.setText(Integer.toString(value));
    }

    public void sixButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 6;
        result.setText(Integer.toString(value));
    }

    public void sevenButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 7;
        result.setText(Integer.toString(value));
    }

    public void eightButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 8;
        result.setText(Integer.toString(value));
    }

    public void nineButtonHandler(View v) {
        getNumbers();
        value = value * 10 + 9;
        result.setText(Integer.toString(value));
    }

    public void zeroButtonHandler(View v) {
        getNumbers();
        value = value * 10;
        result.setText(Integer.toString(value));
    }
}