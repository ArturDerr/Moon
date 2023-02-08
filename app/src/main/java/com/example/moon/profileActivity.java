package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button buttonSave = findViewById(R.id.buttonSave);
        Button backButton1 = findViewById(R.id.backButton1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.bounce);

        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                backButton1.startAnimation(animation);
            }
        });
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                buttonSave.startAnimation(animation1);
                Toast.makeText(profileActivity.this, "Сохранено", Toast.LENGTH_SHORT).show();
            }
        });
    }
}