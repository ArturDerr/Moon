package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MusicSleepActivity extends AppCompatActivity {

    final static String BUTTON_PRESSED = "button_pressed";

    SharedPreferences sharedPref;

    Context context;

    ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13, image14, image15, image16, image17, image18, image19, image20, image21;
    Button musicButton1, musicButton2, musicButton3, musicButton4, musicButton5, musicButton6, musicButton7, musicButton8, musicButton9, musicButton10, musicButton11, musicButton12, musicButton13, musicButton14, musicButton15, musicButton16, musicButton17, musicButton18, musicButton19, musicButton20, musicButton21;

    Button pause, pause2, pause3, pause4, pause5, pause6, pause7, pause8, pause9, pause10, pause11, pause12, pause13, pause14, pause15, pause16, pause17, pause18, pause19, pause20, pause21;

    Button musicSave1, musicSave2, musicSave3, musicSave4, musicSave5, musicSave6, musicSave7, musicSave8, musicSave9, musicSave10, musicSave11, musicSave12, musicSave13, musicSave14, musicSave15, musicSave16, musicSave17, musicSave18, musicSave19, musicSave20, musicSave21;

    ImageView selected1, selected2, selected3, selected4, selected5, selected6, selected7, selected8, selected9, selected10, selected11, selected12, selected13, selected14, selected15, selected16, selected17, selected18, selected19, selected20, selected21;

    RelativeLayout musicBox1, musicBox2, musicBox3, musicBox4, musicBox5, musicBox6, musicBox7, musicBox8, musicBox9, musicBox10, musicBox11, musicBox12, musicBox13, musicBox14, musicBox15, musicBox16, musicBox17, musicBox18, musicBox19, musicBox20, musicBox21;

    MediaPlayer musicForest, musicMurmur, musicRain, musicNature, musicNightNature, musicFire, musicBird, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar;


    private void soundPLayButton(MediaPlayer sound1, MediaPlayer sound2, MediaPlayer sound3, MediaPlayer sound4, MediaPlayer sound5, MediaPlayer sound6, MediaPlayer sound7, MediaPlayer sound8, MediaPlayer sound9, MediaPlayer sound10, MediaPlayer sound11, MediaPlayer sound12, MediaPlayer sound13, MediaPlayer sound14, MediaPlayer sound15, MediaPlayer sound16, MediaPlayer sound17, MediaPlayer sound18, MediaPlayer sound19, MediaPlayer sound20, MediaPlayer sound21) {

        if (sound1.isPlaying()) {
            sound1.pause();
            sound1.seekTo(0);
            sound1.setLooping(false);
        }
        if (sound2.isPlaying()) {
            sound2.pause();
            sound2.seekTo(0);
            sound2.setLooping(false);
        }
        if (sound3.isPlaying()) {
            sound3.pause();
            sound3.seekTo(0);
            sound3.setLooping(false);
        }
        if (sound4.isPlaying()) {
            sound4.pause();
            sound4.seekTo(0);
            sound4.setLooping(false);
        }
        if (sound5.isPlaying()) {
            sound5.pause();
            sound5.seekTo(0);
            sound5.setLooping(false);
        }
        if (sound6.isPlaying()) {
            sound6.pause();
            sound6.seekTo(0);
            sound6.setLooping(false);
        }
        if (sound7.isPlaying()) {
            sound7.pause();
            sound7.seekTo(0);
            sound7.setLooping(false);
        }
        if (sound8.isPlaying()) {
            sound8.pause();
            sound8.seekTo(0);
            sound8.setLooping(false);
        }
        if (sound9.isPlaying()) {
            sound9.pause();
            sound9.seekTo(0);
            sound9.setLooping(false);
        }
        if (sound10.isPlaying()) {
            sound10.pause();
            sound10.seekTo(0);
            sound10.setLooping(false);
        }
        if (sound11.isPlaying()) {
            sound11.pause();
            sound11.seekTo(0);
            sound11.setLooping(false);
        }
        if (sound12.isPlaying()) {
            sound12.pause();
            sound12.seekTo(0);
            sound12.setLooping(false);
        }
        if (sound13.isPlaying()) {
            sound13.pause();
            sound13.seekTo(0);
            sound13.setLooping(false);
        }
        if (sound14.isPlaying()) {
            sound14.pause();
            sound14.seekTo(0);
            sound14.setLooping(false);
        }
        if (sound15.isPlaying()) {
            sound15.pause();
            sound15.seekTo(0);
            sound15.setLooping(false);
        }
        if (sound16.isPlaying()) {
            sound16.pause();
            sound16.seekTo(0);
            sound16.setLooping(false);
        }
        if (sound17.isPlaying()) {
            sound17.pause();
            sound17.seekTo(0);
            sound17.setLooping(false);
        }
        if (sound18.isPlaying()) {
            sound18.pause();
            sound18.seekTo(0);
            sound18.setLooping(false);
        }
        if (sound19.isPlaying()) {
            sound19.pause();
            sound19.seekTo(0);
            sound19.setLooping(false);
        }
        if (sound20.isPlaying()) {
            sound20.pause();
            sound20.seekTo(0);
            sound20.setLooping(false);
        }
        if (sound21.isPlaying()) {
            sound21.pause();
            sound21.seekTo(0);
            sound21.setLooping(false);
        }
        sound1.start();
        sound1.setLooping(true);


    }

    private void soundStopButton1(MediaPlayer sound1) {

        if (sound1.isPlaying()) {
            sound1.pause();
            sound1.setLooping(false);
            pause.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound1.start();
            sound1.setLooping(true);
            pause.setBackgroundResource(R.drawable.ic_pause);
        }
    }

    private void soundStopButton2(MediaPlayer sound2) {

        if (sound2.isPlaying()) {
            sound2.pause();
            sound2.setLooping(false);
            pause2.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound2.start();
            sound2.setLooping(true);
            pause2.setBackgroundResource(R.drawable.ic_pause);
        }

    }

    private void soundStopButton3(MediaPlayer sound3) {

        if (sound3.isPlaying()) {
            sound3.pause();
            sound3.setLooping(false);
            pause3.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound3.start();
            sound3.setLooping(true);
            pause3.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton4(MediaPlayer sound4) {

        if (sound4.isPlaying()) {
            sound4.pause();
            sound4.setLooping(false);
            pause4.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound4.start();
            sound4.setLooping(true);
            pause4.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton5(MediaPlayer sound5) {

        if (sound5.isPlaying()) {
            sound5.pause();
            sound5.setLooping(false);
            pause5.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound5.start();
            sound5.setLooping(true);
            pause5.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton6(MediaPlayer sound6) {

        if (sound6.isPlaying()) {
            sound6.pause();
            sound6.setLooping(false);
            pause6.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound6.start();
            sound6.setLooping(true);
            pause6.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton7(MediaPlayer sound7) {

        if (sound7.isPlaying()) {
            sound7.pause();
            sound7.setLooping(false);
            pause7.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound7.start();
            sound7.setLooping(true);
            pause7.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton8(MediaPlayer sound8) {

        if (sound8.isPlaying()) {
            sound8.pause();
            sound8.setLooping(false);
            pause8.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound8.start();
            sound8.setLooping(true);
            pause8.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton9(MediaPlayer sound9) {

        if (sound9.isPlaying()) {
            sound9.pause();
            sound9.setLooping(false);
            pause9.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound9.start();
            sound9.setLooping(true);
            pause9.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton10(MediaPlayer sound10) {

        if (sound10.isPlaying()) {
            sound10.pause();
            sound10.setLooping(false);
            pause10.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound10.start();
            sound10.setLooping(true);
            pause10.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton11(MediaPlayer sound11) {

        if (sound11.isPlaying()) {
            sound11.pause();
            sound11.setLooping(false);
            pause11.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound11.start();
            sound11.setLooping(true);
            pause11.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton12(MediaPlayer sound12) {

        if (sound12.isPlaying()) {
            sound12.pause();
            sound12.setLooping(false);
            pause12.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound12.start();
            sound12.setLooping(true);
            pause12.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton13(MediaPlayer sound13) {

        if (sound13.isPlaying()) {
            sound13.pause();
            sound13.setLooping(false);
            pause13.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound13.start();
            sound13.setLooping(true);
            pause13.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton14(MediaPlayer sound14) {

        if (sound14.isPlaying()) {
            sound14.pause();
            sound14.setLooping(false);
            pause14.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound14.start();
            sound14.setLooping(true);
            pause14.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton15(MediaPlayer sound15) {

        if (sound15.isPlaying()) {
            sound15.pause();
            sound15.setLooping(false);
            pause15.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound15.start();
            sound15.setLooping(true);
            pause15.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton16(MediaPlayer sound16) {

        if (sound16.isPlaying()) {
            sound16.pause();
            sound16.setLooping(false);
            pause16.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound16.start();
            sound16.setLooping(true);
            pause16.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton17(MediaPlayer sound17) {

        if (sound17.isPlaying()) {
            sound17.pause();
            sound17.setLooping(false);
            pause17.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound17.start();
            sound17.setLooping(true);
            pause17.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton18(MediaPlayer sound18) {

        if (sound18.isPlaying()) {
            sound18.pause();
            sound18.setLooping(false);
            pause18.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound18.start();
            sound18.setLooping(true);
            pause18.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton19(MediaPlayer sound19) {

        if (sound19.isPlaying()) {
            sound19.pause();
            sound19.setLooping(false);
            pause19.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound19.start();
            sound19.setLooping(true);
            pause19.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton20(MediaPlayer sound20) {

        if (sound20.isPlaying()) {
            sound20.pause();
            sound20.setLooping(false);
            pause20.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound20.start();
            sound20.setLooping(true);
            pause20.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    private void soundStopButton21(MediaPlayer sound21) {

        if (sound21.isPlaying()) {
            sound21.pause();
            sound21.setLooping(false);
            pause21.setBackgroundResource(R.drawable.ic_play);
        } else {
            sound21.start();
            sound21.setLooping(true);
            pause21.setBackgroundResource(R.drawable.ic_pause);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_sleep);

        button1Pressed();

        if (musicForest.isPlaying()) {
            musicSave1.setVisibility(View.VISIBLE);
            musicSave1.setClickable(true);
        }
        else{
            musicSave1.setVisibility(View.GONE);
            musicSave1.setClickable(false);
        }

        if (musicMurmur.isPlaying()) {

            musicSave2.setVisibility(View.VISIBLE);
            musicSave2.setClickable(true);
        }
        else{
            musicSave2.setVisibility(View.GONE);
            musicSave2.setClickable(false);
        }

        if (musicRain.isPlaying()) {
            musicSave3.setVisibility(View.VISIBLE);
            musicSave3.setClickable(true);
        }
        else{
            musicSave3.setVisibility(View.GONE);
            musicSave3.setClickable(false);
        }

        if (musicNature.isPlaying()) {
            musicSave4.setVisibility(View.VISIBLE);
            musicSave4.setClickable(true);
        }
        else{
            musicSave4.setVisibility(View.GONE);
            musicSave4.setClickable(false);
        }

        if (musicNightNature.isPlaying()) {
            musicSave5.setVisibility(View.VISIBLE);
            musicSave5.setClickable(true);
        }
        else{
            musicSave5.setVisibility(View.GONE);
            musicSave5.setClickable(false);
        }

        if (musicFire.isPlaying()) {
            musicSave6.setVisibility(View.VISIBLE);
            musicSave6.setClickable(true);

        }
        else{
            musicSave6.setVisibility(View.GONE);
            musicSave6.setClickable(false);
        }

        if (musicBird.isPlaying()) {
            musicSave7.setVisibility(View.VISIBLE);
            musicSave7.setClickable(true);
        }
        else{
            musicSave7.setVisibility(View.GONE);
            musicSave7.setClickable(false);
        }

        if (musicAutumn.isPlaying()) {
            musicSave8.setVisibility(View.VISIBLE);
            musicSave8.setClickable(false);
        }
        else{
            musicSave8.setVisibility(View.GONE);
            musicSave1.setClickable(true);
        }

        if (musicWave.isPlaying()) {
            musicSave9.setVisibility(View.VISIBLE);
            musicSave9.setClickable(true);
        }
        else{
            musicSave9.setVisibility(View.GONE);
            musicSave9.setClickable(false);
        }

        if (musicThunderStorm.isPlaying()) {
            musicSave10.setVisibility(View.VISIBLE);
            musicSave10.setClickable(true);
        }
        else{
            musicSave10.setVisibility(View.GONE);
            musicSave10.setClickable(false);
        }

        if (musicSnow.isPlaying()) {
            musicSave11.setVisibility(View.VISIBLE);
            musicSave11.setClickable(true);
        }
        else{
            musicSave11.setVisibility(View.GONE);
            musicSave11.setClickable(false);
        }

        if (musicDolphin.isPlaying()) {
            musicSave12.setVisibility(View.VISIBLE);
            musicSave12.setClickable(true);
        }
        else{
            musicSave12.setVisibility(View.GONE);
            musicSave12.setClickable(false);
        }

        if (musicSeagull.isPlaying()) {
            musicSave13.setVisibility(View.VISIBLE);
            musicSave13.setClickable(true);
        }
        else{
            musicSave13.setVisibility(View.GONE);
            musicSave13.setClickable(false);
        }

        if (musicCat.isPlaying()) {
            musicSave14.setVisibility(View.VISIBLE);
            musicSave14.setClickable(true);
        }
        else{
            musicSave14.setVisibility(View.GONE);
            musicSave14.setClickable(false);
        }

        if (musicSteps.isPlaying()) {
            musicSave15.setVisibility(View.VISIBLE);
            musicSave15.setClickable(true);
        }
        else{
            musicSave15.setVisibility(View.GONE);
            musicSave15.setClickable(false);
        }

        if (musicStreet.isPlaying()) {
            musicSave16.setVisibility(View.VISIBLE);
            musicSave16.setClickable(true);
        }
        else{
            musicSave16.setVisibility(View.GONE);
            musicSave16.setClickable(false);
        }

        if (musicWhale.isPlaying()) {
            musicSave17.setVisibility(View.VISIBLE);
            musicSave17.setClickable(true);
        }
        else{
            musicSave17.setVisibility(View.GONE);
            musicSave17.setClickable(false);
        }

        if (musicTrain.isPlaying()) {
            musicSave18.setVisibility(View.VISIBLE);
            musicSave18.setClickable(false);
        }
        else{
            musicSave18.setVisibility(View.GONE);
            musicSave18.setClickable(false);
        }

        if (musicSpace.isPlaying()) {
            musicSave19.setVisibility(View.VISIBLE);
            musicSave19.setClickable(true);
        }
        else{
            musicSave19.setVisibility(View.GONE);
            musicSave19.setClickable(false);
        }

        if (musicPianino.isPlaying()) {
            musicSave20.setVisibility(View.VISIBLE);
            musicSave20.setClickable(true);

        }
        else{
            musicSave20.setVisibility(View.GONE);
            musicSave20.setClickable(false);
        }

        if (musicGuitar.isPlaying()) {
            musicSave21.setVisibility(View.VISIBLE);
            musicSave21.setClickable(true);
        }
        else{
            musicSave21.setVisibility(View.GONE);
            musicSave21.setClickable(false);
        }

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

        selected1.setVisibility(View.INVISIBLE);
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

        pause.setVisibility(View.INVISIBLE);
        pause2.setVisibility(View.INVISIBLE);
        pause3.setVisibility(View.INVISIBLE);
        pause4.setVisibility(View.INVISIBLE);
        pause5.setVisibility(View.INVISIBLE);
        pause6.setVisibility(View.INVISIBLE);
        pause7.setVisibility(View.INVISIBLE);
        pause8.setVisibility(View.INVISIBLE);
        pause9.setVisibility(View.INVISIBLE);
        pause10.setVisibility(View.INVISIBLE);
        pause11.setVisibility(View.INVISIBLE);
        pause12.setVisibility(View.INVISIBLE);
        pause13.setVisibility(View.INVISIBLE);
        pause14.setVisibility(View.INVISIBLE);
        pause15.setVisibility(View.INVISIBLE);
        pause16.setVisibility(View.INVISIBLE);
        pause17.setVisibility(View.INVISIBLE);
        pause18.setVisibility(View.INVISIBLE);
        pause19.setVisibility(View.INVISIBLE);
        pause20.setVisibility(View.INVISIBLE);
        pause21.setVisibility(View.INVISIBLE);

        image2 = findViewById(R.id.image2);
        image1 = findViewById(R.id.image1);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image16 = findViewById(R.id.image16);
        image17 = findViewById(R.id.image17);
        image18 = findViewById(R.id.image18);
        image19 = findViewById(R.id.image19);
        image20 = findViewById(R.id.image20);
        image21 = findViewById(R.id.image21);

        musicButton3 = findViewById(R.id.musicButton3);
        musicButton1 = findViewById(R.id.musicButton1);
        musicButton2 = findViewById(R.id.musicButton2);
        musicButton4 = findViewById(R.id.musicButton4);
        musicButton5 = findViewById(R.id.musicButton5);
        musicButton6 = findViewById(R.id.musicButton6);
        musicButton7 = findViewById(R.id.musicButton7);
        musicButton8 = findViewById(R.id.musicButton8);
        musicButton9 = findViewById(R.id.musicButton9);
        musicButton10 = findViewById(R.id.musicButton10);
        musicButton11 = findViewById(R.id.musicButton11);
        musicButton12 = findViewById(R.id.musicButton12);
        musicButton13 = findViewById(R.id.musicButton13);
        musicButton14 = findViewById(R.id.musicButton14);
        musicButton15 = findViewById(R.id.musicButton15);
        musicButton16 = findViewById(R.id.musicButton16);
        musicButton17 = findViewById(R.id.musicButton17);
        musicButton18 = findViewById(R.id.musicButton18);
        musicButton19 = findViewById(R.id.musicButton19);
        musicButton20 = findViewById(R.id.musicButton20);
        musicButton21 = findViewById(R.id.musicButton21);

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

        Animation animationB = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB2 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB3 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB4 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB5 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB6 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB7 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB8 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB9 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB10 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB11 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB12 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB13 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB14 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB15 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB16 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB17 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB18 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB19 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB20 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationB21 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        musicSave1 = findViewById(R.id.musicSave1);
        musicSave2 = findViewById(R.id.musicSave2);
        musicSave3 = findViewById(R.id.musicSave3);
        musicSave4 = findViewById(R.id.musicSave4);
        musicSave5 = findViewById(R.id.musicSave5);
        musicSave6 = findViewById(R.id.musicSave6);
        musicSave7 = findViewById(R.id.musicSave7);
        musicSave8 = findViewById(R.id.musicSave8);
        musicSave9 = findViewById(R.id.musicSave9);
        musicSave10 = findViewById(R.id.musicSave10);
        musicSave11 = findViewById(R.id.musicSave11);
        musicSave12 = findViewById(R.id.musicSave12);
        musicSave13 = findViewById(R.id.musicSave13);
        musicSave14 = findViewById(R.id.musicSave14);
        musicSave15 = findViewById(R.id.musicSave15);
        musicSave16 = findViewById(R.id.musicSave16);
        musicSave17 = findViewById(R.id.musicSave17);
        musicSave18 = findViewById(R.id.musicSave18);
        musicSave19 = findViewById(R.id.musicSave19);
        musicSave20 = findViewById(R.id.musicSave20);
        musicSave21 = findViewById(R.id.musicSave21);

        musicSave1.setVisibility(View.GONE);
        musicSave2.setVisibility(View.GONE);
        musicSave3.setVisibility(View.GONE);
        musicSave4.setVisibility(View.GONE);
        musicSave5.setVisibility(View.GONE);
        musicSave6.setVisibility(View.GONE);
        musicSave7.setVisibility(View.GONE);
        musicSave8.setVisibility(View.GONE);
        musicSave9.setVisibility(View.GONE);
        musicSave10.setVisibility(View.GONE);
        musicSave11.setVisibility(View.GONE);
        musicSave12.setVisibility(View.GONE);
        musicSave13.setVisibility(View.GONE);
        musicSave14.setVisibility(View.GONE);
        musicSave15.setVisibility(View.GONE);
        musicSave16.setVisibility(View.GONE);
        musicSave17.setVisibility(View.GONE);
        musicSave18.setVisibility(View.GONE);
        musicSave19.setVisibility(View.GONE);
        musicSave20.setVisibility(View.GONE);
        musicSave21.setVisibility(View.GONE);

        musicSave1.setClickable(false);
        musicSave2.setClickable(false);
        musicSave3.setClickable(false);
        musicSave4.setClickable(false);
        musicSave5.setClickable(false);
        musicSave6.setClickable(false);
        musicSave7.setClickable(false);
        musicSave8.setClickable(false);
        musicSave9.setClickable(false);
        musicSave10.setClickable(false);
        musicSave11.setClickable(false);
        musicSave12.setClickable(false);
        musicSave13.setClickable(false);
        musicSave14.setClickable(false);
        musicSave15.setClickable(false);
        musicSave16.setClickable(false);
        musicSave17.setClickable(false);
        musicSave18.setClickable(false);
        musicSave19.setClickable(false);
        musicSave20.setClickable(false);
        musicSave21.setClickable(false);

        // лес
        musicForest = MediaPlayer.create(this, R.raw.forest);
        // журчание ручья
        musicMurmur = MediaPlayer.create(this, R.raw.murmur);
        // дождь
        musicRain = MediaPlayer.create(this, R.raw.rain);
        // природа
        musicNature = MediaPlayer.create(this, R.raw.nature);
        // ночная природа
        musicNightNature = MediaPlayer.create(this, R.raw.night_nature);
        // звуки костра
        musicFire = MediaPlayer.create(this, R.raw.fire);
        // пение птиц
        musicBird = MediaPlayer.create(this, R.raw.bird);
        // осень природа
        musicAutumn = MediaPlayer.create(this, R.raw.autumn);
        // волна
        musicWave = MediaPlayer.create(this, R.raw.wave);
        // гроза
        musicThunderStorm = MediaPlayer.create(this, R.raw.thunder_storm);
        // снегопад
        musicSnow = MediaPlayer.create(this, R.raw.snow);
        // дельфины
        musicDolphin = MediaPlayer.create(this, R.raw.dolphin);
        // чайки
        musicSeagull = MediaPlayer.create(this, R.raw.seagull);
        // кот мурчание
        musicCat = MediaPlayer.create(this, R.raw.cat);
        // шаги по снегу / хруст снега
        musicSteps = MediaPlayer.create(this, R.raw.steps);
        // звук дороги
        musicStreet = MediaPlayer.create(this, R.raw.street);
        // кит звуки
        musicWhale = MediaPlayer.create(this, R.raw.whale);
        // стук колес поезда
        musicTrain = MediaPlayer.create(this, R.raw.train);
        // космос
        musicSpace = MediaPlayer.create(this, R.raw.space);
        // пианино
        musicPianino = MediaPlayer.create(this, R.raw.pianino);
        // гитара
        musicGuitar = MediaPlayer.create(this, R.raw.guitar);

        musicButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicForest, musicMurmur, musicRain, musicNature, musicNightNature, musicFire, musicBird, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton1.startAnimation(animation);

                final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
                prefs.edit().putBoolean("button_1_pressed", true).apply();

                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.VISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(false);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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

                soundPLayButton(musicMurmur, musicForest, musicRain, musicNature, musicNightNature, musicFire, musicBird, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton2.startAnimation(animation1);

                image2.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.VISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(false);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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

                soundPLayButton(musicRain, musicMurmur, musicForest, musicNature, musicNightNature, musicFire, musicBird, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton3.startAnimation(animation2);

                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.VISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(false);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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

                soundPLayButton(musicNature, musicRain, musicMurmur, musicForest, musicNightNature, musicFire, musicBird, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton4.startAnimation(animation3);

                image4.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.VISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(false);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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

                soundPLayButton(musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicFire, musicBird, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton5.startAnimation(animation4);

                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.INVISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.VISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(false);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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

                soundPLayButton(musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicBird, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton6.startAnimation(animation5);

                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image6.setVisibility(View.INVISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.VISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(false);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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

                soundPLayButton(musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicAutumn, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton7.startAnimation(animation6);

                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.INVISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.VISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(false);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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

                soundPLayButton(musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicWave, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton8.startAnimation(animation7);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.INVISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.VISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(false);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

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
        musicButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicThunderStorm, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton9.startAnimation(animation8);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.INVISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.VISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(false);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.VISIBLE);
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
        musicButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicSnow, musicDolphin, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton10.startAnimation(animation9);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.INVISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.VISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(false);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.VISIBLE);
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
        musicButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicSnow, musicDolphin, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton11.startAnimation(animation10);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.INVISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.VISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(false);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
                selected2.setVisibility(View.INVISIBLE);
                selected3.setVisibility(View.INVISIBLE);
                selected4.setVisibility(View.INVISIBLE);
                selected5.setVisibility(View.INVISIBLE);
                selected6.setVisibility(View.INVISIBLE);
                selected7.setVisibility(View.INVISIBLE);
                selected8.setVisibility(View.INVISIBLE);
                selected9.setVisibility(View.INVISIBLE);
                selected10.setVisibility(View.INVISIBLE);
                selected11.setVisibility(View.VISIBLE);
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
        musicButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicSeagull, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton12.startAnimation(animation11);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.INVISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.VISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(false);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected12.setVisibility(View.VISIBLE);
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
        musicButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton13.startAnimation(animation12);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.INVISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.VISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(false);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected13.setVisibility(View.VISIBLE);
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
        musicButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicCat, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicSteps, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton14.startAnimation(animation13);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.INVISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.VISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(false);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected14.setVisibility(View.VISIBLE);
                selected15.setVisibility(View.INVISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicSteps, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicStreet, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton15.startAnimation(animation14);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.INVISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.VISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(false);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected15.setVisibility(View.VISIBLE);
                selected16.setVisibility(View.INVISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicStreet, musicSteps, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicWhale, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton16.startAnimation(animation15);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.INVISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.VISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(false);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected16.setVisibility(View.VISIBLE);
                selected17.setVisibility(View.INVISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicWhale, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicStreet, musicSteps, musicTrain, musicSpace, musicPianino, musicGuitar);

                musicButton17.startAnimation(animation16);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.INVISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.VISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(false);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected17.setVisibility(View.VISIBLE);
                selected18.setVisibility(View.INVISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicTrain, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicStreet, musicSteps, musicWhale, musicSpace, musicPianino, musicGuitar);

                musicButton18.startAnimation(animation17);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.INVISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.VISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(false);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected18.setVisibility(View.VISIBLE);
                selected19.setVisibility(View.INVISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicSpace, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicStreet, musicSteps, musicWhale, musicTrain, musicPianino, musicGuitar);

                musicButton19.startAnimation(animation18);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.INVISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.VISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(false);
                musicButton20.setClickable(true);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected19.setVisibility(View.VISIBLE);
                selected20.setVisibility(View.INVISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicPianino, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicStreet, musicSteps, musicSpace, musicWhale, musicTrain, musicGuitar);

                musicButton20.startAnimation(animation19);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.INVISIBLE);
                image21.setVisibility(View.VISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.VISIBLE);
                pause21.setVisibility(View.INVISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause21.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(false);
                musicButton21.setClickable(true);

                selected1.setVisibility(View.INVISIBLE);
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
                selected20.setVisibility(View.VISIBLE);
                selected21.setVisibility(View.INVISIBLE);
            }
        });
        musicButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPLayButton(musicGuitar, musicSeagull, musicDolphin, musicSnow, musicThunderStorm, musicWave, musicAutumn, musicBird, musicFire, musicNightNature, musicNature, musicRain, musicMurmur, musicForest, musicCat, musicStreet, musicSteps, musicWhale, musicTrain, musicSpace, musicPianino);

                musicButton21.startAnimation(animation20);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                image5.setVisibility(View.VISIBLE);
                image4.setVisibility(View.VISIBLE);
                image6.setVisibility(View.VISIBLE);
                image7.setVisibility(View.VISIBLE);
                image8.setVisibility(View.VISIBLE);
                image9.setVisibility(View.VISIBLE);
                image10.setVisibility(View.VISIBLE);
                image11.setVisibility(View.VISIBLE);
                image12.setVisibility(View.VISIBLE);
                image13.setVisibility(View.VISIBLE);
                image14.setVisibility(View.VISIBLE);
                image15.setVisibility(View.VISIBLE);
                image16.setVisibility(View.VISIBLE);
                image17.setVisibility(View.VISIBLE);
                image18.setVisibility(View.VISIBLE);
                image19.setVisibility(View.VISIBLE);
                image20.setVisibility(View.VISIBLE);
                image21.setVisibility(View.INVISIBLE);

                pause.setVisibility(View.INVISIBLE);
                pause2.setVisibility(View.INVISIBLE);
                pause3.setVisibility(View.INVISIBLE);
                pause4.setVisibility(View.INVISIBLE);
                pause5.setVisibility(View.INVISIBLE);
                pause6.setVisibility(View.INVISIBLE);
                pause7.setVisibility(View.INVISIBLE);
                pause8.setVisibility(View.INVISIBLE);
                pause9.setVisibility(View.INVISIBLE);
                pause10.setVisibility(View.INVISIBLE);
                pause11.setVisibility(View.INVISIBLE);
                pause12.setVisibility(View.INVISIBLE);
                pause13.setVisibility(View.INVISIBLE);
                pause14.setVisibility(View.INVISIBLE);
                pause15.setVisibility(View.INVISIBLE);
                pause16.setVisibility(View.INVISIBLE);
                pause17.setVisibility(View.INVISIBLE);
                pause18.setVisibility(View.INVISIBLE);
                pause19.setVisibility(View.INVISIBLE);
                pause20.setVisibility(View.INVISIBLE);
                pause21.setVisibility(View.VISIBLE);

                pause2.setBackgroundResource(R.drawable.ic_pause);
                pause3.setBackgroundResource(R.drawable.ic_pause);
                pause4.setBackgroundResource(R.drawable.ic_pause);
                pause5.setBackgroundResource(R.drawable.ic_pause);
                pause6.setBackgroundResource(R.drawable.ic_pause);
                pause7.setBackgroundResource(R.drawable.ic_pause);
                pause8.setBackgroundResource(R.drawable.ic_pause);
                pause9.setBackgroundResource(R.drawable.ic_pause);
                pause10.setBackgroundResource(R.drawable.ic_pause);
                pause.setBackgroundResource(R.drawable.ic_pause);
                pause11.setBackgroundResource(R.drawable.ic_pause);
                pause12.setBackgroundResource(R.drawable.ic_pause);
                pause14.setBackgroundResource(R.drawable.ic_pause);
                pause13.setBackgroundResource(R.drawable.ic_pause);
                pause15.setBackgroundResource(R.drawable.ic_pause);
                pause16.setBackgroundResource(R.drawable.ic_pause);
                pause17.setBackgroundResource(R.drawable.ic_pause);
                pause18.setBackgroundResource(R.drawable.ic_pause);
                pause19.setBackgroundResource(R.drawable.ic_pause);
                pause20.setBackgroundResource(R.drawable.ic_pause);

                musicButton1.setClickable(true);
                musicButton2.setClickable(true);
                musicButton3.setClickable(true);
                musicButton4.setClickable(true);
                musicButton5.setClickable(true);
                musicButton6.setClickable(true);
                musicButton7.setClickable(true);
                musicButton8.setClickable(true);
                musicButton9.setClickable(true);
                musicButton10.setClickable(true);
                musicButton11.setClickable(true);
                musicButton12.setClickable(true);
                musicButton13.setClickable(true);
                musicButton14.setClickable(true);
                musicButton15.setClickable(true);
                musicButton16.setClickable(true);
                musicButton17.setClickable(true);
                musicButton18.setClickable(true);
                musicButton19.setClickable(true);
                musicButton20.setClickable(true);
                musicButton21.setClickable(false);

                selected1.setVisibility(View.INVISIBLE);
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
                selected21.setVisibility(View.VISIBLE);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton1(musicForest);
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton2(musicMurmur);
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton3(musicRain);
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton4(musicNature);
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton5(musicNightNature);
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton6(musicFire);
            }
        });
        pause7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton7(musicBird);
            }
        });
        pause8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton8(musicAutumn);
            }
        });
        pause9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton9(musicWave);
            }
        });
        pause10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton10(musicThunderStorm);
            }
        });
        pause11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton11(musicSnow);
            }
        });
        pause12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton12(musicDolphin);
            }
        });
        pause13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton13(musicSeagull);
            }
        });
        pause14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton14(musicCat);
            }
        });
        pause15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton15(musicSteps);
            }
        });
        pause16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton16(musicStreet);
            }
        });
        pause17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton17(musicWhale);
            }
        });
        pause18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton18(musicTrain);
            }
        });
        pause19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton19(musicSpace);
            }
        });
        pause20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton20(musicPianino);
            }
        });
        pause21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundStopButton21(musicGuitar);
            }
        });


        musicSave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave1.startAnimation(animationB1);
                Intent intent = new Intent(MusicSleepActivity.this, AlarmSleepActivity.class);
                intent.putExtra("music1", "Звуки леса");
                startActivity(intent);
            }
        });
        musicSave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave2.startAnimation(animationB2);
                Intent intent = new Intent(MusicSleepActivity.this, AlarmSleepActivity.class);
                intent.putExtra("music2", "Звуки журчание ручья");
                startActivity(intent);
            }
        });
        musicSave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave3.startAnimation(animationB3);
                Intent intent = new Intent(MusicSleepActivity.this, AlarmSleepActivity.class);
                intent.putExtra("music3", "Звуки дождя");
                startActivity(intent);
            }
        });
        musicSave4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave4.startAnimation(animationB4);
            }
        });
        musicSave5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave5.startAnimation(animationB5);
            }
        });
        musicSave6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave6.startAnimation(animationB6);
            }
        });
        musicSave7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave7.startAnimation(animationB7);
            }
        });
        musicSave8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave8.startAnimation(animationB8);
            }
        });
        musicSave9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave9.startAnimation(animationB9);
            }
        });
        musicSave10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave10.startAnimation(animationB10);
            }
        });
        musicSave11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave11.startAnimation(animationB11);
            }
        });
        musicSave12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave12.startAnimation(animationB12);
            }
        });
        musicSave13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave13.startAnimation(animationB13);
            }
        });
        musicSave14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave14.startAnimation(animationB14);
            }
        });
        musicSave15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave15.startAnimation(animationB15);
            }
        });
        musicSave16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave16.startAnimation(animationB16);
            }
        });
        musicSave17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave17.startAnimation(animationB17);
            }
        });
        musicSave18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave18.startAnimation(animationB18);
            }
        });
        musicSave19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave19.startAnimation(animationB19);
            }
        });
        musicSave20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave20.startAnimation(animationB20);
            }
        });
        musicSave21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSave21.startAnimation(animationB21);
            }
        });


    }

    private void button1Pressed() {
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        boolean isButton1Pressed = prefs.getBoolean("button_1_pressed", false);
        if (isButton1Pressed) {

            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.VISIBLE);
            image3.setVisibility(View.VISIBLE);
            image5.setVisibility(View.VISIBLE);
            image4.setVisibility(View.VISIBLE);
            image6.setVisibility(View.VISIBLE);
            image7.setVisibility(View.VISIBLE);
            image8.setVisibility(View.VISIBLE);
            image9.setVisibility(View.VISIBLE);
            image10.setVisibility(View.VISIBLE);
            image11.setVisibility(View.VISIBLE);
            image12.setVisibility(View.VISIBLE);
            image13.setVisibility(View.VISIBLE);
            image14.setVisibility(View.VISIBLE);
            image15.setVisibility(View.VISIBLE);
            image16.setVisibility(View.VISIBLE);
            image17.setVisibility(View.VISIBLE);
            image18.setVisibility(View.VISIBLE);
            image19.setVisibility(View.VISIBLE);
            image20.setVisibility(View.VISIBLE);
            image21.setVisibility(View.VISIBLE);

            pause.setVisibility(View.VISIBLE);
            pause2.setVisibility(View.INVISIBLE);
            pause3.setVisibility(View.INVISIBLE);
            pause4.setVisibility(View.INVISIBLE);
            pause5.setVisibility(View.INVISIBLE);
            pause6.setVisibility(View.INVISIBLE);
            pause7.setVisibility(View.INVISIBLE);
            pause8.setVisibility(View.INVISIBLE);
            pause9.setVisibility(View.INVISIBLE);
            pause10.setVisibility(View.INVISIBLE);
            pause11.setVisibility(View.INVISIBLE);
            pause12.setVisibility(View.INVISIBLE);
            pause13.setVisibility(View.INVISIBLE);
            pause14.setVisibility(View.INVISIBLE);
            pause15.setVisibility(View.INVISIBLE);
            pause16.setVisibility(View.INVISIBLE);
            pause17.setVisibility(View.INVISIBLE);
            pause18.setVisibility(View.INVISIBLE);
            pause19.setVisibility(View.INVISIBLE);
            pause20.setVisibility(View.INVISIBLE);
            pause21.setVisibility(View.INVISIBLE);

            pause2.setBackgroundResource(R.drawable.ic_pause);
            pause3.setBackgroundResource(R.drawable.ic_pause);
            pause4.setBackgroundResource(R.drawable.ic_pause);
            pause5.setBackgroundResource(R.drawable.ic_pause);
            pause6.setBackgroundResource(R.drawable.ic_pause);
            pause7.setBackgroundResource(R.drawable.ic_pause);
            pause8.setBackgroundResource(R.drawable.ic_pause);
            pause9.setBackgroundResource(R.drawable.ic_pause);
            pause10.setBackgroundResource(R.drawable.ic_pause);
            pause11.setBackgroundResource(R.drawable.ic_pause);
            pause12.setBackgroundResource(R.drawable.ic_pause);
            pause13.setBackgroundResource(R.drawable.ic_pause);
            pause14.setBackgroundResource(R.drawable.ic_pause);
            pause15.setBackgroundResource(R.drawable.ic_pause);
            pause16.setBackgroundResource(R.drawable.ic_pause);
            pause17.setBackgroundResource(R.drawable.ic_pause);
            pause18.setBackgroundResource(R.drawable.ic_pause);
            pause19.setBackgroundResource(R.drawable.ic_pause);
            pause20.setBackgroundResource(R.drawable.ic_pause);
            pause21.setBackgroundResource(R.drawable.ic_pause);

            musicButton1.setClickable(false);
            musicButton2.setClickable(true);
            musicButton3.setClickable(true);
            musicButton4.setClickable(true);
            musicButton5.setClickable(true);
            musicButton6.setClickable(true);
            musicButton7.setClickable(true);
            musicButton8.setClickable(true);
            musicButton9.setClickable(true);
            musicButton10.setClickable(true);
            musicButton11.setClickable(true);
            musicButton12.setClickable(true);
            musicButton13.setClickable(true);
            musicButton14.setClickable(true);
            musicButton15.setClickable(true);
            musicButton16.setClickable(true);
            musicButton17.setClickable(true);
            musicButton18.setClickable(true);
            musicButton19.setClickable(true);
            musicButton20.setClickable(true);
            musicButton21.setClickable(true);

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

    }
}