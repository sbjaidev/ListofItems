package com.example.android.listofitems;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;

import java.util.ArrayList;

/**
 *
 */

class EventCardAdapter extends RecyclerView.Adapter<EventCardAdapter.EventCardViewHolder> {
    private ArrayList<ListMember> mEventList;

    // Provide a reference to the views for each data item. Complex data items
    // may need more than one view per item, and you provide access to all the
    // views for a data item in a view holder.
    static class EventCardViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        CardView mCardView;
        ImageView mImageView;
        TextView mDescriptionView;
        TextView mTitleView;

        /**
         *
         * @param v
         */
        EventCardViewHolder(View v) {
            super(v);
            mCardView = (CardView) v.findViewById(R.id.event_card_view);
            mTitleView = (TextView) v.findViewById(R.id.event_card_title);
            mDescriptionView = (TextView) v.findViewById(R.id.event_card_description);
            mImageView = (ImageView)v.findViewById(R.id.event_card_image);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    EventCardAdapter(ArrayList<ListMember> pEventList) {
        Log.v("EventCardAdapter", "Entered EventCardAdapter Constructor");
        mEventList = pEventList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public EventCardAdapter.EventCardViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_card, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new EventCardViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(EventCardViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
//        holder.mTextView.setText(mDataset[position]);
        ListMember listMember = mEventList.get(position);
        holder.mDescriptionView.setText(listMember.getDescription());
        holder.mTitleView.setText(listMember.getTitle());
        holder.mImageView.setImageResource(listMember.getImageResourceId());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mEventList.size();
    }
}
