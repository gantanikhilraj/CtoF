package com.example.code;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        num1=(EditText) findViewById(R.id.etNum1);
        add=(Button) findViewById(R.id.btnAdd);
        result=(TextView) findViewById(R.id.tvAnswer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(num1.getText().toString())){
                    num1.setError("Enter Celsius°");
                    return;
                }
                float number1=Float.parseFloat(num1.getText().toString());
                float sum=(number1*9/5)+32;
                result.setText("Farenheit° is : "+String.valueOf(sum));
            }
        });
    }
}