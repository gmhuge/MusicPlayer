package com.example.android.musicplayer;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 04.04.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    int mColorResourceId;

    public SongAdapter(Context context, ArrayList<Song> songs, int colorResourceId) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView durationTextView = (TextView) listItemView.findViewById(R.id.duration_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        durationTextView.setText(String.valueOf(currentSong.getDuration()));

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.song_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
