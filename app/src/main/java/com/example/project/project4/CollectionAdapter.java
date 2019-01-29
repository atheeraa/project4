package com.example.project.project4;
    import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CollectionAdapter extends ArrayAdapter<Collection> {

    public CollectionAdapter(Context context, ArrayList<Collection> collections) {
        super(context, 0, collections);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        Collection collection=getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items, parent, false);
        }

        TextView soundtrackName=(TextView) listItemView.findViewById(R.id.soundtrackName);
        soundtrackName.setText(collection.getSoundTrackName());
        ImageView poster=(ImageView) listItemView.findViewById(R.id.poster);
        poster.setImageResource(collection.getPoster());
        return listItemView;
    }
}