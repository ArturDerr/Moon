package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class SleepActivity extends AppCompatActivity {

    SimpleDateFormat simpleDateFormat;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        if (savedInstanceState != null) {
            Intent intent = new Intent(this, SleepActivity.class);
            startActivity(intent);
        }

        simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());

        textView = findViewById(R.id.textView);

        textView.setText(simpleDateFormat.toString());
    }
}