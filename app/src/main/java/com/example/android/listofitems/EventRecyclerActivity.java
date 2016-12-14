package com.example.android.listofitems;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class EventRecyclerActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        // Create a list of items to display
        ArrayList<ListMember> eventList = new ArrayList<>();
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title1", "description1"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title2", "description2"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title3", "description3"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title4", "description4"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title5", "description5"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title6", "description6"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title7", "description7"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title8", "description8"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title9", "description9"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title0", "description0"));

        mRecyclerView = (RecyclerView) findViewById(R.id.test_recycler_view);

        // use this setting to improve performance if you know that changes in
        // content do not change the layout size of the RecyclerView.
        mRecyclerView.setHasFixedSize(true);

        // user a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        mAdapter = new EventCardAdapter(eventList);
        mRecyclerView.setAdapter(mAdapter);
    }


}
