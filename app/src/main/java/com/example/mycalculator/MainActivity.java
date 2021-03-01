package com.example.mycalculator;
/**
 * Created by "Abolfazl Firouzi Shaker" on 01.03.21.
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button zeroBTN, oneBTN, twoBTN, threeBTN, fourBTN, fiveBTN,
            sixBTN, sevenBTN, eightBTN, nineBTN, clearBTN, parenthesenBTn, exponentBTN,
            divideBTN, multyplyBTN, substractBTN, addBTN, equalsBTN, plusMinusBTN,
            pointBTN;
    ImageButton backspaceBTN;
    TextView textViewResult;
    double value1 = Double.NaN;
    static double value2;
    static  final char EXPONENT='^';
    static final char ADDITION = '+';
    static final char SUBTRACTION = '-';
    static final char MULTIPLICATION = '*';
    static final char DIVISION = '/';
    static final char EQU = 0;
    static  char ACTION ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //reference all
        display = findViewById(R.id.displayTextView);
        zeroBTN = findViewById(R.id.zero);
        oneBTN = findViewById(R.id.one);
        twoBTN = findViewById(R.id.two);
        threeBTN = findViewById(R.id.three);
        fourBTN = findViewById(R.id.four);
        fiveBTN = findViewById(R.id.five);
        sixBTN = findViewById(R.id.six);
        sevenBTN = findViewById(R.id.seven);
        eightBTN = findViewById(R.id.eight);
        nineBTN = findViewById(R.id.nine);
        clearBTN = findViewById(R.id.clear);
        parenthesenBTn = findViewById(R.id.parenthesen);
        plusMinusBTN = findViewById(R.id.plusMinus);
        pointBTN = findViewById(R.id.point);
        multyplyBTN = findViewById(R.id.multyply);
        exponentBTN = findViewById(R.id.exponent);
        equalsBTN = findViewById(R.id.equals);
        addBTN = findViewById(R.id.add);
        backspaceBTN = findViewById(R.id.backspace);
        divideBTN = findViewById(R.id.divide);
        substractBTN = findViewById(R.id.substract);
        textViewResult = findViewById(R.id.textViewResult);

        //Diactive Keyboard layout of phone
        display.setShowSoftInputOnFocus(false);


        //for each button make a onClickList...
        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "0");
            }
        });
        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "1");
            }
        });
        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "2");
            }
        });
        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "3");
            }
        });
        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "4");
            }
        });
        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "5");
            }
        });
        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "6");
            }
        });
        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "7");
            }
        });
        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "8");
            }
        });
        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "9");
            }
        });
        pointBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+ ".");
            }
        });
        substractBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                textViewResult.setText(String.valueOf(value1) + "-");
                display.setText(null);
            }
        });
        multyplyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                textViewResult.setText(String.valueOf(value1) + " * ");
                display.setText(null);
            }
        });
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                textViewResult.setText(String.valueOf(value1) + "+");
                display.setText(null);
            }
        });
        exponentBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EXPONENT;
                textViewResult.setText(String.valueOf(value1) + "^");
                display.setText(null);
            }
        });
        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                textViewResult.setText(String.valueOf(value1) + "/");
                display.setText(null);
            }
        });
        equalsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                textViewResult.setText(textViewResult.getText().toString() + String.valueOf(value2) + " = " + String.valueOf(value1));
                //5+4=9
            }
        });
        plusMinusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+ "-");
            }
        });
        backspaceBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() > 0) {
                    CharSequence name = display.getText().toString();
                    display.setText(name.subSequence(0, name.length() - 1));
                }
            }
        });


        //clear Button (make empty)
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               value1=Double.NaN;
               value2=Double.NaN;
                display.setText(null);
                textViewResult.setText(null);
            }
        });

    }

    void compute() {
        if (!Double.isNaN(value1)) {
            value2 = Double.parseDouble(display.getText().toString());
            switch (ACTION) {
                case ADDITION:
                    value1 = value1 + value2;
                    break;
                case SUBTRACTION:
                    value1 = value1 - value2;
                    break;
                case MULTIPLICATION:
                    value1 = value1 * value2;
                    break;
                    case EXPONENT:
                    value1 =  Math.pow(value1,value2);
                    break;
                case DIVISION:
                    value1 = value1 / value2;
                    break;
                case EQU:
                    break;
            }
        } else {
            value1 = Double.parseDouble(display.getText().toString());
        }
    }

}

