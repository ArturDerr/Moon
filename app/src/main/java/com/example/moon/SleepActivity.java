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
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SleepActivity extends AppCompatActivity {

    public int click;
    public static final int CLICK = 0;
    TextView textView;
    RelativeLayout background;
    SharedPreferences sPref;
    Button buttonBackground;
    final String SAVED_CLICK = "saved_click";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        //background.setBackgroundResource(R.drawable.zvezdnoe_nebo2);

        timer();

        buttonBackground = findViewById(R.id.buttonBackground);

        background = findViewById(R.id.background);

        click = getIntent().getIntExtra("click", CLICK);

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
            //background.setBackgroundResource(R.drawable.picture6);
        }
        if (click == 7){
            //background.setBackgroundResource(R.drawable.picture7);
        }
        if (click == 8){
            //background.setBackgroundResource(R.drawable.picture8);
        }

        textView = findViewById(R.id.textView);

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
                                textView.setText(String.valueOf(hour)+":"+String.valueOf(min));
                            }
                        });
                    } catch (Exception e) {
                        Toast.makeText(SleepActivity.this, "Упс, что-то пошло нет так", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }).start();
    }
}