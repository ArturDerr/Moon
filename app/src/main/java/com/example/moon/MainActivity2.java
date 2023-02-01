package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    private String[] languages = {"Русский", "Английский"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button backButton = findViewById(R.id.backButton);
        final Button profileButton = findViewById(R.id.profileButton);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        final Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.bounce);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                backButton.startAnimation(animation);
            }
        });
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, profileActivity.class);
                startActivity(intent);
                profileButton.startAnimation(animation1);

            }
        });
        ArrayAdapter<String> languagesAdapter = new ArrayAdapter<String>(this,
                                             android.R.layout.simple_spinner_item, languages);
        languagesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(languagesAdapter);
        




    }
}