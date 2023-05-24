package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
    Button buttonWakeup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        timer();

        mp = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mp.setLooping(true);
        mp.start();

        buttonWakeup = findViewById(R.id.buttonWakeup);
        textView = findViewById(R.id.textView);

        buttonWakeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmActivity.this, ExamplesActivity.class);
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
                        Thread.sleep(0000);
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