package com.example.moon;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button alarmButtonSettings = findViewById(R.id.alarmButtonSettings);
        Button languagesButton = findViewById(R.id.languagesButton);
        Button backgroundButtonSettings = findViewById(R.id.backgroundButtonSettings);
        Button notificationsButtonSettings = findViewById(R.id.notificationsButtonSettings);
        TextView tvName = findViewById(R.id.tvName);

        Button backButton = findViewById(R.id.backButton);
        Button buttonAvatar = findViewById(R.id.buttonAvatar);
        Button profileButton = findViewById(R.id.profileButton);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        tvName.setText(name);


        backButton.setOnClickListener(v -> {
            finish();
        });
        profileButton.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainActivity2.this, profileActivity.class);
            startActivity(intent1);

        });
        buttonAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, AvatarActivity.class);
                startActivity(intent);
            }
        });
        alarmButtonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, AlarmSettingsActivity.class);
                startActivity(intent);
            }
        });
        backgroundButtonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, BackgroundActivity.class);
                startActivity(intent);
            }
        });
        notificationsButtonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ActivityNotifications.class);
                startActivity(intent);
            }
        });
        languagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] singleChoiceItems = getResources().getStringArray(R.array.dialog_single_choice_array);
                int itemSelected = 0; // Важно! Дает цифру выбора, если Русский то 0, английский 1
                new AlertDialog.Builder(MainActivity2.this);
                AlertDialog dialog = new AlertDialog.Builder(MainActivity2.this, R.style.CustomDialogTheme)
                        .setTitle("Выберите язык")
                        .setSingleChoiceItems(singleChoiceItems, itemSelected, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int selectedIndex) {
                            }
                        })
                        .setPositiveButton("Ок", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .show();
            }
        });
        




    }
}