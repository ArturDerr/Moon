package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class RecommendationActivity extends AppCompatActivity {

    RelativeLayout rec1, rec2, rec3, rec4, rec5, rec6, rec7, rec8, rec9, rec10, rec11, rec12, rec13, rec14, rec15, rec16;
    RelativeLayout recOpen1, recOpen2, recOpen3, recOpen4, recOpen5, recOpen6, recOpen7, recOpen8, recOpen9, recOpen10, recOpen11, recOpen12, recOpen13, recOpen14, recOpen15, recOpen16;
    Button buttonRec1, buttonRec2, buttonRec3, buttonRec4, buttonRec5, buttonRec6, buttonRec7, buttonRec8, buttonRec9, buttonRec10, buttonRec11,buttonRec12, buttonRec13, buttonRec14, buttonRec15, buttonRec16;
    Button buttonRecBack1, buttonRecBack2, buttonRecBack3, buttonRecBack4, buttonRecBack5, buttonRecBack6, buttonRecBack7, buttonRecBack8, buttonRecBack9, buttonRecBack10, buttonRecBack11, buttonRecBack12, buttonRecBack13, buttonRecBack14, buttonRecBack15, buttonRecBack16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        rec1 = findViewById(R.id.rec1);
        rec2 = findViewById(R.id.rec2);
        rec3 = findViewById(R.id.rec3);
        //rec4 = findViewById(R.id.rec4);
        //rec5 = findViewById(R.id.rec5);
        //rec6 = findViewById(R.id.rec6);
        //rec7 = findViewById(R.id.rec7);
        //rec8 = findViewById(R.id.rec8);
        //rec9 = findViewById(R.id.rec9);
        //rec10 = findViewById(R.id.rec10);
        //rec11 = findViewById(R.id.rec11);
        //rec12 = findViewById(R.id.rec12);
        //rec13 = findViewById(R.id.rec13);
        //rec14 = findViewById(R.id.rec14);
        //rec15 = findViewById(R.id.rec15);
        //rec16 = findViewById(R.id.rec16);

        recOpen1 = findViewById(R.id.recOpen1);
        recOpen2 = findViewById(R.id.recOpen2);
        recOpen3 = findViewById(R.id.recOpen3);
        //recOpen4 = findViewById(R.id.recOpen4);
        //recOpen5 = findViewById(R.id.recOpen5);
        //recOpen6 = findViewById(R.id.recOpen6);
        //recOpen7 = findViewById(R.id.recOpen7);
        //recOpen8 = findViewById(R.id.recOpen8);
        //recOpen9 = findViewById(R.id.recOpen9);
        //recOpen10 = findViewById(R.id.recOpen10);
        //recOpen11 = findViewById(R.id.recOpen11);
        //recOpen12 = findViewById(R.id.recOpen12);
        //recOpen13 = findViewById(R.id.recOpen13);
        //recOpen14 = findViewById(R.id.recOpen14);
        //recOpen15 = findViewById(R.id.recOpen15);
        //recOpen16 = findViewById(R.id.recOpen16);

        buttonRec1 = findViewById(R.id.buttonRec1);
        buttonRec2 = findViewById(R.id.buttonRec2);
        buttonRec3 = findViewById(R.id.buttonRec3);
        //buttonRec4 = findViewById(R.id.buttonRec4);
        //buttonRec5 = findViewById(R.id.buttonRec5);
        //buttonRec6 = findViewById(R.id.buttonRec6);
        //buttonRec7 = findViewById(R.id.buttonRec7);
        //buttonRec8 = findViewById(R.id.buttonRec8);
        ///buttonRec9 = findViewById(R.id.buttonRec9);
        //buttonRec10 = findViewById(R.id.buttonRec10);
        //buttonRec11 = findViewById(R.id.buttonRec11);
        //buttonRec12 = findViewById(R.id.buttonRec12);
        //buttonRec13 = findViewById(R.id.buttonRec13);
        //buttonRec14 = findViewById(R.id.buttonRec14);
        //buttonRec15 = findViewById(R.id.buttonRec15);
        //buttonRec16 = findViewById(R.id.buttonRec16);

        buttonRecBack1 =  findViewById(R.id.buttonRecBack1);
        buttonRecBack2 =  findViewById(R.id.buttonRecBack2);
        buttonRecBack3 =  findViewById(R.id.buttonRecBack3);
        //buttonRecBack4 =  findViewById(R.id.buttonRecBack4);
        //buttonRecBack5 =  findViewById(R.id.buttonRecBack5);
        //buttonRecBack6 =  findViewById(R.id.buttonRecBack6);
        //buttonRecBack7 =  findViewById(R.id.buttonRecBack7);
        //buttonRecBack8 =  findViewById(R.id.buttonRecBack8);
        //buttonRecBack9 =  findViewById(R.id.buttonRecBack9);
        //buttonRecBack10 =  findViewById(R.id.buttonRecBack10);
        //buttonRecBack11 =  findViewById(R.id.buttonRecBack11);
        //buttonRecBack12 =  findViewById(R.id.buttonRecBack12);
        //buttonRecBack13 =  findViewById(R.id.buttonRecBack13);
        //buttonRecBack14 =  findViewById(R.id.buttonRecBack14);
        //buttonRecBack15 =  findViewById(R.id.buttonRecBack15);
        //buttonRecBack16 =  findViewById(R.id.buttonRecBack16);

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

        Animation animationBack1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack2 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack3 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack4 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack5 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack6 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack7 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack8 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack9 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack10 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack11 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack12 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack13 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack14 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack15 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation animationBack16 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        buttonRec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonRec1.startAnimation(animation1);

                recOpen1.setVisibility(View.VISIBLE);
                rec1.setVisibility(View.GONE);

                buttonRec1.setClickable(false);
                buttonRecBack1.setClickable(true);

            }
        });
        buttonRecBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonRecBack1.startAnimation(animationBack1);

                recOpen1.setVisibility(View.GONE);
                rec1.setVisibility(View.VISIBLE);

                buttonRec1.setClickable(true);
                buttonRecBack1.setClickable(false);

            }
        });

        // 2
        buttonRec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonRec2.startAnimation(animation2);

                recOpen2.setVisibility(View.VISIBLE);
                rec2.setVisibility(View.GONE);

                buttonRec2.setClickable(false);
                buttonRecBack2.setClickable(true);

            }
        });
        buttonRecBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonRecBack2.startAnimation(animationBack2);

                recOpen2.setVisibility(View.GONE);
                rec2.setVisibility(View.VISIBLE);

                buttonRec2.setClickable(true);
                buttonRecBack2.setClickable(false);
            }
        });

        // 3
        buttonRec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonRec3.startAnimation(animation3);

                recOpen3.setVisibility(View.VISIBLE);
                rec3.setVisibility(View.GONE);

                buttonRec3.setClickable(false);
                buttonRecBack3.setClickable(true);

            }
        });
        buttonRecBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonRecBack3.startAnimation(animationBack3);

                recOpen3.setVisibility(View.GONE);
                rec3.setVisibility(View.VISIBLE);

                buttonRec3.setClickable(true);
                buttonRecBack3.setClickable(false);
            }
        });
    }
}