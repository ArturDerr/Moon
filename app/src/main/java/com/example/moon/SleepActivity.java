package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SleepActivity extends AppCompatActivity {

    public int click;
    public static final int CLICK = 0;
    TextView textView, textHourSleep;
    RelativeLayout background;
    SharedPreferences sPref;
    Button buttonBackground;
    final String SAVED_CLICK = "saved_click";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        background.setBackgroundResource(R.drawable.zvezdnoe_nebo2);

        timer();

        textHourSleep = findViewById(R.id.textHourSleep);

        buttonBackground = findViewById(R.id.buttonBackground);

        background = findViewById(R.id.background);

        String text = getIntent().getStringExtra("hour");
        click = getIntent().getIntExtra("click", CLICK);

        textHourSleep.setText(text);

        saveClick();

        buttonBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SleepActivity.this, BackgroundActivity.class);
                startActivity(intent);
            }
        });

        if (click == 1){
            background.setBackgroundResource(R.drawable.picture1);
        }
        if (click == 2){
            background.setBackgroundResource(R.drawable.picture2);
        }
        if (click == 3){
            background.setBackgroundResource(R.drawable.picture3);
        }
        if (click == 4){
            background.setBackgroundResource(R.drawable.picture4);
        }
        if (click == 5){
            background.setBackgroundResource(R.drawable.picture5);
        }
        if (click == 6){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (click == 7){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (click == 8){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }

        textView = findViewById(R.id.textView);

    }
    public void saveClick () {
        SharedPreferences.Editor prefEditor = sPref.edit();
        prefEditor.putInt(SAVED_CLICK, click);
        prefEditor.apply();
    }
    public void loadClick () {
        int savedClick = sPref.getInt(SAVED_CLICK, click);

        if (savedClick == 1){
            background.setBackgroundResource(R.drawable.picture1);
        }
        if (savedClick == 2){
            background.setBackgroundResource(R.drawable.picture2);
        }
        if (savedClick == 3){
            background.setBackgroundResource(R.drawable.picture3);
        }
        if (savedClick == 4){
            background.setBackgroundResource(R.drawable.picture4);
        }
        if (savedClick == 5){
            background.setBackgroundResource(R.drawable.picture5);
        }
        if (savedClick == 6){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (savedClick == 7){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (savedClick == 8){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        loadClick();
    }
    boolean run = true;
    Handler mHandler = new Handler();

    public void timer() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (run) {
                    try {
                        Thread.sleep(1000);
                        mHandler.post(new Runnable() {

                            @Override
                            public void run() {
                                Calendar c = Calendar.getInstance();
                                int min = c.get(Calendar.MINUTE);
                                int hour = c.get(Calendar.HOUR);
                                textView.setText(String.valueOf(hour)+":"+String.valueOf(min));
                            }
                        });
                    } catch (Exception e) {
                    }
                }
            }
        }).start();
    }
}