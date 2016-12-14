package com.example.android.listofitems;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

/**
 *
 */
public class MainActivity extends Activity {

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an event listener so that when the user clicks on Events, they
        // are taken to the lister screen
        TextView eventList = (TextView) findViewById(R.id.list);
        eventList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eventListIntent = new Intent(
                        MainActivity.this,
                        EventListActivity.class
                );
                startActivity(eventListIntent);
            }
        });

        // Create an event listener so that when the user clicks on Card Recycler, they
        // are taken to the Card Recycler screen
        TextView cardRecycler = (TextView) findViewById(R.id.card_recycler);
        cardRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eventListIntent = new Intent(
                        MainActivity.this,
                        EventRecyclerActivity.class
                );
                startActivity(eventListIntent);
            }
        });
    }
}
