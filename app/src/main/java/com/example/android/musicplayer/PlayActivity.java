package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);


        TextView songName = (TextView) findViewById(R.id.song_name);
        TextView songDuration = (TextView) findViewById(R.id.song_duration);

        Intent intent = getIntent();
        String songNameText = intent.getStringExtra("song_name");
        String songDurationText = intent.getStringExtra("song_duration");

        songName.setText(songNameText);
        songDuration.setText(songDurationText);

    }
}
