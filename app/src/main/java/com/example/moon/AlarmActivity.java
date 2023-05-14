package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity {

    MediaPlayer mp;
    TextView textView;
    Context context = this;
    Button smileButton, closeSmileButton;
    RelativeLayout smileLayout, openSmileLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        timer();

        mp = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mp.setLooping(true);
        mp.start();

        smileButton = findViewById(R.id.smileButton);
        closeSmileButton = findViewById(R.id.closeSmileButton);
        smileLayout = findViewById(R.id.smileLayout);
        openSmileLayout = findViewById(R.id.openSmileLayout);
        textView = findViewById(R.id.textView);

        openSmileLayout.setVisibility(View.GONE);
        closeSmileButton.setClickable(false);

        smileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSmileLayout.setVisibility(View.VISIBLE);
                smileLayout.setVisibility(View.GONE);
                smileButton.setClickable(false);
            }
        });
        closeSmileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smileButton.setClickable(true);
                smileLayout.setVisibility(View.VISIBLE);
                openSmileLayout.setVisibility(View.GONE);
            }
        });


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