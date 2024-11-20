package com.example.calctest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    Button plus;
    Button minus;
    Button umn;
    Button fraction;
    TextView enter;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.enter);
        text1 = findViewById(R.id.name);
        text2 = findViewById(R.id.name2);

        plus = findViewById(R.id.pl);
        minus = findViewById(R.id.min);
        umn = findViewById(R.id.umn);
        fraction = findViewById(R.id.fract);

        plus.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                double c = a + b;
                enter.setText(String.format(Locale.US,"%.3f", c));

                text1.setText("");
                text2.setText("");
            }
            catch (Exception e){
                enter.setText("Invalid, try again");
            }
        });
        minus.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                double c = a - b;
                enter.setText(String.format(Locale.US,"%.3f", c));

                text1.setText("");
                text2.setText("");
            }
            catch (Exception e){
                enter.setText("Invalid, try again");
            }
        });
        umn.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                double c = a * b;
                enter.setText(String.format(Locale.US,"%.3f", c));

                text1.setText("");
                text2.setText("");
            }
            catch (Exception e){
                enter.setText("Invalid, try again");
            }
        });
        fraction.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                if(b != 0) {
                    double c = a / b;
                    enter.setText(String.format(Locale.US,"%.3f", c));
                }
                else{
                    enter.setText("Zero division");
                }
                text1.setText("");
                text2.setText("");
            }
            catch (Exception e){
                enter.setText("Invalid, try again");
            }
        });
    }
}