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
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int selectedTab = 1;

    PendingIntent pendingIntent;
    NotificationCompat.Builder builder = null;
    Notification notification;
    NotificationManager notificationManager;
    NotificationChannel notificationChannel = null;
    private TextView hour, hourSleep, hourNotification;
    private Button setAlarm, setAlarmSleep, setNotification;
    Calendar calendar, calendar2, calendar3;
    SimpleDateFormat simpleDateFormat;
    EditText editTextNotification;

    SharedPreferences sPref;

    final String SAVED_HOURS = "saved_hours";
    final String SAVED_HOURS_SLEEP = "saved_hours_sleep";
    final String SAVED_HOURS_NOTIFICATION = "saved_hours_notification";
    final String SAVED_TEXT_NOTIFICATION = "saved_text_notification";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNotification = findViewById(R.id.editTextNotification);

        hourNotification = findViewById(R.id.hourNotification);

        setNotification = findViewById(R.id.setNotification);

        setAlarmSleep = findViewById(R.id.setAlarmSleep);

        setAlarm = findViewById(R.id.setAlarm);

        sPref = getPreferences(MODE_PRIVATE);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        hour = findViewById(R.id.hour);

        hourSleep = findViewById(R.id.hourSleep);

        Intent intent = new Intent(getApplicationContext(), AlarmSleepActivity.class);
        pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        if (editTextNotification.getText().toString().equals("")){
            builder.setContentText("Пора спать!");
        }

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        final LinearLayout homeLayout = findViewById(R.id.homeLayout);
        final LinearLayout musicLayout = findViewById(R.id.musicLayout);
        final LinearLayout settingsLayout = findViewById(R.id.settingsLayout);
        final LinearLayout notesLayout = findViewById(R.id.notesLayout);

        final TextView homeTxt = findViewById(R.id.homeTxt);
        final TextView musicTxt = findViewById(R.id.musicTxt);
        final TextView settingsTxt = findViewById(R.id.settingsTxt);
        final TextView notesTxt = findViewById(R.id.notesTxt);

        final ImageView homeImage = findViewById(R.id.homeImage);
        final ImageView musicImage = findViewById(R.id.musicImage);
        final ImageView settingsImage = findViewById(R.id.settingsImage);
        final ImageView notesImage = findViewById(R.id.notesImage);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            notificationChannel = new NotificationChannel("ID", "Name", importance);
            notificationManager.createNotificationChannel(notificationChannel);
            builder = new NotificationCompat.Builder(getApplicationContext(), notificationChannel.getId());
        }
        else {
            builder = new NotificationCompat.Builder(getApplicationContext());
        }

        simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());

        loadText();

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTab != 1) {

                    musicTxt.setVisibility(View.GONE);
                    settingsTxt.setVisibility(View.GONE);
                    notesTxt.setVisibility(View.GONE);

                    musicImage.setImageResource(R.drawable.ic_music);
                    settingsImage.setImageResource(R.drawable.ic_settings);
                    notesImage.setImageResource(R.drawable.ic_notes);

                    musicLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    settingsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                    settingsTxt.setVisibility(View.GONE);
                    notesTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    settingsImage.setImageResource(R.drawable.ic_settings);
                    notesImage.setImageResource(R.drawable.ic_notes);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    settingsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                    settingsTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    musicImage.setImageResource(R.drawable.ic_music);
                    settingsImage.setImageResource(R.drawable.ic_settings);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    musicLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    settingsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

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
        settingsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTab != 4) {

                    startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                    overridePendingTransition(0, 0);

                    homeTxt.setVisibility(View.GONE);
                    musicTxt.setVisibility(View.GONE);
                    notesTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    musicImage.setImageResource(R.drawable.ic_music);
                    notesImage.setImageResource(R.drawable.ic_notes);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    musicLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    settingsTxt.setVisibility(View.VISIBLE);
                    settingsImage.setImageResource(R.drawable.ic_settings_selected);
                    settingsLayout.setBackgroundResource(R.drawable.round_back_alarm);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    settingsLayout.startAnimation(scaleAnimation);

                    finish();

                    selectedTab = 4;
                }

            }
        });
        setAlarm.setOnClickListener(v -> {
            MaterialTimePicker materialTimePicker = new MaterialTimePicker.Builder()
                    .setTimeFormat(TimeFormat.CLOCK_24H)
                    .setHour(12)
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
                    calendar.add(Calendar.DAY_OF_YEAR, 1);
                }

                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

                AlarmManager.AlarmClockInfo alarmClockInfo = new AlarmManager.AlarmClockInfo(calendar.getTimeInMillis(), getAlarmInfoPendingIntent());

                //alarmManager.setAlarmClock(alarmClockInfo, getAlarmActionPendingIntent()); // ПРОВЕРИТЬ!!!!!!!

                alarmManager.setWindow(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), calendar.getTimeInMillis(), getAlarmActionPendingIntent());

                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 24 * 60 * 60 * 1000, getAlarmActionPendingIntent());

                Toast.makeText(this, "Будильник установлен на " + simpleDateFormat.format(calendar.getTime()), Toast.LENGTH_SHORT).show();

                hour.setText("     " + simpleDateFormat.format(calendar.getTime()));

            });
            materialTimePicker.show(getSupportFragmentManager(), "tag_picker");
        });
        setAlarmSleep.setOnClickListener(v -> {
            MaterialTimePicker materialTimePicker = new MaterialTimePicker.Builder()
                    .setTimeFormat(TimeFormat.CLOCK_24H)
                    .setHour(12)
                    .setMinute(0)
                    .setTitleText("Выберите время")
                    .build();
            setAlarmSleep.startAnimation(animation1);

            materialTimePicker.addOnPositiveButtonClickListener(view1 -> {
                calendar2 = Calendar.getInstance();
                calendar2.set(Calendar.SECOND, 0);
                calendar2.set(Calendar.MILLISECOND, 0);
                calendar2.set(Calendar.MINUTE, materialTimePicker.getMinute());
                calendar2.set(Calendar.HOUR_OF_DAY, materialTimePicker.getHour());

                if (calendar2.getTimeInMillis() <= System.currentTimeMillis()) {
                    calendar2.add(Calendar.DAY_OF_YEAR, 1);
                }

                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

                AlarmManager.AlarmClockInfo alarmClockInfo = new AlarmManager.AlarmClockInfo(calendar2.getTimeInMillis(), getAlarmSleepInfoPendingIntent());

                //alarmManager.setAlarmClock(alarmClockInfo, getAlarmActionPendingIntent()); // ПРОВЕРИТЬ!!!!!!!

                alarmManager.setWindow(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), calendar2.getTimeInMillis(), getAlarmSleepActionPendingIntent());

                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), 24 * 60 * 60 * 1000, getAlarmSleepActionPendingIntent());

                Toast.makeText(this, "Будильник установлен на " + simpleDateFormat.format(calendar2.getTime()), Toast.LENGTH_SHORT).show();

                hourSleep.setText("     " + simpleDateFormat.format(calendar2.getTime()));

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
            setNotification.startAnimation(animation2);

            materialTimePicker.addOnPositiveButtonClickListener(view1 -> {
                calendar3 = Calendar.getInstance();
                calendar3.set(Calendar.SECOND, 0);
                calendar3.set(Calendar.MILLISECOND, 0);
                calendar3.set(Calendar.MINUTE, materialTimePicker.getMinute());
                calendar3.set(Calendar.HOUR_OF_DAY, materialTimePicker.getHour());

                if (calendar3.getTimeInMillis() <= System.currentTimeMillis()) {
                    calendar3.add(Calendar.DAY_OF_YEAR, 1);
                }

                Toast.makeText(this, "Увеомление установлено на " + simpleDateFormat.format(calendar2.getTime()), Toast.LENGTH_SHORT).show();

                hourNotification.setText("     " + simpleDateFormat.format(calendar3.getTime()));

                builder.setContentIntent(pendingIntent)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(calendar3.getTimeInMillis())
                        .setContentTitle("Напоминание")
                        .setContentText(editTextNotification.getText().toString())
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_MAX);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
                    notification = builder.build();
                }
                notification.defaults = Notification.DEFAULT_ALL;
                notificationManager.notify(101, notification);

            });
            materialTimePicker.show(getSupportFragmentManager(), "tag_picker");

        });

    }
    public PendingIntent getAlarmInfoPendingIntent() {
        Intent alarmInfoIntent = new Intent(this, MainActivity.class);
        alarmInfoIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getActivity(this, 0, alarmInfoIntent, PendingIntent.FLAG_IMMUTABLE);
    }
    public PendingIntent getAlarmActionPendingIntent() {
        // потом отправим данные в броадкаст ресиевер
        Intent intent = new Intent(this, AlarmActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        // тут FLAG_IMMUTABLE
        return PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_IMMUTABLE);
    }
    // Будильник ночь //
    public PendingIntent getAlarmSleepInfoPendingIntent() {
        Intent alarmInfoIntentSleep = new Intent(this, MainActivity.class);
        alarmInfoIntentSleep.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getActivity(this, 2, alarmInfoIntentSleep, PendingIntent.FLAG_IMMUTABLE);
    }
    public PendingIntent getAlarmSleepActionPendingIntent() {
        // потом отправим данные в броадкаст ресиевер
        Intent intent1 = new Intent(this, AlarmSleepActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        // тут FLAG_IMMUTABLE
        return PendingIntent.getActivity(this, 3, intent1, PendingIntent.FLAG_IMMUTABLE);
    }
    public void saveText() {
        String text = hour.getText().toString();
        String textSleep = hourSleep.getText().toString();
        String textNotification = hourNotification.getText().toString();
        String textEditTextNotification = editTextNotification.getText().toString();
        // сохраняем его в настройках
        SharedPreferences.Editor prefEditor = sPref.edit();
        prefEditor.putString(SAVED_HOURS, text);
        prefEditor.putString(SAVED_HOURS_SLEEP, textSleep);
        prefEditor.putString(SAVED_HOURS_NOTIFICATION, textNotification);
        prefEditor.putString(SAVED_TEXT_NOTIFICATION, textEditTextNotification);
        prefEditor.apply();
    }
    public void loadText() {
        String text = sPref.getString(SAVED_HOURS, "");
        String textSleep = sPref.getString(SAVED_HOURS_SLEEP, "");
        String textNotification = sPref.getString(SAVED_HOURS_NOTIFICATION, "");
        String textEditTextNotification = sPref.getString(SAVED_TEXT_NOTIFICATION, "");
        hour.setText(text);
        hourSleep.setText(textSleep);
        hourNotification.setText(textNotification);
        //textEditTextNotification.setText(textEditTextNotification);
    }
    @Override
    protected void onPause() {
        super.onPause();
        saveText();
    }
}

