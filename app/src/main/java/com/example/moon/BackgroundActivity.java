package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class BackgroundActivity extends AppCompatActivity {

    int imageClick = 0;
    Button backButton, button1, button2, button3, button4, button5, button6, button7, button8;
    ImageView image1, image2, image3, image4, image5, image6, image7, image8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);

        backButton = findViewById(R.id.backButton);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation5 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation6 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation7 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation8 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 1;
                button1.startAnimation(animation1);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 2;
                button2.startAnimation(animation2);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 3;
                button3.startAnimation(animation3);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 4;
                button4.startAnimation(animation4);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 5;
                button5.startAnimation(animation5);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 6;
                button6.startAnimation(animation6);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 7;
                button7.startAnimation(animation7);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageClick = 8;
                button8.startAnimation(animation8);
                Intent intent = new Intent(BackgroundActivity.this, SleepActivity.class);
                intent.putExtra("click", imageClick);
            }
        });

    }
}