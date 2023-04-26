package com.example.moon;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AlarmSleepActivity extends AppCompatActivity {

    private Button recIntentButton, buttonSleep;
    TextView musicTextView, defaultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_sleep);

        createOneShotVibrationUsingVibrationEffect();

        musicTextView = findViewById(R.id.musicTextView);
        musicTextView.setVisibility(View.GONE);
        defaultTextView = findViewById(R.id.defaultTextView);
        recIntentButton = findViewById(R.id.recIntentButton);
        buttonSleep = findViewById(R.id.buttonSleep);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        Bundle bundle1 = getIntent().getExtras();
        String textMusic1 = bundle1.get("music1").toString();

        Bundle bundle2 = getIntent().getExtras();
        String textMusic2 = bundle1.get("music2").toString();

        Bundle bundle3 = getIntent().getExtras();
        String textMusic3 = bundle1.get("music3").toString();

        if (bundle1 != null) {
            defaultTextView.setVisibility(View.GONE);
            musicTextView.setText(textMusic1);
        }
        else {
            defaultTextView.setVisibility(View.VISIBLE);
        }

        if (bundle2 != null) {
            defaultTextView.setVisibility(View.GONE);
            musicTextView.setText(textMusic2);
        }
        else {
            defaultTextView.setVisibility(View.VISIBLE);
        }

        if (bundle3 != null) {
            defaultTextView.setVisibility(View.GONE);
            musicTextView.setText(textMusic3);
        }
        else {
            defaultTextView.setVisibility(View.VISIBLE);
        }

        recIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recIntentButton.startAnimation(animation);
                startActivity(new Intent(AlarmSleepActivity.this, RecommendationActivity.class));
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
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createOneShotVibrationUsingVibrationEffect() {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        VibrationEffect effect = VibrationEffect.createOneShot(2000, VibrationEffect.DEFAULT_AMPLITUDE);
        vibrator.vibrate(effect);
    }

}