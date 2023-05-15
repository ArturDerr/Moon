package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity {

    MediaPlayer mp;
    TextView textView;
    Context context = this;
    Button smileButton, closeSmileButton, buttonWakeup;
    RelativeLayout smileLayout, openSmileLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        timer();

        mp = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mp.setLooping(true);
        mp.start();

        //LayoutInflater layoutInflater = getLayoutInflater();
        //View layout = layoutInflater.inflate(R.layout.dialog, (ViewGroup)findViewById(R.id.layout_dialog));

        //final Toast toast = new Toast(getApplicationContext());
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        //toast.setDuration(Toast.LENGTH_SHORT);
        //toast.setView(layout);

        smileButton = findViewById(R.id.smileButton);
        buttonWakeup = findViewById(R.id.buttonWakeup);
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
        buttonWakeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmActivity.this, ExamplesActivity.class);
                //toast.show();
                startActivity(intent);
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
                                int hour = c.get(Calendar.HOUR_OF_DAY);
                                textView.setText(String.valueOf (hour) + ":" + String.valueOf(min));
                            }
                        });
                    } catch (Exception e) {
                        Toast.makeText(AlarmActivity.this, "Упс, что-то пошло нет так", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }).start();
    }
}