package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profileActivity extends AppCompatActivity {

    String name, nickName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextNickName = findViewById(R.id.editTextNickName);
        EditText editTextPassword = findViewById(R.id.editTextPassword);

        Button buttonSave = findViewById(R.id.buttonSave);
        Button backButton = findViewById(R.id.backButton);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileActivity.this, MainActivity2.class);
                intent.putExtra("name", name);
                startActivity(intent);
                buttonSave.startAnimation(animation);
                Toast.makeText(profileActivity.this, "Сохранено", Toast.LENGTH_SHORT).show();

            }
        });
        editTextName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editTextName.getText().toString();
            }
        });
    }
}