/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


/*
        setContentView(R.layout.list_item);


        Button backButton = findViewById(R.id.play);
          backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent backIntent = new Intent(AlbumActivity.this, PlayActivity.class);
                        startActivity(backIntent);
                    }
                });

*/
        setContentView(R.layout.song_list);

        ArrayList<Song>songs1 = new ArrayList<>();

        songs1.add(new Song("Song1_1", 5.2));
        songs1.add(new Song("Song1_2", 3.4));
        songs1.add(new Song("Song1_3", 7.1));
        songs1.add(new Song("Song1_4", 7.1));
        songs1.add(new Song("Song1_5", 7.1));
        songs1.add(new Song("Song1_6", 7.1));
        songs1.add(new Song("Song1_7", 7.1));
        songs1.add(new Song("Song1_8", 7.1));
        songs1.add(new Song("Song1_9", 7.1));
        songs1.add(new Song("Song1_10", 7.1));
        songs1.add(new Song("Song1_11", 7.1));
        songs1.add(new Song("Song1_12", 7.1));
        songs1.add(new Song("Song1_13", 7.1));
        songs1.add(new Song("Song1_14", 7.1));
        songs1.add(new Song("Song1_15", 7.1));
        songs1.add(new Song("Song1_16", 7.1));
        songs1.add(new Song("Song1_17", 7.1));
        songs1.add(new Song("Song1_18", 7.1));
        songs1.add(new Song("Song1_19", 7.1));
        songs1.add(new Song("Song1_20", 7.1));


        SongAdapter adapter = new SongAdapter(this, songs1, R.color.category_phrases);



        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }



}
