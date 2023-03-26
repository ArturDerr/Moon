package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MusicActivity extends AppCompatActivity {

    private int selectedTab = 2;
    final static String BUTTON_PRESSED = "button_pressed";
    TextView textNameMusic;
    ImageView natureImage, murmurImage, rainImage;
    Button natureMusic, murmurMusic, rainMusic, pause, pause2, pause3, pause4, pause5, pause6, pause7,pause8, pause9, pause10, pause11, pause12, pause13, pause14, pause15, pause16, pause17, pause18, pause19, pause20, pause21;
    RelativeLayout background, musicBox1, musicBox2, musicBox3, musicBox4, musicBox5,musicBox6, musicBox7, musicBox8, musicBox9, musicBox10, musicBox11, musicBox12, musicBox13, musicBox14, musicBox15, musicBox16, musicBox17, musicBox18, musicBox19, musicBox20, musicBox21;
    MediaPlayer music1, music2, music3, music4, music5, music6,  music7, music8, music9, music10, music11, music12, music13, music14, music15, music16, music17, music18, music19, music20, music21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        musicBox1 = findViewById(R.id.musicBox1);
        musicBox2 = findViewById(R.id.musicBox2);
        musicBox3 = findViewById(R.id.musicBox3);
        musicBox4 = findViewById(R.id.musicBox4);
        musicBox5 = findViewById(R.id.musicBox5);
        musicBox6 = findViewById(R.id.musicBox6);
        musicBox7 = findViewById(R.id.musicBox7);
        musicBox8 = findViewById(R.id.musicBox8);
        musicBox9 = findViewById(R.id.musicBox9);
        musicBox10 = findViewById(R.id.musicBox10);
        musicBox11 = findViewById(R.id.musicBox11);
        musicBox12 = findViewById(R.id.musicBox12);
        musicBox13 = findViewById(R.id.musicBox13);
        musicBox14 = findViewById(R.id.musicBox14);
        musicBox15 = findViewById(R.id.musicBox15);
        musicBox16 = findViewById(R.id.musicBox16);
        musicBox17 = findViewById(R.id.musicBox17);
        musicBox18 = findViewById(R.id.musicBox18);
        musicBox19 = findViewById(R.id.musicBox19);
        musicBox20 = findViewById(R.id.musicBox20);
        musicBox21 = findViewById(R.id.musicBox21);

        musicBox1.setVisibility(View.INVISIBLE);
        musicBox2.setVisibility(View.INVISIBLE);
        musicBox3.setVisibility(View.INVISIBLE);
        musicBox4.setVisibility(View.INVISIBLE);
        musicBox5.setVisibility(View.INVISIBLE);
        musicBox6.setVisibility(View.INVISIBLE);
        musicBox7.setVisibility(View.INVISIBLE);
        musicBox8.setVisibility(View.INVISIBLE);
        musicBox9.setVisibility(View.INVISIBLE);
        musicBox10.setVisibility(View.INVISIBLE);
        musicBox11.setVisibility(View.INVISIBLE);
        musicBox12.setVisibility(View.INVISIBLE);
        musicBox13.setVisibility(View.INVISIBLE);
        musicBox14.setVisibility(View.INVISIBLE);
        musicBox15.setVisibility(View.INVISIBLE);
        musicBox16.setVisibility(View.INVISIBLE);
        musicBox17.setVisibility(View.INVISIBLE);
        musicBox18.setVisibility(View.INVISIBLE);
        musicBox19.setVisibility(View.INVISIBLE);
        musicBox20.setVisibility(View.INVISIBLE);
        musicBox21.setVisibility(View.INVISIBLE);

        murmurImage = findViewById(R.id.murmurImage);
        natureImage = findViewById(R.id.natureImage);
        rainImage = findViewById(R.id.rainImage);
        rainMusic = findViewById(R.id.rainMusic);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        textNameMusic = findViewById(R.id.textNameMusic);

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

        loadClickButton();

        // природа
        music1 = MediaPlayer.create(this, R.raw.nature);
        // журчание ручья
        music2 = MediaPlayer.create(this, R.raw.murmur);
        // дождь
        music3 = MediaPlayer.create(this, R.raw.rain);
        //
        music4 = MediaPlayer.create(this, R.raw.);
        //
        music5 = MediaPlayer.create(this, R.raw.);
        //
        music6 = MediaPlayer.create(this, R.raw.);
        //
        music7 = MediaPlayer.create(this, R.raw.);
        //
        music8 = MediaPlayer.create(this, R.raw.);
        //
        music9 = MediaPlayer.create(this, R.raw.);
        //
        music10 = MediaPlayer.create(this, R.raw.);
        //
        music11 = MediaPlayer.create(this, R.raw.);
        //
        music12 = MediaPlayer.create(this, R.raw.);
        //
        music13 = MediaPlayer.create(this, R.raw.);
        //
        music14 = MediaPlayer.create(this, R.raw.);
        //
        music15 = MediaPlayer.create(this, R.raw.);
        //
        music16 = MediaPlayer.create(this, R.raw.);
        //
        music17 = MediaPlayer.create(this, R.raw.);
        //
        music18 = MediaPlayer.create(this, R.raw.);
        //
        music19 = MediaPlayer.create(this, R.raw.);
        //
        music20 = MediaPlayer.create(this, R.raw.);
        //
        music21 = MediaPlayer.create(this, R.raw.);

        natureMusic = findViewById(R.id.natureMusic);
        murmurMusic = findViewById(R.id.murmurMusic);
        pause = findViewById(R.id.pause);
        background = findViewById(R.id.background);

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

        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        scaleAnimation.setDuration(200);
        scaleAnimation.setFillAfter(true);
        musicLayout.startAnimation(scaleAnimation);

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTab != 1) {

                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(0, 0);

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

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

                    finish();

                    selectedTab = 1;
                }

            }
        });
        musicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTab != 2) {

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

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    musicLayout.startAnimation(scaleAnimation);

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

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
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

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    settingsLayout.startAnimation(scaleAnimation);

                    finish();

                    selectedTab = 4;
                }

            }
        });
        natureMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textNameMusic.setText("Звуки леса");

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();

                music1.start();
                musicBox1.setVisibility(View.VISIBLE);
                natureImage.setVisibility(View.INVISIBLE);
                natureMusic.setClickable(false);
                murmurMusic.setClickable(true);
                rainMusic.setClickable(true);
                background.setBackgroundResource(R.drawable.background_nature);

                music2.stop();
                music3.stop();
                music4.stop();
                music5.stop();
                music6.stop();
                music7.stop();
                music8.stop();
                music9.stop();
                music10.stop();
                music11.stop();
                music12.stop();
                music13.stop();
                music14.stop();
                music15.stop();
                music16.stop();
                music17.stop();
                music18.stop();
                music19.stop();
                music20.stop();
                music21.stop();

                musicBox2.setVisibility(View.INVISIBLE);
                musicBox3.setVisibility(View.INVISIBLE);
                musicBox4.setVisibility(View.INVISIBLE);
                musicBox5.setVisibility(View.INVISIBLE);
                musicBox6.setVisibility(View.INVISIBLE);
                musicBox7.setVisibility(View.INVISIBLE);
                musicBox8.setVisibility(View.INVISIBLE);
                musicBox9.setVisibility(View.INVISIBLE);
                musicBox10.setVisibility(View.INVISIBLE);
                musicBox11.setVisibility(View.INVISIBLE);
                musicBox12.setVisibility(View.INVISIBLE);
                musicBox13.setVisibility(View.INVISIBLE);
                musicBox14.setVisibility(View.INVISIBLE);
                musicBox15.setVisibility(View.INVISIBLE);
                musicBox16.setVisibility(View.INVISIBLE);
                musicBox17.setVisibility(View.INVISIBLE);
                musicBox18.setVisibility(View.INVISIBLE);
                musicBox19.setVisibility(View.INVISIBLE);
                musicBox20.setVisibility(View.INVISIBLE);
                musicBox21.setVisibility(View.INVISIBLE);
            }
        });
        murmurMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textNameMusic.setText("Звуки ручья");

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();

                music2.start();
                musicBox2.setVisibility(View.VISIBLE);
                murmurImage.setVisibility(View.INVISIBLE);
                natureMusic.setClickable(true);
                murmurMusic.setClickable(false);
                rainMusic.setClickable(true);

                music1.stop();
                music3.stop();
                music4.stop();
                music5.stop();
                music6.stop();
                music7.stop();
                music8.stop();
                music9.stop();
                music10.stop();
                music11.stop();
                music12.stop();
                music13.stop();
                music14.stop();
                music15.stop();
                music16.stop();
                music17.stop();
                music18.stop();
                music19.stop();
                music20.stop();
                music21.stop();

                musicBox1.setVisibility(View.INVISIBLE);
                musicBox3.setVisibility(View.INVISIBLE);
                musicBox4.setVisibility(View.INVISIBLE);
                musicBox5.setVisibility(View.INVISIBLE);
                musicBox6.setVisibility(View.INVISIBLE);
                musicBox7.setVisibility(View.INVISIBLE);
                musicBox8.setVisibility(View.INVISIBLE);
                musicBox9.setVisibility(View.INVISIBLE);
                musicBox10.setVisibility(View.INVISIBLE);
                musicBox11.setVisibility(View.INVISIBLE);
                musicBox12.setVisibility(View.INVISIBLE);
                musicBox13.setVisibility(View.INVISIBLE);
                musicBox14.setVisibility(View.INVISIBLE);
                musicBox15.setVisibility(View.INVISIBLE);
                musicBox16.setVisibility(View.INVISIBLE);
                musicBox17.setVisibility(View.INVISIBLE);
                musicBox18.setVisibility(View.INVISIBLE);
                musicBox19.setVisibility(View.INVISIBLE);
                musicBox20.setVisibility(View.INVISIBLE);
                musicBox21.setVisibility(View.INVISIBLE);
            }
        });
        rainMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textNameMusic.setText("Звуки дождя");

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();

                music3.start();
                musicBox3.setVisibility(View.VISIBLE);
                rainImage.setVisibility(View.INVISIBLE);
                natureMusic.setClickable(true);
                murmurMusic.setClickable(true);
                rainMusic.setClickable(false);

                music1.stop();
                music2.stop();
                music4.stop();
                music5.stop();
                music6.stop();
                music7.stop();
                music8.stop();
                music9.stop();
                music10.stop();
                music11.stop();
                music12.stop();
                music13.stop();
                music14.stop();
                music15.stop();
                music16.stop();
                music17.stop();
                music18.stop();
                music19.stop();
                music20.stop();
                music21.stop();

                musicBox1.setVisibility(View.INVISIBLE);
                musicBox2.setVisibility(View.INVISIBLE);
                musicBox4.setVisibility(View.INVISIBLE);
                musicBox5.setVisibility(View.INVISIBLE);
                musicBox6.setVisibility(View.INVISIBLE);
                musicBox7.setVisibility(View.INVISIBLE);
                musicBox8.setVisibility(View.INVISIBLE);
                musicBox9.setVisibility(View.INVISIBLE);
                musicBox10.setVisibility(View.INVISIBLE);
                musicBox11.setVisibility(View.INVISIBLE);
                musicBox12.setVisibility(View.INVISIBLE);
                musicBox13.setVisibility(View.INVISIBLE);
                musicBox14.setVisibility(View.INVISIBLE);
                musicBox15.setVisibility(View.INVISIBLE);
                musicBox16.setVisibility(View.INVISIBLE);
                musicBox17.setVisibility(View.INVISIBLE);
                musicBox18.setVisibility(View.INVISIBLE);
                musicBox19.setVisibility(View.INVISIBLE);
                musicBox20.setVisibility(View.INVISIBLE);
                musicBox21.setVisibility(View.INVISIBLE);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();

                if (music1.isPlaying()){
                    music1.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music1.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);

                }

            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();

                // 2
                if (music2.isPlaying()) {
                    music2.pause();
                    pause2.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music2.start();
                    pause2.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();

                // 3
                if (music3.isPlaying()){
                    music3.pause();
                    pause3.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music3.start();
                    pause3.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();

                // 4
                if (music4.isPlaying()){
                    music4.pause();
                    pause4.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music4.start();
                    pause4.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 5
                if (music5.isPlaying()){
                    music5.pause();
                    pause5.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music5.start();
                    pause5.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 6
                if (music6.isPlaying()){
                    music6.pause();
                    pause6.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music6.start();
                    pause6.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 7
                if (music7.isPlaying()){
                    music7.pause();
                    pause7.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music7.start();
                    pause7.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 8
                if (music8.isPlaying()){
                    music8.pause();
                    pause8.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music8.start();
                    pause8.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 9
                if (music9.isPlaying()){
                    music9.pause();
                    pause9.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music9.start();
                    pause9.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 10
                if (music10.isPlaying()){
                    music10.pause();
                    pause10.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music10.start();
                    pause10.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 11
                if (music11.isPlaying()){
                    music11.pause();
                    pause11.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music11.start();
                    pause11.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 12
                if (music12.isPlaying()){
                    music12.pause();
                    pause12.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music12.start();
                    pause12.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 13
                if (music13.isPlaying()){
                    music13.pause();
                    pause13.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music13.start();
                    pause13.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 14
                if (music14.isPlaying()){
                    music14.pause();
                    pause14.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music14.start();
                    pause14.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 15
                if (music15.isPlaying()){
                    music15.pause();
                    pause15.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music15.start();
                    pause15.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 16
                if (music16.isPlaying()){
                    music16.pause();
                    pause16.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music16.start();
                    pause16.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 17
                if (music17.isPlaying()){
                    music17.pause();
                    pause17.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music17.start();
                    pause17.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 18
                if (music18.isPlaying()){
                    music18.pause();
                    pause18.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music18.start();
                    pause18.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 19
                if (music19.isPlaying()){
                    music19.pause();
                    pause19.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music19.start();
                    pause19.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 20
                if (music20.isPlaying()){
                    music20.pause();
                    pause20.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music20.start();
                    pause20.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 21
                if (music21.isPlaying()){
                    music21.pause();
                    pause21.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music21.start();
                    pause21.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });

    }
    public void loadClickButton() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        boolean isButtonPressed = sharedPref.getBoolean(BUTTON_PRESSED, false);
    }
}