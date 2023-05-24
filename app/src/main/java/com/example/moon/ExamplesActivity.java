package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Random;

public class ExamplesActivity extends AppCompatActivity {

    ImageView imgNumberExample1, imgNumberExample2, imgNumberExample3;
    Button button, button2, button3;
    TextView firstNumber, secondNumber, sign;
    TextInputLayout textInput, textInput2, textInput3;
    EditText editTextNumber, editTextNumber2, editTextNumber3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examples);

        LayoutInflater layoutInflater = getLayoutInflater();
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View layout = layoutInflater.inflate(R.layout.dialog, (ViewGroup)findViewById(R.id.layout_dialog));

        final Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);


        LayoutInflater layoutInflater2 = getLayoutInflater();
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View layout2 = layoutInflater2.inflate(R.layout.dialog2, (ViewGroup)findViewById(R.id.layout_dialog2));

        final Toast toast2 = new Toast(getApplicationContext());
        toast2.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast2.setDuration(Toast.LENGTH_SHORT);
        toast2.setView(layout2);

        textInput = findViewById(R.id.textInput);
        textInput2 = findViewById(R.id.textInput2);
        textInput3 = findViewById(R.id.textInput3);
        imgNumberExample1 = findViewById(R.id.imgNumberExample1);
        imgNumberExample2 = findViewById(R.id.imgNumberExample2);
        imgNumberExample3 = findViewById(R.id.imgNumberExample3);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        sign = findViewById(R.id.sign);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);

        imgNumberExample2.setVisibility(View.GONE);
        imgNumberExample3.setVisibility(View.GONE);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.alpha_recommendation);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.alpha_recommendation);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.alpha_recommendation);

        editTextNumber2.setVisibility(View.GONE);
        editTextNumber2.setClickable(false);

        editTextNumber3.setVisibility(View.GONE);
        editTextNumber3.setClickable(false);

        textInput2.setVisibility(View.GONE);
        textInput3.setVisibility(View.GONE);

        sign.setText("+");
        button2.setVisibility(View.GONE);
        button2.setClickable(false);
        button3.setVisibility(View.GONE);
        button3.setClickable(false);

        final Random random = new Random();

        int number1 = (random.nextInt(100));
        int number2 = (random.nextInt(150));

        int number3 = (random.nextInt(100));
        int number4 = (random.nextInt(20));

        int number5 = (random.nextInt(20));
        int number6 = (random.nextInt(20));

        firstNumber.setText(String.valueOf(number1));
        secondNumber.setText(String.valueOf(number2));

        String result = String.valueOf(number1 + number2);

        String result2 = String.valueOf(number3 - number4);

        String result3 = String.valueOf(number5 * number6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button.startAnimation(animation1);
                String editText = editTextNumber.getText().toString();

                if (editText.equals(result)) {
                    toast.show();
                    sign.setText("-");
                    textInput.setVisibility(View.GONE);
                    textInput2.setVisibility(View.VISIBLE);
                    imgNumberExample1.setVisibility(View.GONE);
                    imgNumberExample2.setVisibility(View.VISIBLE);
                    firstNumber.setText(String.valueOf(number3));
                    secondNumber.setText(String.valueOf(number4));
                    editTextNumber2.setClickable(true);
                    editTextNumber2.setVisibility(View.VISIBLE);
                    editTextNumber.setVisibility(View.GONE);
                    editTextNumber.setClickable(false);
                    button.setClickable(false);
                    button.setVisibility(View.GONE);
                    button2.setVisibility(View.VISIBLE);
                    button2.setClickable(true);
                }
                else {
                    toast2.show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.startAnimation(animation2);
                String editText2 = editTextNumber2.getText().toString();

                if (editText2.equals(result2)) {
                    toast.show();
                    sign.setText("×");
                    textInput2.setVisibility(View.GONE);
                    textInput3.setVisibility(View.VISIBLE);
                    imgNumberExample2.setVisibility(View.GONE);
                    imgNumberExample3.setVisibility(View.VISIBLE);
                    editTextNumber2.setClickable(false);
                    editTextNumber2.setVisibility(View.GONE);
                    editTextNumber3.setClickable(true);
                    editTextNumber3.setVisibility(View.VISIBLE);
                    firstNumber.setText(String.valueOf(number5));
                    secondNumber.setText(String.valueOf(number6));
                    button.setClickable(false);
                    button.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                    button2.setClickable(false);
                    button3.setVisibility(View.VISIBLE);
                    button3.setClickable(true);
                }
                else {
                    toast2.show();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.startAnimation(animation3);
                String editText3 = editTextNumber3.getText().toString();

                if (editText3.equals(result3)) {
                    toast.show();
                    Intent intent = new Intent(ExamplesActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    toast2.show();
                }
            }
        });
    }
}