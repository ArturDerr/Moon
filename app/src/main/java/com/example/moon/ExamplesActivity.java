package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class ExamplesActivity extends AppCompatActivity {

    Button button;
    TextView firstNumber, secondNumber, textViewResult, textView;
    EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examples);

        button = findViewById(R.id.button);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        editTextNumber = findViewById(R.id.editTextNumber);
        textViewResult = findViewById(R.id.textViewResult);
        textView = findViewById(R.id.textView);

        final Random random = new Random();

        int number1 = (random.nextInt(100));
        int number2 = (random.nextInt(150));

        firstNumber.setText(String.valueOf(number1));
        secondNumber.setText(String.valueOf(number2));

        String result = String.valueOf(number1 + number2);
        textViewResult.setText(result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editText = editTextNumber.getText().toString();

                if (editText.equals(result)) {
                    textView.setText("Верно");
                }
            }
        });
    }
}