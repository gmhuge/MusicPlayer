package com.example.android.musicplayer;

import java.util.ArrayList;

/**
 * Created by User on 04.04.2018.
 */

public class Performer {
    private String performerName;
    private ArrayList<Album> albums = new ArrayList<Album>();

    public Performer (String newPerformerName,  ArrayList<Album> newAlbums) {
        performerName = newPerformerName;
        albums = newAlbums;
    }
    public String getAlbumName () {
        return performerName;
    }

    public ArrayList<Album> getAlbums (){
        return albums;
    }

}
