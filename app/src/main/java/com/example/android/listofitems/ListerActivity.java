package com.example.android.listofitems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lister);

        // Create a list of items to display
        ArrayList<ListMember> list = new ArrayList<>();
        list.add(new ListMember("title"));
        list.add(new ListMember(R.mipmap.ic_launcher, "title"));
        list.add(new ListMember("title", "description"));
        list.add(new ListMember(R.mipmap.ic_launcher, "title", "description"));


        ListItemAdapter adapter = new ListItemAdapter (this, list);
        ListView listView = (ListView) findViewById(R.id.lister);
        listView.setAdapter(adapter);
    }
}
