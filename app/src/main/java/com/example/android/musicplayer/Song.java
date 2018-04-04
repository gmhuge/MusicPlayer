package com.example.android.musicplayer;

/**
 * Created by User on 04.04.2018.
 */

public class Song {

    private String songName;
    private double duration;

    public Song (String newSongName, double newDuration) {
        songName = newSongName;
        duration = newDuration;
    }

    public String getSongName () {
        return songName;
    }

    public double getDuration () {
        return duration;
    }
}
