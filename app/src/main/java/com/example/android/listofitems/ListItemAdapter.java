package com.example.android.listofitems;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * {@link ListItemAdapter} is an {@link ArrayAdapter} that can...
 */

class ListItemAdapter extends ArrayAdapter<ListMember> {

    /**
     * Create a new {@link ListItemAdapter} object.
     *
     * @param context
     * @param listItemsArrayList
     */
    ListItemAdapter(
            Context context,
            ArrayList<ListMember> listItemsArrayList
    ) {
        super(context, 0, listItemsArrayList);
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,
                    parent,
                    false);
        }

        ListMember currentItem = getItem(position);

        TextView title = (TextView) listItemView.findViewById(
                R.id.list_item_title
        );

        title.setText(currentItem.getTitle());

        TextView description = (TextView) listItemView.findViewById(
                R.id.list_item_description
        );

        if (currentItem.hasDescription()) {
            description.setVisibility(View.VISIBLE);
            description.setText(currentItem.getDescription());
        } else { description.setVisibility(View.GONE); }

        ImageView imageView = (ImageView) listItemView.findViewById(
                R.id.list_item_image
        );

        if (currentItem.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentItem.getImageResourceId());
        } else { imageView.setVisibility(View.GONE); }

        return listItemView;
    }
}
