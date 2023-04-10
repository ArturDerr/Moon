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

public class AlarmSleepActivity extends AppCompatActivity {

    private Button recIntentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_sleep);

        recIntentButton = findViewById(R.id.recIntentButton);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);

        recIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recIntentButton.startAnimation(animation);
                startActivity(new Intent(AlarmSleepActivity.this, RecommendationActivity.class));
            }
        });

        createOneShotVibrationUsingVibrationEffect();
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createOneShotVibrationUsingVibrationEffect() {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        VibrationEffect effect = VibrationEffect.createOneShot(2000, VibrationEffect.DEFAULT_AMPLITUDE);
        vibrator.vibrate(effect);
    }

}