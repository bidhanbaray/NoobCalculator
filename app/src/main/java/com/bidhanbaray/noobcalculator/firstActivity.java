package com.bidhanbaray.noobcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class firstActivity extends AppCompatActivity {
    EditText firstNumber, secondNumber;
    Button addButton,subtractButton,multiplicationButton,divideButton, equalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);

        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplicationButton = findViewById(R.id.multiplicationButton);
        divideButton = findViewById(R.id.divideButton);
        equalButton = findViewById(R.id.equalButton);

        addButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String number =firstNumber.getText().toString();
                final double num1 = Double.parseDouble(number);

                equalButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String number =secondNumber.getText().toString();
                        double num2 = Double.parseDouble(number);
                        double num = num1+num2;
                        Intent intent = new Intent(firstActivity.this,secondActivity.class);
                        intent.putExtra("result",num);

                        startActivity(intent);
                    }
                });



            }
        });
        subtractButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String number =firstNumber.getText().toString();
                final double num1 = Double.parseDouble(number);

                equalButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String number =secondNumber.getText().toString();
                        double num2 = Double.parseDouble(number);
                        double num = num1-num2;
                        Intent intent = new Intent(firstActivity.this,secondActivity.class);
                        intent.putExtra("result",num);

                        startActivity(intent);
                    }
                });



            }
        });
        multiplicationButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String number =firstNumber.getText().toString();
                final double num1 = Double.parseDouble(number);

                equalButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String number =secondNumber.getText().toString();
                        double num2 = Double.parseDouble(number);
                        double num = num1 * num2;
                        Intent intent = new Intent(firstActivity.this,secondActivity.class);
                        intent.putExtra("result",num);

                        startActivity(intent);
                    }
                });



            }
        });
        divideButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String number =firstNumber.getText().toString();
                final double num1 = Double.parseDouble(number);

                equalButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String number =secondNumber.getText().toString();
                        double num2 = Double.parseDouble(number);
                        double num = num1 / num2;
                        Intent intent = new Intent(firstActivity.this,secondActivity.class);
                        intent.putExtra("result", num);

                        startActivity(intent);
                    }
                });



            }
        });



    }
}
