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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MusicActivity extends AppCompatActivity {

    private int selectedTab = 2;

    final static String BUTTON_PRESSED = "button_pressed";

    SharedPreferences sharedPref;

    ImageView image1, image2, image3, image4, image5, image6, image7, image8;
    Button musicButton1, musicButton2, musicButton3, musicButton4, musicButton5, musicButton6, musicButton7, musicButton8;

    Button pause, pause2, pause3, pause4, pause5, pause6, pause7, pause8, pause9, pause10, pause11, pause12, pause13, pause14, pause15, pause16, pause17, pause18, pause19, pause20, pause21;

    ImageView selected1, selected2, selected3, selected4, selected5, selected6, selected7, selected8, selected9, selected10, selected11, selected12, selected13, selected14, selected15, selected16, selected17, selected18, selected19, selected20, selected21;

    RelativeLayout musicBox1, musicBox2, musicBox3, musicBox4, musicBox5, musicBox6, musicBox7, musicBox8, musicBox9, musicBox10, musicBox11, musicBox12, musicBox13, musicBox14, musicBox15, musicBox16, musicBox17, musicBox18, musicBox19, musicBox20, musicBox21;

    MediaPlayer music1, music2, music3, music4, music5, music6, music7, music8, music9, music10, music11, music12, music13, music14, music15, music16, music17, music18, music19, music20, music21;

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

        pause = findViewById(R.id.pause);
        pause2 = findViewById(R.id.pause2);
        pause3 = findViewById(R.id.pause3);
        pause4 = findViewById(R.id.pause4);
        pause5 = findViewById(R.id.pause5);
        pause6 = findViewById(R.id.pause6);
        pause7 = findViewById(R.id.pause7);
        pause8 = findViewById(R.id.pause8);
        pause9 = findViewById(R.id.pause9);
        pause10 = findViewById(R.id.pause10);
        pause11 = findViewById(R.id.pause11);
        pause12 = findViewById(R.id.pause12);
        pause13 = findViewById(R.id.pause13);
        pause14 = findViewById(R.id.pause14);
        pause15 = findViewById(R.id.pause15);
        pause16 = findViewById(R.id.pause16);
        pause17 = findViewById(R.id.pause17);
        pause18 = findViewById(R.id.pause18);
        pause19 = findViewById(R.id.pause19);
        pause20 = findViewById(R.id.pause20);
        pause21 = findViewById(R.id.pause21);

        //musicBox1.setVisibility(View.INVISIBLE);
        //musicBox2.setVisibility(View.INVISIBLE);
        //musicBox3.setVisibility(View.INVISIBLE);
        //musicBox4.setVisibility(View.INVISIBLE);
        //musicBox5.setVisibility(View.INVISIBLE);
        //musicBox6.setVisibility(View.INVISIBLE);
        //musicBox7.setVisibility(View.INVISIBLE);
        //musicBox8.setVisibility(View.INVISIBLE);
        //musicBox9.setVisibility(View.INVISIBLE);
        //musicBox10.setVisibility(View.INVISIBLE);
        //musicBox11.setVisibility(View.INVISIBLE);
        //musicBox12.setVisibility(View.INVISIBLE);
        //musicBox13.setVisibility(View.INVISIBLE);
        //musicBox14.setVisibility(View.INVISIBLE);
       //musicBox15.setVisibility(View.INVISIBLE);
        //musicBox16.setVisibility(View.INVISIBLE);
        //musicBox17.setVisibility(View.INVISIBLE);
        //musicBox18.setVisibility(View.INVISIBLE);
        //musicBox19.setVisibility(View.INVISIBLE);
        //musicBox20.setVisibility(View.INVISIBLE);
        //musicBox21.setVisibility(View.INVISIBLE);

        selected1 = findViewById(R.id.selected1);
        selected2 = findViewById(R.id.selected2);
        selected3 = findViewById(R.id.selected3);
        selected4 = findViewById(R.id.selected4);
        selected5 = findViewById(R.id.selected5);
        selected6 = findViewById(R.id.selected6);
        selected7 = findViewById(R.id.selected7);
        selected8 = findViewById(R.id.selected8);
        selected9 = findViewById(R.id.selected9);
        selected10 = findViewById(R.id.selected10);
        selected11 = findViewById(R.id.selected11);
        selected12 = findViewById(R.id.selected12);
        selected13 = findViewById(R.id.selected13);
        selected14 = findViewById(R.id.selected14);
        selected15 = findViewById(R.id.selected15);
        selected16 = findViewById(R.id.selected16);
        selected17 = findViewById(R.id.selected17);
        selected18 = findViewById(R.id.selected18);
        selected19 = findViewById(R.id.selected19);
        selected20 = findViewById(R.id.selected20);
        selected21 = findViewById(R.id.selected21);

        image2 = findViewById(R.id.image2);
        image1 = findViewById(R.id.image1);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);

        musicButton3 = findViewById(R.id.musicButton3);
        musicButton1 = findViewById(R.id.musicButton1);
        musicButton2 = findViewById(R.id.musicButton2);
        musicButton4 = findViewById(R.id.musicButton4);
        musicButton5 = findViewById(R.id.musicButton5);
        musicButton6 = findViewById(R.id.musicButton6);
        musicButton7 = findViewById(R.id.musicButton7);
        musicButton8 = findViewById(R.id.musicButton8);

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
        Animation animation20 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animation21 = AnimationUtils.loadAnimation(this, R.anim.alpha);


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

        // лес
        music1 = MediaPlayer.create(this, R.raw.forest);
        // журчание ручья
        music2 = MediaPlayer.create(this, R.raw.murmur);
        // дождь
        music3 = MediaPlayer.create(this, R.raw.rain);
        // природа
        music4 = MediaPlayer.create(this, R.raw.nature);
        // ночная природа
        music5 = MediaPlayer.create(this, R.raw.night_nature);
        // звуки костра
        music6 = MediaPlayer.create(this, R.raw.fire);
        // пение птиц
        music7 = MediaPlayer.create(this, R.raw.bird);
        // осень природа
        music8 = MediaPlayer.create(this, R.raw.autumn);
        //
        music9 = MediaPlayer.create(this, R.raw.rain);
        //
        music10 = MediaPlayer.create(this, R.raw.rain);
        //
        music11 = MediaPlayer.create(this, R.raw.rain);
        //
        music12 = MediaPlayer.create(this, R.raw.rain);
        //
        music13 = MediaPlayer.create(this, R.raw.rain);
        //
        music14 = MediaPlayer.create(this, R.raw.rain);
        //
        music15 = MediaPlayer.create(this, R.raw.rain);
        //
        music16 = MediaPlayer.create(this, R.raw.rain);
        //
        music17 = MediaPlayer.create(this, R.raw.rain);
        //
        music18 = MediaPlayer.create(this, R.raw.rain);
        //
        music19 = MediaPlayer.create(this, R.raw.rain);
        //
        music20 = MediaPlayer.create(this, R.raw.rain);
        //
        music21 = MediaPlayer.create(this, R.raw.rain);

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

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
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

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
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
        musicButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton1.startAnimation(animation);

                if (music2.isPlaying()) {
                    music2.stop();
                    music2.release();
                }
                if (music3.isPlaying()) {
                    music3.stop();
                    music3.release();
                }
                if (music4.isPlaying()) {
                    music4.stop();
                    music4.release();
                }
                if (music5.isPlaying()) {
                    music5.stop();
                    music5.release();
                }
                if (music6.isPlaying()) {
                    music6.stop();
                    music6.release();
                }
                if (music7.isPlaying()) {
                    music7.stop();
                    music7.release();
                }
                if (music8.isPlaying()) {
                    music8.stop();
                    music8.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }
                music1.start();

                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);

                musicButton1.setClickable(false);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);

                selected1.setVisibility(View.VISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton2.startAnimation(animation1);

                if (music1.isPlaying()) {
                    music1.stop();
                    music1.release();
                }
                if (music3.isPlaying()) {
                    music3.stop();
                    music3.release();
                }
                if (music4.isPlaying()) {
                    music4.stop();
                    music4.release();
                }
                if (music5.isPlaying()) {
                    music5.stop();
                    music5.release();
                }
                if (music6.isPlaying()) {
                    music6.stop();
                    music6.release();
                }
                if (music7.isPlaying()) {
                    music7.stop();
                    music7.release();
                }
                if (music8.isPlaying()) {
                    music8.stop();
                    music8.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }
                music2.start();

                image2.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);

                musicButton1.setClickable(true);
                musicButton2.setClickable(false);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.VISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton3.startAnimation(animation2);

                if (music1.isPlaying()) {
                    music1.stop();
                    music1.release();
                }
                if (music2.isPlaying()) {
                    music2.stop();
                    music2.release();
                }
                if (music4.isPlaying()) {
                    music4.stop();
                    music4.release();
                }
                if (music5.isPlaying()) {
                    music5.stop();
                    music5.release();
                }
                if (music6.isPlaying()) {
                    music6.stop();
                    music6.release();
                }
                if (music7.isPlaying()) {
                    music7.stop();
                    music7.release();
                }
                if (music8.isPlaying()) {
                    music8.stop();
                    music8.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }

                music3.start();

                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(false);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.VISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton4.startAnimation(animation3);

                if (music1.isPlaying()) {
                    music1.stop();
                    music1.release();
                }
                if (music2.isPlaying()) {
                    music2.stop();
                    music2.release();
                }
                if (music3.isPlaying()) {
                    music3.stop();
                    music3.release();
                }
                if (music5.isPlaying()) {
                    music5.stop();
                    music5.release();
                }
                if (music6.isPlaying()) {
                    music6.stop();
                    music6.release();
                }
                if (music7.isPlaying()) {
                    music7.stop();
                    music7.release();
                }
                if (music8.isPlaying()) {
                    music8.stop();
                    music8.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }

                music4.start();

                image4.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(false);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.VISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);

            }
        });
        musicButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton5.startAnimation(animation4);

                if (music1.isPlaying()) {
                    music1.stop();
                    music1.release();
                }
                if (music2.isPlaying()) {
                    music2.stop();
                    music2.release();
                }
                if (music3.isPlaying()) {
                    music3.stop();
                    music3.release();
                }
                if (music4.isPlaying()) {
                    music4.stop();
                    music4.release();
                }
                if (music6.isPlaying()) {
                    music6.stop();
                    music6.release();
                }
                if (music7.isPlaying()) {
                    music7.stop();
                    music7.release();
                }
                if (music8.isPlaying()) {
                    music8.stop();
                    music8.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }

                music5.start();

                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.INVISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(false);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.VISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton6.startAnimation(animation5);

                if (music1.isPlaying()) {
                    music1.stop();
                    music1.release();
                }
                if (music2.isPlaying()) {
                    music2.stop();
                    music2.release();
                }
                if (music3.isPlaying()) {
                    music3.stop();
                    music3.release();
                }
                if (music4.isPlaying()) {
                    music4.stop();
                    music4.release();
                }
                if (music5.isPlaying()) {
                    music5.stop();
                    music5.release();
                }
                if (music7.isPlaying()) {
                    music7.stop();
                    music7.release();
                }
                if (music8.isPlaying()) {
                    music8.stop();
                    music8.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }

                music6.start();

                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image6.setVisibility(View.INVISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(false);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.VISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton7.startAnimation(animation6);

                if (music1.isPlaying()) {
                    music1.stop();
                    music1.release();
                }
                if (music2.isPlaying()) {
                    music2.stop();
                    music2.release();
                }
                if (music3.isPlaying()) {
                    music3.stop();
                    music3.release();
                }
                if (music4.isPlaying()) {
                    music4.stop();
                    music4.release();
                }
                if (music5.isPlaying()) {
                    music5.stop();
                    music5.release();
                }
                if (music6.isPlaying()) {
                    music6.stop();
                    music6.release();
                }
                if (music8.isPlaying()) {
                    music8.stop();
                    music8.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }

                music7.start();

                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.INVISIBLE);
                image8.setVisibility(View.VISIBLE);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(false);
                musicButton8.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.VISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musicButton8.startAnimation(animation7);

                if (music1.isPlaying()) {
                    music1.stop();
                    music1.release();
                }
                if (music2.isPlaying()) {
                    music2.stop();
                    music2.release();
                }
                if (music3.isPlaying()) {
                    music3.stop();
                    music3.release();
                }
                if (music4.isPlaying()) {
                    music4.stop();
                    music4.release();
                }
                if (music5.isPlaying()) {
                    music5.stop();
                    music5.release();
                }
                if (music6.isPlaying()) {
                    music6.stop();
                    music6.release();
                }
                if (music7.isPlaying()) {
                    music7.stop();
                    music7.release();
                }
                if (music9.isPlaying()) {
                    music9.stop();
                    music9.release();
                }
                if (music10.isPlaying()) {
                    music10.stop();
                    music10.release();
                }
                if (music11.isPlaying()) {
                    music11.stop();
                    music11.release();
                }
                if (music12.isPlaying()) {
                    music12.stop();
                    music12.release();
                }
                if (music13.isPlaying()) {
                    music13.stop();
                    music13.release();
                }
                if (music14.isPlaying()) {
                    music14.stop();
                    music14.release();
                }
                if (music15.isPlaying()) {
                    music15.stop();
                    music15.release();
                }
                if (music16.isPlaying()) {
                    music16.stop();
                    music16.release();
                }
                if (music17.isPlaying()) {
                    music17.stop();
                    music17.release();
                }
                if (music18.isPlaying()) {
                    music18.stop();
                    music18.release();
                }
                if (music19.isPlaying()) {
                    music19.stop();
                    music19.release();
                }
                if (music20.isPlaying()) {
                    music20.stop();
                    music20.release();
                }
                if (music21.isPlaying()) {
                    music21.stop();
                    music21.release();
                }
                music8.start();

                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.INVISIBLE);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(false);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.VISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.INVISIBLE);
                selected12.setVisibility(View.INVISIBLE);
                selected13.setVisibility(View.INVISIBLE);
                selected14.setVisibility(View.INVISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 1
                if (music1.isPlaying()) {
                    music1.pause();
                    pause.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music1.start();
                    pause.setBackgroundResource(R.drawable.ic_pause);

                }
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 2
                if (music2.isPlaying()) {
                    music2.pause();
                    pause2.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music2.start();
                    pause2.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 3
                if (music3.isPlaying()) {
                    music3.pause();
                    pause3.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music3.start();
                    pause3.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 4
                if (music4.isPlaying()) {
                    music4.pause();
                    pause4.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music4.start();
                    pause4.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 5
                if (music5.isPlaying()) {
                    music5.pause();
                    pause5.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music5.start();
                    pause5.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 6
                if (music6.isPlaying()) {
                    music6.pause();
                    pause6.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music6.start();
                    pause6.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 7
                if (music7.isPlaying()) {
                    music7.pause();
                    pause7.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music7.start();
                    pause7.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 8
                if (music8.isPlaying()) {
                    music8.pause();
                    pause8.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music8.start();
                    pause8.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 9
                if (music9.isPlaying()) {
                    music9.pause();
                    pause9.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music9.start();
                    pause9.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 10
                if (music10.isPlaying()) {
                    music10.pause();
                    pause10.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music10.start();
                    pause10.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 11
                if (music11.isPlaying()) {
                    music11.pause();
                    pause11.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music11.start();
                    pause11.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 12
                if (music12.isPlaying()) {
                    music12.pause();
                    pause12.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music12.start();
                    pause12.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 13
                if (music13.isPlaying()) {
                    music13.pause();
                    pause13.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music13.start();
                    pause13.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 14
                if (music14.isPlaying()) {
                    music14.pause();
                    pause14.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music14.start();
                    pause14.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 15
                if (music15.isPlaying()) {
                    music15.pause();
                    pause15.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music15.start();
                    pause15.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 16
                if (music16.isPlaying()) {
                    music16.pause();
                    pause16.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music16.start();
                    pause16.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 17
                if (music17.isPlaying()) {
                    music17.pause();
                    pause17.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music17.start();
                    pause17.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 18
                if (music18.isPlaying()) {
                    music18.pause();
                    pause18.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music18.start();
                    pause18.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 19
                if (music19.isPlaying()) {
                    music19.pause();
                    pause19.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music19.start();
                    pause19.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 20
                if (music20.isPlaying()) {
                    music20.pause();
                    pause20.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music20.start();
                    pause20.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        pause21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getPreferences(Context.MODE_PRIVATE);
                sharedPref.edit()
                        .putBoolean(BUTTON_PRESSED, true)
                        .apply();
                // 21
                if (music21.isPlaying()) {
                    music21.pause();
                    pause21.setBackgroundResource(R.drawable.ic_play);
                } else {
                    music21.start();
                    pause21.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
    }
}