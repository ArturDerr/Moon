package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class SleepActivity extends AppCompatActivity {

    public int click = getIntent().getIntExtra("click", CLICK);

    public static final int CLICK = 0;
    SimpleDateFormat simpleDateFormat;
    TextView textView, textHourSleep;
    RelativeLayout background;
    SharedPreferences sPref;
    final String SAVED_CLICK = "saved_click";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        textHourSleep = findViewById(R.id.textHourSleep);

        background = findViewById(R.id.background);

        String text = getIntent().getStringExtra("hour");
        int click = getIntent().getIntExtra("click", CLICK);

        textHourSleep.setText(text);

        saveClick();

        if (click == 1){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (click == 2){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (click == 3){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (click == 4){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (click == 5){
            //background.setBackgroundResource(R.drawable.round_back_home);
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

        if (savedInstanceState != null) {
            Intent intent = new Intent(this, SleepActivity.class);
            startActivity(intent);
        }

        simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());

        textView = findViewById(R.id.textView);

        textView.setText(simpleDateFormat.toString());
    }
    public void saveClick () {
        SharedPreferences.Editor prefEditor = sPref.edit();
        prefEditor.putInt(SAVED_CLICK, click);
        prefEditor.apply();
    }
    public void loadClick () {
        int savedClick = sPref.getInt(SAVED_CLICK, click);

        if (savedClick == 1){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (savedClick == 2){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (savedClick == 3){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (savedClick == 4){
            //background.setBackgroundResource(R.drawable.round_back_home);
        }
        if (savedClick == 5){
            //background.setBackgroundResource(R.drawable.round_back_home);
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
}