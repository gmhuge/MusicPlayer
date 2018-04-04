package com.example.android.musicplayer;

import java.util.ArrayList;

/**
 * Created by User on 04.04.2018.
 */

public class Album {
    private String albumName;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album (String newAlbumName, ArrayList<Song> newSongs){
        albumName = newAlbumName;
        songs = newSongs;
    }

    public String getAlbumName () {
        return albumName;
    }

    public ArrayList<Song> getSongs (){
        return songs;
    }
}
