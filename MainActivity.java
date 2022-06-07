package com.example.gpa_yournetid_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4, ed5;
    TextView ed6;
    Button btn1;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.C11);
        ed2 = findViewById(R.id.C2);
        ed3 = findViewById(R.id.C3);
        ed4 = findViewById(R.id.C4);
        ed5 = findViewById(R.id.C5);
        ed6 = findViewById(R.id.C6);
        {
            if (ed5.length() == 0) {
                ed5.requestFocus();
                ed5.setError("Field cannot be empty!");
            }
        }
        if (ed4.length() == 0) {
            ed4.requestFocus();
            ed4.setError("Field cannot be empty!");
        }
        if (ed3.length() == 0) {
            ed3.requestFocus();
            ed3.setError("Field cannot be empty!");
        }
        if (ed2.length() == 0) {
            ed2.requestFocus();
            ed2.setError("Field cannot be empty!");

        }
        if (ed1.length() == 0) {
            ed1.requestFocus();
            ed1.setError("Field cannot be empty!");
        }
        ed6.setBackgroundColor(Color.MAGENTA);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CALC();
                clear();

            }
        });

    }

    public void CALC() {
        float m1, m2, m3, m4, m5;
        float total;
        if (count % 2 == 0) {
            if (ed1.getText().toString().equals("") || ed2.getText().toString().equals("") || ed3.getText().toString().equals("") || ed4.getText().toString().equals("") || ed5.getText().toString().equals(""))
            {
                ed6.setText("ENTER ALL GRADES IN THE FIELD");
            }
            else{
                m1 = Float.parseFloat(ed1.getText().toString());
                m2 = Float.parseFloat(ed2.getText().toString());
                m3 = Float.parseFloat(ed3.getText().toString());
                m4 = Float.parseFloat(ed4.getText().toString());
                m5 = Float.parseFloat(ed5.getText().toString());
                total = m1 + m2 + m3 + m4 + m5;
                float avg = total / 5;
                if (avg < 60) {
                    ed6.setBackgroundColor(Color.RED);
                    ed6.setText(Float.toString(avg));
                } else if (avg > 60 && avg < 80) {
                    ed6.setBackgroundColor(Color.YELLOW);
                    ed6.setText(Float.toString(avg));
                } else if (avg >= 80 && avg <= 100) {
                    ed6.setText(Float.toString(avg));
                    ed6.setBackgroundColor(Color.GREEN);
                } else {
                    ed6.setBackgroundColor(Color.MAGENTA);
                }
                count++;
            }}
                else{
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                ed5.setText("");
                btn1.setText("Compute GPA");

            }
        }
        //setContentView(ed6);


            public void clear ()
            {
                btn1.setText("---");
            }
        }


