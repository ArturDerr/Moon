package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.VideoView;

public class SplashScreen extends AppCompatActivity {

    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        videoView = findViewById(R.id.videoView);

        Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash_screen_video);
        videoView.setVideoURI(localUri);
        videoView.start();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}