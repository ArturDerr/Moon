package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    Button natureMusic, stop, pause;
    RelativeLayout musicBox;
    MediaPlayer music1, music2, music3, music4, music5, music6,  music7, music8, music9, music10, music11, music12, music13, music14, music15, music16, music17, music18, music19, music20, music21, music22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        musicBox = findViewById(R.id.musicBox);

        musicBox.setVisibility(View.INVISIBLE);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.alpha);

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

        music1 = MediaPlayer.create(this, R.raw.nature);
        music2 = MediaPlayer.create(this, R.raw.nature);
        music3 = MediaPlayer.create(this, R.raw.nature);
        music4 = MediaPlayer.create(this, R.raw.nature);
        music5 = MediaPlayer.create(this, R.raw.nature);
        music6 = MediaPlayer.create(this, R.raw.nature);
        music7 = MediaPlayer.create(this, R.raw.nature);
        music8 = MediaPlayer.create(this, R.raw.nature);
        music9 = MediaPlayer.create(this, R.raw.nature);
        music10 = MediaPlayer.create(this, R.raw.nature);
        music11 = MediaPlayer.create(this, R.raw.nature);
        music12 = MediaPlayer.create(this, R.raw.nature);
        music13 = MediaPlayer.create(this, R.raw.nature);
        music14 = MediaPlayer.create(this, R.raw.nature);
        music15 = MediaPlayer.create(this, R.raw.nature);
        music16 = MediaPlayer.create(this, R.raw.nature);
        music16 = MediaPlayer.create(this, R.raw.nature);
        music17 = MediaPlayer.create(this, R.raw.nature);
        music18 = MediaPlayer.create(this, R.raw.nature);
        music19 = MediaPlayer.create(this, R.raw.nature);
        music20 = MediaPlayer.create(this, R.raw.nature);
        music21 = MediaPlayer.create(this, R.raw.nature);

        natureMusic = findViewById(R.id.natureMusic);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);

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
                music1.start();
                musicBox.setVisibility(View.VISIBLE);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1
                if (music1.isPlaying()){
                    music1.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music1.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 2
                if (music2.isPlaying()) {
                    music2.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music2.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 3
                if (music3.isPlaying()){
                    music3.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music3.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 4
                if (music4.isPlaying()){
                    music4.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music4.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 5
                if (music5.isPlaying()){
                    music5.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music5.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 6
                if (music6.isPlaying()){
                    music6.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music6.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 7
                if (music7.isPlaying()) {
                    music7.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music7.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 8
                if (music8.isPlaying()){
                    music8.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music8.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 9
                if (music9.isPlaying()){
                    music9.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music9.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 10
                if (music10.isPlaying()){
                    music10.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music10.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 11
                if (music11.isPlaying()){
                    music11.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music11.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 12
                if (music12.isPlaying()){
                    music12.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music12.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 13
                if (music13.isPlaying()){
                    music13.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music13.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 14
                if (music14.isPlaying()){
                    music14.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music14.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 15
                if (music15.isPlaying()){
                    music15.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music15.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 16
                if (music16.isPlaying()){
                    music16.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music16.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 17
                if (music17.isPlaying()){
                    music17.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music17.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 18
                if (music18.isPlaying()){
                    music18.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music18.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 19
                if (music19.isPlaying()){
                    music19.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music19.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 20
                if (music20.isPlaying()){
                    music20.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music20.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }
                // 21
                if (music21.isPlaying()){
                    music21.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                }
                else {
                    music21.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);
                }


                pause.startAnimation(animation);

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music1.stop();
                musicBox.setVisibility(View.INVISIBLE);
                stop.startAnimation(animation1);
            }
        });

    }
}