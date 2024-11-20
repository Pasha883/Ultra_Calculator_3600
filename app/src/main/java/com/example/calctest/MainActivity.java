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

import com.example.calctest.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    
    ActivityMainBinding binding;
    
    /*EditText binding.name;
    EditText binding.name2;
    Button plus;
    Button minus;
    Button umn;
    Button fraction;
    TextView binding.enter;*/

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    
        
        /*binding.enter = findViewById(R.id.binding.enter);
        binding.name = findViewById(R.id.name);
        binding.name2 = findViewById(R.id.name2);

        plus = findViewById(R.id.pl);
        minus = findViewById(R.id.min);
        umn = findViewById(R.id.umn);
        fraction = findViewById(R.id.fract);*/

        binding.pl.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(binding.name.getText().toString());
                double b = Double.parseDouble(binding.name.getText().toString());
                double c = a + b;
                binding.enter.setText(String.format(Locale.US,"%.3f", c));

                binding.name.setText("");
                binding.name2.setText("");
            }
            catch (Exception e){
                binding.enter.setText("Invalid, try again");
            }
        });
        binding.min.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(binding.name.getText().toString());
                double b = Double.parseDouble(binding.name2.getText().toString());
                double c = a - b;
                binding.enter.setText(String.format(Locale.US,"%.3f", c));

                binding.name.setText("");
                binding.name2.setText("");
            }
            catch (Exception e){
                binding.enter.setText("Invalid, try again");
            }
        });
        binding.umn.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(binding.name.getText().toString());
                double b = Double.parseDouble(binding.name2.getText().toString());
                double c = a * b;
                binding.enter.setText(String.format(Locale.US,"%.3f", c));

                binding.name.setText("");
                binding.name2.setText("");
            }
            catch (Exception e){
                binding.enter.setText("Invalid, try again");
            }
        });
        binding.fract.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(binding.name.getText().toString());
                double b = Double.parseDouble(binding.name2.getText().toString());
                if(b != 0) {
                    double c = a / b;
                    binding.enter.setText(String.format(Locale.US,"%.3f", c));
                }
                else{
                    binding.enter.setText("Zero division");
                }
                binding.name.setText("");
                binding.name2.setText("");
            }
            catch (Exception e){
                binding.enter.setText("Invalid, try again");
            }
        });
    }
}