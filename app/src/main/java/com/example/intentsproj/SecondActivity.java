package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView textView1, textView2, result;
    String number1, number2;
    int num1, num2 , result_num;

    Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        textView1 = findViewById(R.id.textline1);
        textView2 = findViewById(R.id.textline2);
        result = findViewById(R.id.result_num);

        number1 = getIntent().getExtras().getString("Value1");
        number2 = getIntent().getExtras().getString("Value2");

        textView1.setText(number1);
        textView2.setText(number2);

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the ok button";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
        toast.show();

        add = findViewById(R.id.plusbtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1);
                num2 = Integer.parseInt(number2);
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));

            }
        });

        subtract = findViewById(R.id.minusbtn);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1);
                num2 = Integer.parseInt(number2);


                result_num = num1 - num2;

                result.setText(String.valueOf(result_num));

            }
        });

        multiply = findViewById(R.id.multiplybtn);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1);
                num2 = Integer.parseInt(number2);
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));
            }
        });

        divide = findViewById(R.id.dividebtn);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1);
                num2 = Integer.parseInt(number2);
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));
            }
        });


    }


    }


