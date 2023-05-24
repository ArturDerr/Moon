package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AlarmSleepActivity extends AppCompatActivity {

    public static final int CLICK = 0;
    private Button recIntentButton, buttonSleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_sleep);

        recIntentButton = findViewById(R.id.recIntentButton);
        buttonSleep = findViewById(R.id.buttonWakeup);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        recIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recIntentButton.startAnimation(animation);
                startActivity(new Intent(AlarmSleepActivity.this, RecommendationSleepActivity.class));
            }
        });
        buttonSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSleep.startAnimation(animation2);
                Intent intent1 = new Intent(AlarmSleepActivity.this, SleepActivity.class);
                startActivity(intent1);

            }
        });
    }

}