package com.example.secondwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    EditText  number1 , number2;
    Button btn_plus,btn_minus;
    Button btn_kobeitu,btn_bolu;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);

        btn_plus=findViewById(R.id.btn_plus);
        btn_minus=findViewById(R.id.btn_minus);
        btn_kobeitu=findViewById(R.id.btn_kobeitu);
        btn_bolu=findViewById(R.id.btn_bolu);

        result=findViewById(R.id.result);

    }

    public void btn_plusclicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
        result.setText("Result"  + res);

    }
    public void btn_minuslicked (View view){
        int res = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
        result.setText("Result"  + res);

    }
    public void btn_kobeituclicked (View view){
        int res = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
        result.setText("Result : " + res);
    }
    public void btn_boluclicked (View view){
        int res = Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());
        result.setText("Result"  + res);
    }

    }