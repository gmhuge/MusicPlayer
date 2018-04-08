package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {
    int mColorResourceId;
    Context mContext;

    public SongAdapter(Context context, ArrayList<Song> songs, int colorResourceId) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Song currentSong = getItem(position);

        Button playButton = (Button) listItemView.findViewById(R.id.play);
        playButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent playIntent = new Intent(mContext, PlayActivity.class);

                playIntent.putExtra("song_name", currentSong.getSongName());
                playIntent.putExtra("song_duration", String.valueOf(currentSong.getDuration()));

                mContext.startActivity(playIntent);
            }
        });
//        Song currentSong = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getSongName());
        TextView durationTextView = (TextView) listItemView.findViewById(R.id.duration_text_view);
        durationTextView.setText(String.valueOf(currentSong.getDuration()));
        View textContainer = listItemView.findViewById(R.id.song_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
