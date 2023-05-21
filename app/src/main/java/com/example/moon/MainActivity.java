package com.example.moon;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.moon.databinding.ActivityMainBinding;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int selectedTab = 1;

    Button intentSleepActivity;
    Button upButton, closeButton;
    Button time1, time2, time3, time4, time5, time6, time7, time8, time9, time10, time11, time12, time13, time14, time15;
    Button timeSelected1, timeSelected2,timeSelected3,timeSelected4,timeSelected5,timeSelected6,timeSelected7,timeSelected8,timeSelected9,timeSelected10,timeSelected11,timeSelected12,timeSelected13,timeSelected14,timeSelected15;
    RelativeLayout openLayout;
    LinearLayout selectedLayout1, selectedLayout2,selectedLayout3,selectedLayout4,selectedLayout5,selectedLayout6,selectedLayout7,selectedLayout8,selectedLayout9,selectedLayout10,selectedLayout11,selectedLayout12,selectedLayout13, selectedLayout14, selectedLayout15;
    LinearLayout sleepTimeLayout1, sleepTimeLayout2,sleepTimeLayout3,sleepTimeLayout4,sleepTimeLayout5,sleepTimeLayout6,sleepTimeLayout7,sleepTimeLayout8,sleepTimeLayout9,sleepTimeLayout10,sleepTimeLayout11,sleepTimeLayout12,sleepTimeLayout13,sleepTimeLayout14, sleepTimeLayout15, selectTimeLayout;
    NotificationCompat.Builder builder;
    PendingIntent pendingIntent;
    private TextView hour, hourNotification;
    private Button setAlarm, alarmRecButton, setNotification;
    Calendar calendar, calendar3;
    SimpleDateFormat simpleDateFormat;
    AlarmManager alarmManager;

    SharedPreferences sPref;

    final String SAVED_HOURS = "saved_hours";
    final String SAVED_HOURS_NOTIFICATION = "saved_hours_notification";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createNotificationChannel();

        intentSleepActivity = findViewById(R.id.intentSleepActivity);

        intentSleepActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SleepActivity.class);
                startActivity(intent);
            }
        });
        upButton = findViewById(R.id.upButton);
        closeButton = findViewById(R.id.closeButton);

        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);
        time4 = findViewById(R.id.time4);
        time5 = findViewById(R.id.time5);
        time6 = findViewById(R.id.time6);
        time7 = findViewById(R.id.time7);
        time8 = findViewById(R.id.time8);
        time9 = findViewById(R.id.time9);
        time10 = findViewById(R.id.time10);
        time11 = findViewById(R.id.time11);
        time12 = findViewById(R.id.time12);
        time13 = findViewById(R.id.time13);
        time14 = findViewById(R.id.time14);
        time15 = findViewById(R.id.time15);

        timeSelected1 = findViewById(R.id.timeSelected1);
        timeSelected2 = findViewById(R.id.timeSelected2);
        timeSelected3 = findViewById(R.id.timeSelected3);
        timeSelected4 = findViewById(R.id.timeSelected4);
        timeSelected5 = findViewById(R.id.timeSelected5);
        timeSelected6 = findViewById(R.id.timeSelected6);
        timeSelected7 = findViewById(R.id.timeSelected7);
        timeSelected8 = findViewById(R.id.timeSelected8);
        timeSelected9 = findViewById(R.id.timeSelected9);
        timeSelected10 = findViewById(R.id.timeSelected10);
        timeSelected11 = findViewById(R.id.timeSelected11);
        timeSelected12 = findViewById(R.id.timeSelected12);
        timeSelected13 = findViewById(R.id.timeSelected13);
        timeSelected14 = findViewById(R.id.timeSelected14);
        timeSelected15 = findViewById(R.id.timeSelected15);

        selectedLayout1 = findViewById(R.id.selectedLayout1);
        selectedLayout2 = findViewById(R.id.selectedLayout2);
        selectedLayout3 = findViewById(R.id.selectedLayout3);
        selectedLayout4 = findViewById(R.id.selectedLayout4);
        selectedLayout5 = findViewById(R.id.selectedLayout5);
        selectedLayout6 = findViewById(R.id.selectedLayout6);
        selectedLayout7 = findViewById(R.id.selectedLayout7);
        selectedLayout8 = findViewById(R.id.selectedLayout8);
        selectedLayout9 = findViewById(R.id.selectedLayout9);
        selectedLayout10 = findViewById(R.id.selectedLayout10);
        selectedLayout11 = findViewById(R.id.selectedLayout11);
        selectedLayout12 = findViewById(R.id.selectedLayout12);
        selectedLayout13 = findViewById(R.id.selectedLayout13);
        selectedLayout14 = findViewById(R.id.selectedLayout14);
        selectedLayout15 = findViewById(R.id.selectedLayout15);

        openLayout = findViewById(R.id.openLayout);

        openLayout.setVisibility(View.GONE);

        selectedLayout1.setVisibility(View.GONE);
        selectedLayout2.setVisibility(View.GONE);
        selectedLayout3.setVisibility(View.GONE);
        selectedLayout4.setVisibility(View.GONE);
        selectedLayout5.setVisibility(View.GONE);
        selectedLayout6.setVisibility(View.GONE);
        selectedLayout7.setVisibility(View.GONE);
        selectedLayout8.setVisibility(View.GONE);
        selectedLayout9.setVisibility(View.GONE);
        selectedLayout10.setVisibility(View.GONE);
        selectedLayout11.setVisibility(View.GONE);
        selectedLayout12.setVisibility(View.GONE);
        selectedLayout13.setVisibility(View.GONE);
        selectedLayout14.setVisibility(View.GONE);
        selectedLayout15.setVisibility(View.GONE);

        sleepTimeLayout1 = findViewById(R.id.sleepTimeLayout1);
        sleepTimeLayout2 = findViewById(R.id.sleepTimeLayout2);
        sleepTimeLayout3 = findViewById(R.id.sleepTimeLayout3);
        sleepTimeLayout4 = findViewById(R.id.sleepTimeLayout4);
        sleepTimeLayout5 = findViewById(R.id.sleepTimeLayout5);
        sleepTimeLayout6 = findViewById(R.id.sleepTimeLayout6);
        sleepTimeLayout7 = findViewById(R.id.sleepTimeLayout7);
        sleepTimeLayout8 = findViewById(R.id.sleepTimeLayout8);
        sleepTimeLayout9 = findViewById(R.id.sleepTimeLayout9);
        sleepTimeLayout10 = findViewById(R.id.sleepTimeLayout10);
        sleepTimeLayout11 = findViewById(R.id.sleepTimeLayout11);
        sleepTimeLayout12 = findViewById(R.id.sleepTimeLayout12);
        sleepTimeLayout13 = findViewById(R.id.sleepTimeLayout13);
        sleepTimeLayout14 = findViewById(R.id.sleepTimeLayout14);
        sleepTimeLayout15 = findViewById(R.id.sleepTimeLayout15);

        sleepTimeLayout1.setVisibility(View.GONE);
        sleepTimeLayout2.setVisibility(View.GONE);
        sleepTimeLayout3.setVisibility(View.GONE);
        sleepTimeLayout4.setVisibility(View.GONE);
        sleepTimeLayout5.setVisibility(View.GONE);
        sleepTimeLayout6.setVisibility(View.GONE);
        sleepTimeLayout7.setVisibility(View.GONE);
        sleepTimeLayout8.setVisibility(View.GONE);
        sleepTimeLayout9.setVisibility(View.GONE);
        sleepTimeLayout10.setVisibility(View.GONE);
        sleepTimeLayout11.setVisibility(View.GONE);
        sleepTimeLayout12.setVisibility(View.GONE);
        sleepTimeLayout13.setVisibility(View.GONE);
        sleepTimeLayout14.setVisibility(View.GONE);
        sleepTimeLayout15.setVisibility(View.GONE);

        selectTimeLayout = findViewById(R.id.selectTimeLayout);

        alarmRecButton = findViewById(R.id.alarmRecButton);

        hourNotification = findViewById(R.id.hourNotification);

        setNotification = findViewById(R.id.setNotification);

        setAlarm = findViewById(R.id.setAlarm);

        sPref = getPreferences(MODE_PRIVATE);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation5 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation6 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation7 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation8 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation9 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation10 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation11 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation12 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation13 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation14 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation15 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation16 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation17 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation18 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation19 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        hour = findViewById(R.id.hour);

        Intent intent = new Intent(getApplicationContext(), AlarmSleepActivity.class);

        final LinearLayout homeLayout = findViewById(R.id.homeLayout);
        final LinearLayout musicLayout = findViewById(R.id.musicLayout);
        final LinearLayout notesLayout = findViewById(R.id.notesLayout);

        final TextView homeTxt = findViewById(R.id.homeTxt);
        final TextView musicTxt = findViewById(R.id.musicTxt);
        final TextView notesTxt = findViewById(R.id.notesTxt);

        final ImageView homeImage = findViewById(R.id.homeImage);
        final ImageView musicImage = findViewById(R.id.musicImage);
        final ImageView notesImage = findViewById(R.id.notesImage);

        simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());

        loadText();

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
                upButton.setClickable(false);
                closeButton.setClickable(true);
            }
        });
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.GONE);
                upButton.setClickable(true);
                closeButton.setClickable(false);
            }
        });
        time1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time1.startAnimation(animation3);
                openLayout.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.VISIBLE);
                sleepTimeLayout1.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);
                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time2.startAnimation(animation4);
                openLayout.setVisibility(View.GONE);
                selectedLayout2.setVisibility(View.VISIBLE);
                sleepTimeLayout2.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);

            }
        });
        time3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time3.startAnimation(animation5);
                openLayout.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.VISIBLE);
                sleepTimeLayout3.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time4.startAnimation(animation6);
                openLayout.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.VISIBLE);
                sleepTimeLayout4.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time5.startAnimation(animation7);
                openLayout.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.VISIBLE);
                sleepTimeLayout5.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time6.startAnimation(animation8);
                openLayout.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.VISIBLE);
                sleepTimeLayout6.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time7.startAnimation(animation9);
                openLayout.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.VISIBLE);
                sleepTimeLayout7.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time8.startAnimation(animation10);
                openLayout.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.VISIBLE);
                sleepTimeLayout10.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time9.startAnimation(animation11);
                openLayout.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.VISIBLE);
                sleepTimeLayout9.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time10.startAnimation(animation12);
                openLayout.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.VISIBLE);
                sleepTimeLayout10.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time11.startAnimation(animation13);
                openLayout.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.VISIBLE);
                sleepTimeLayout11.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time12.startAnimation(animation14);
                openLayout.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.VISIBLE);
                sleepTimeLayout12.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time13.startAnimation(animation15);
                openLayout.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.VISIBLE);
                sleepTimeLayout13.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time14.startAnimation(animation16);
                openLayout.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.VISIBLE);
                sleepTimeLayout14.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.GONE);
                sleepTimeLayout15.setVisibility(View.GONE);
            }
        });
        time15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time15.startAnimation(animation17);
                openLayout.setVisibility(View.GONE);
                selectedLayout15.setVisibility(View.VISIBLE);
                sleepTimeLayout15.setVisibility(View.VISIBLE);
                selectTimeLayout.setVisibility(View.GONE);

                selectedLayout2.setVisibility(View.GONE);
                sleepTimeLayout2.setVisibility(View.GONE);
                selectedLayout3.setVisibility(View.GONE);
                sleepTimeLayout3.setVisibility(View.GONE);
                selectedLayout4.setVisibility(View.GONE);
                sleepTimeLayout4.setVisibility(View.GONE);
                selectedLayout5.setVisibility(View.GONE);
                sleepTimeLayout5.setVisibility(View.GONE);
                selectedLayout6.setVisibility(View.GONE);
                sleepTimeLayout6.setVisibility(View.GONE);
                selectedLayout7.setVisibility(View.GONE);
                sleepTimeLayout7.setVisibility(View.GONE);
                selectedLayout8.setVisibility(View.GONE);
                sleepTimeLayout8.setVisibility(View.GONE);
                selectedLayout9.setVisibility(View.GONE);
                sleepTimeLayout9.setVisibility(View.GONE);
                selectedLayout10.setVisibility(View.GONE);
                sleepTimeLayout10.setVisibility(View.GONE);
                selectedLayout11.setVisibility(View.GONE);
                sleepTimeLayout11.setVisibility(View.GONE);
                selectedLayout12.setVisibility(View.GONE);
                sleepTimeLayout12.setVisibility(View.GONE);
                selectedLayout13.setVisibility(View.GONE);
                sleepTimeLayout13.setVisibility(View.GONE);
                selectedLayout14.setVisibility(View.GONE);
                sleepTimeLayout14.setVisibility(View.GONE);
                selectedLayout1.setVisibility(View.GONE);
                sleepTimeLayout1.setVisibility(View.GONE);
            }
        });
        timeSelected1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);

            }
        });
        timeSelected3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);

            }
        });
        timeSelected4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });
        timeSelected15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLayout.setVisibility(View.VISIBLE);
            }
        });

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTab != 1) {

                    musicTxt.setVisibility(View.GONE);
                    notesTxt.setVisibility(View.GONE);

                    musicImage.setImageResource(R.drawable.ic_music);
                    notesImage.setImageResource(R.drawable.ic_notes);

                    musicLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    homeTxt.setVisibility(View.VISIBLE);
                    homeImage.setImageResource(R.drawable.ic_home_selected);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

                    selectedTab = 1;
                }

            }
        });
        musicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTab != 2) {

                    startActivity(new Intent(getApplicationContext(), MusicActivity.class));
                    overridePendingTransition(0, 0);

                    homeTxt.setVisibility(View.GONE);
                    notesTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    notesImage.setImageResource(R.drawable.ic_notes);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    musicTxt.setVisibility(View.VISIBLE);
                    musicImage.setImageResource(R.drawable.ic_music_selected);
                    musicLayout.setBackgroundResource(R.drawable.round_back_music);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    musicLayout.startAnimation(scaleAnimation);

                    finish();

                    selectedTab = 2;
                }

            }
        });
        notesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTab != 3) {

                    startActivity(new Intent(getApplicationContext(), NotesActivity.class));
                    overridePendingTransition(0, 0);

                    homeTxt.setVisibility(View.GONE);
                    musicTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    musicImage.setImageResource(R.drawable.ic_music);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    musicLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    notesTxt.setVisibility(View.VISIBLE);
                    notesImage.setImageResource(R.drawable.ic_notes_selected);
                    notesLayout.setBackgroundResource(R.drawable.round_back_notes);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    notesLayout.startAnimation(scaleAnimation);

                    finish();

                    selectedTab = 3;
                }
            }
        });
        setAlarm.setOnClickListener(v -> {
            MaterialTimePicker materialTimePicker = new MaterialTimePicker.Builder()
                    .setTimeFormat(TimeFormat.CLOCK_24H)
                    .setHour(9)
                    .setMinute(0)
                    .setTitleText("Выберите время")
                    .build();
            setAlarm.startAnimation(animation);

            materialTimePicker.addOnPositiveButtonClickListener(view1 -> {
                calendar = Calendar.getInstance();
                calendar.set(Calendar.SECOND, 0);
                calendar.set(Calendar.MILLISECOND, 0);
                calendar.set(Calendar.MINUTE, materialTimePicker.getMinute());
                calendar.set(Calendar.HOUR_OF_DAY, materialTimePicker.getHour());

                if (calendar.getTimeInMillis() <= System.currentTimeMillis()) {
                    calendar.add(Calendar.DAY_OF_YEAR, 1); // Проверить!!!!!!!!!!!!!!! Либо 0 либо 1
                }

                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

                AlarmManager.AlarmClockInfo alarmClockInfo = new AlarmManager.AlarmClockInfo(calendar.getTimeInMillis(), getAlarmInfoPendingIntent());

                alarmManager.setAlarmClock(alarmClockInfo, getAlarmActionPendingIntent()); // ПРОВЕРИТЬ!!!!!!!

                alarmManager.setWindow(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), calendar.getTimeInMillis(), getAlarmActionPendingIntent());

                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 24 * 60 * 60 * 1000, getAlarmActionPendingIntent());

                Toast.makeText(this, "Будильник установлен на " + simpleDateFormat.format(calendar.getTime()), Toast.LENGTH_SHORT).show();

                hour.setText("     " + simpleDateFormat.format(calendar.getTime()));

            });
            materialTimePicker.show(getSupportFragmentManager(), "tag_picker");
        });
        setNotification.setOnClickListener(v -> {
            MaterialTimePicker materialTimePicker = new MaterialTimePicker.Builder()
                    .setTimeFormat(TimeFormat.CLOCK_24H)
                    .setHour(12)
                    .setMinute(0)
                    .setTitleText("Выберите время уведомления")
                    .build();
            setNotification.startAnimation(animation1);

            materialTimePicker.addOnPositiveButtonClickListener(view1 -> {
                calendar3 = Calendar.getInstance();
                calendar3.set(Calendar.SECOND, 0);
                calendar3.set(Calendar.MILLISECOND, 0);
                calendar3.set(Calendar.MINUTE, materialTimePicker.getMinute());
                calendar3.set(Calendar.HOUR_OF_DAY, materialTimePicker.getHour());

                alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                Intent intentAlarm = new Intent(this, AlarmReceiver.class);
                //intentAlarm.putExtra("hour1", hour.getText().toString());
                pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, intentAlarm, PendingIntent.FLAG_IMMUTABLE);
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);

                if (calendar3.getTimeInMillis() <= System.currentTimeMillis()) {
                    calendar3.add(Calendar.DAY_OF_YEAR, 1); // Проверить!!!!!!!!!!!!!!! Либо 0 либо 1
                }

                hourNotification.setText("     " + simpleDateFormat.format(calendar3.getTime()));
                Toast.makeText(this, "Уведомление установлено на " + simpleDateFormat.format(calendar3.getTime()), Toast.LENGTH_SHORT).show();

            });
            materialTimePicker.show(getSupportFragmentManager(), "tag_picker");

        });
        alarmRecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alarmRecButton.startAnimation(animation2);
                Intent intent = new Intent(MainActivity.this, ExamplesActivity.class);
                startActivity(intent);
            }
        });

    }
    public PendingIntent getAlarmInfoPendingIntent() {
        Intent alarmInfoIntent = new Intent(this, MainActivity.class);
        alarmInfoIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getActivity(this, 0, alarmInfoIntent, PendingIntent.FLAG_IMMUTABLE);
    }
    public PendingIntent getAlarmActionPendingIntent() {
        Intent intent = new Intent(this, AlarmActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        if (Build.VERSION.SDK_INT >= 16)intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        return PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_IMMUTABLE);
    }
    public void saveText() {
        String text = hour.getText().toString();
        String textNotification = hourNotification.getText().toString();
        SharedPreferences.Editor prefEditor = sPref.edit();
        prefEditor.putString(SAVED_HOURS, text);
        prefEditor.putString(SAVED_HOURS_NOTIFICATION, textNotification);
        prefEditor.apply();
    }
    public void loadText() {
        String text = sPref.getString(SAVED_HOURS, "");
        String textNotification = sPref.getString(SAVED_HOURS_NOTIFICATION, "");
        hour.setText(text);
        hourNotification.setText(textNotification);}
    public void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int imp = NotificationManager.IMPORTANCE_HIGH;
            CharSequence name = "notif";
            String desc = "Channel";
            NotificationChannel channel = new NotificationChannel("notification", name, imp);
            channel.setDescription(desc);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);

        }
        else {
            builder = new NotificationCompat.Builder(getApplicationContext());
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        saveText();
    }
}

