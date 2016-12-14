package com.example.android.listofitems;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lister);

        // Create a list of items to display
        ArrayList<ListMember> eventList = new ArrayList<>();
        eventList.add(new ListMember("title"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title"));
        eventList.add(new ListMember("title", "description"));
        eventList.add(new ListMember(R.mipmap.ic_launcher, "title", "description"));


        ListItemAdapter adapter = new ListItemAdapter (this, eventList);
        ListView listView = (ListView) findViewById(R.id.lister);
        listView.setAdapter(adapter);
    }
}
