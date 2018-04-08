package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public int testtest = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //setContentView(R.layout.list_item);
     //   View v = inflater.inflate(R.layout.list_item, null);



  //      setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.start);


//        startButton.setText("@@@@@@@@@@@@");
        startButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        start();
                    }
                });
        //  start();
    }

    public void start (){
        Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
        startActivity(albumIntent);


    }

    public void test() {

        ArrayList<Song>songs1 = new ArrayList<>();
        songs1.add(new Song("Song1_1", 5.2));
        songs1.add(new Song("Song1_2", 3.4));
        songs1.add(new Song("Song1_3", 7.1));

        ArrayList<Song>songs2 = new ArrayList<>();
        songs2.add(new Song("Song2_1", 1.2));
        songs2.add(new Song("Song2_2", 2.4));
        songs2.add(new Song("Song2_3", 3.1));

        ArrayList<Album>albums1 = new ArrayList<>();
        albums1.add(new Album("Album1",songs1));
        albums1.add(new Album("Album2",songs2));

        ArrayList<Performer>performers = new ArrayList<>();
        performers.add(new Performer("Performer1", albums1));



    }


}
