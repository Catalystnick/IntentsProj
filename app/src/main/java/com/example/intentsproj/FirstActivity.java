package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {



    protected EditText Number1,  Number2;
    private String integer1, integer2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);




        button = (Button) findViewById(R.id.Okbtn);
        Number1 = findViewById(R.id.textline1);
        Number2 = findViewById(R.id.textline2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSecondActivity();
            }
        });


    }

    public void openSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        integer1 = Number1.getText().toString();
        integer2 = Number2.getText().toString();

    intent.putExtra("Value1", integer1 );
    intent.putExtra("Value2", integer2);
        startActivity(intent);
        finish();
    }
}