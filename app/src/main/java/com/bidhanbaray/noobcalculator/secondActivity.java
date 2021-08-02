package com.bidhanbaray.noobcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultText = (TextView) findViewById(R.id.showResult);
        resultText.setText("Result\n"+getIntent().getDoubleArrayExtra("result"));

    }
}
