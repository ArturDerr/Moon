package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final LinearLayout layoutAvatar = findViewById(R.id.layoutAvatar);
        final Button buttonSave = findViewById(R.id.buttonSave);
        final Button backButton1 = findViewById(R.id.backButton1);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        final Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.bounce);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerProfile, avatarFragment.class, null)
                .commit();

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
        layoutAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerProfile, avatarFragment.class, null)
                        .commit();
            }
        });
    }
}