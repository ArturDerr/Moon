package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class AlarmActivity extends AppCompatActivity {
    MediaPlayer mp;
    Context context;
    Button smileButton, closeSmileButton;
    RelativeLayout smileLayout, openSmileLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        smileButton = findViewById(R.id.smileButton);
        closeSmileButton = findViewById(R.id.closeSmileButton);
        smileLayout = findViewById(R.id.smileLayout);
        openSmileLayout = findViewById(R.id.openSmileLayout);

        mp = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mp.setLooping(true);
        mp.start();

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
}