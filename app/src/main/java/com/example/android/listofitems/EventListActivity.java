package com.example.android.listofitems;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventListActivity extends Activity {

    /**
     *
     * @param savedInstanceState - saved state of the instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lister);

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


        ListItemAdapter adapter = new ListItemAdapter (this, eventList);
        ListView listView = (ListView) findViewById(R.id.lister);
        listView.setAdapter(adapter);
    }
}
