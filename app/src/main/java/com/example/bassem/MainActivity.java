package com.example.bassem;

import android.os .Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView endv=findViewById(R.id.end);
        final EditText num1=findViewById(R.id.num1);
        final EditText num2=findViewById(R.id.num2);
        final Button b1=findViewById(R.id.b1);
        final Button b2=findViewById(R.id.b2);
        final Button b3=findViewById(R.id.b3);
        final Button b4=findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int b11=n1+n2;
                endv.setText(String.valueOf(b11));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int b22=n1-n2;
                endv.setText(String.valueOf(b22));

            }
        }); b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int b44=n1/n2;

                endv.setText(String.valueOf(b44));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int a =n1*n2;
                endv.setText(String.valueOf(a));

            }
        });


    }
}
