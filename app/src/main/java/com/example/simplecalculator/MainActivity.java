package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonDivision, buttonMul, button10, buttonC, buttonEqual;
     EditText simplecalculatorEditText;

     float mValueOne, mValueTwo;

     boolean simplecalculatorAddition, mSubtract, simplecalculatorMultiplication, simplecalculatorDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        simplecalculatorEditText = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (simplecalculatorEditText == null){
                    simplecalculatorEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(simplecalculatorEditText.getText() + "");
                    simplecalculatorAddition = true;
                    simplecalculatorEditText.setText(null);
                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(simplecalculatorEditText.getText() + "");
                mSubtract = true;
                simplecalculatorEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(simplecalculatorEditText.getText() + "");
                simplecalculatorMultiplication = true;
                simplecalculatorEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(simplecalculatorEditText.getText() + "");
                simplecalculatorDivision = true;
                simplecalculatorEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(simplecalculatorEditText.getText() + "");

                if (simplecalculatorAddition == true) {
                    simplecalculatorEditText.setText(mValueOne + mValueTwo + "");
                    simplecalculatorAddition = false;
                }

                if (mSubtract == true) {
                    simplecalculatorEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (simplecalculatorMultiplication == true) {
                    simplecalculatorEditText.setText(mValueOne * mValueTwo + "");
                    simplecalculatorMultiplication = false;
                }

                if (simplecalculatorDivision == true) {
                    simplecalculatorEditText.setText(mValueOne / mValueTwo + "");
                    simplecalculatorDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplecalculatorEditText.setText(simplecalculatorEditText.getText() + ".");
            }
        });
    }
}
