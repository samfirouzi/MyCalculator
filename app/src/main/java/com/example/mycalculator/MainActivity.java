package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button zeroBTN, oneBTN, twoBTN, threeBTN, fourBTN, fiveBTN,
            sixBTN, sevenBTN, eightBTN, nineBTN, clearBTN, parenthesenBTn, exponentBTN,
            divideBTN, multyplyBTN, substractBTN, addBTN, equalsBTN, plusMinusBTN,
            pointBTN;
    ImageButton backspaceBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //reference all
        display=findViewById(R.id.displayEditText);
        zeroBTN=findViewById(R.id.zero);
        oneBTN=findViewById(R.id.one);
        twoBTN=findViewById(R.id.two);
        threeBTN=findViewById(R.id.three);
        fourBTN=findViewById(R.id.four);
        fiveBTN=findViewById(R.id.five);
        sixBTN=findViewById(R.id.six);
        sevenBTN=findViewById(R.id.seven);
        eightBTN=findViewById(R.id.eight);
        nineBTN=findViewById(R.id.nine);
        clearBTN=findViewById(R.id.clear);
        parenthesenBTn=findViewById(R.id.parenthesen);
        plusMinusBTN=findViewById(R.id.plusMinus);
        pointBTN=findViewById(R.id.point);
        multyplyBTN=findViewById(R.id.multyply);
        exponentBTN=findViewById(R.id.exponent);
        equalsBTN=findViewById(R.id.equals);
        addBTN=findViewById(R.id.add);
        backspaceBTN=findViewById(R.id.backspace);
        divideBTN=findViewById(R.id.divide);
        substractBTN=findViewById(R.id.substract);
        //
        display.setShowSoftInputOnFocus(false);
    }
}