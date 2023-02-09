package com.example.moon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public String[] languages = {"Русский", "Английский"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button alarmButtonSettings = findViewById(R.id.alarmButtonSettings);

        Button backButton = findViewById(R.id.backButton);
        Button buttonAvatar = findViewById(R.id.buttonAvatar);
        Button profileButton = findViewById(R.id.profileButton);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.bounce);

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
        buttonAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAvatar.setText("уыатгылур");
               // getSupportFragmentManager().beginTransaction()
                     //   .replace(R.id.fragmentContainerSettings, avatarFragment.class, null)
                       // .commit();
            }
        });
        alarmButtonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerSettings, SettingsAlarmFragment.class, null)
                        .commit();
            }
        });
        ArrayAdapter<String> languagesAdapter = new ArrayAdapter<String>(this,
                                             android.R.layout.simple_spinner_item, languages);
        languagesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(languagesAdapter);
        




    }
}