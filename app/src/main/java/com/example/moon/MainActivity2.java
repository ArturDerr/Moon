package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    public String[] languages = {"Русский", "Английский"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SpannableStringBuilder builder = new SpannableStringBuilder();
        SpannableString blackSpannable = null;
        blackSpannable = new SpannableString(null);
        blackSpannable.setSpan(new ForegroundColorSpan(Color.BLACK), 0, blackSpannable.length(), 0);
        builder.append(blackSpannable);

        final Button backButton = findViewById(R.id.backButton);
        final Button profileButton = findViewById(R.id.profileButton);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        final Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.bounce);

        Spinner spinner = findViewById(R.id.spinner);

        backButton.setOnClickListener(v -> {
            finish();
            backButton.startAnimation(animation);
        });
        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, profileActivity.class);
            startActivity(intent);
            profileButton.startAnimation(animation1);

        });
        ArrayAdapter<String> languagesAdapter = new ArrayAdapter<String>(this,
                                             android.R.layout.simple_spinner_item, languages);
        languagesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(languagesAdapter);
        




    }
}