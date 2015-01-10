package com.k3nx.marchingants;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private final static String TAG = "MainActivity";

    private String convert(int i) {
        String ret = "";
        if (i == 1)ret = "one";
        if (i == 2)ret = "two";
        if (i == 3)ret = "three";
        if (i == 4)ret = "four";
        if (i == 5)ret = "five";
        if (i == 6)ret = "six";
        if (i == 7)ret = "seven";
        if (i == 8)ret = "eight";
        if (i == 9)ret = "nine";
        if (i == 10) ret = "ten";
        return ret;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Just Logging some lyrics to the Marching Ants song
        // Based on the lyrics provided here:
        // http://www.metrolyrics.com/the-ants-go-marching-lyrics-children.html
        for (int i = 1; i <= 10; i++) {
            Log.d(TAG, "Ants go marching " + convert(i) + " by " + convert(i) + ". Hoorah! Hoorah!");
            Log.d(TAG, "Ants go marching " + convert(i) + " by " + convert(i) + ". Hoorah! Hoorah!");
            Log.d(TAG, "Ants go marching " + convert(i) + " by " + convert(i) + ",");

            if (i == 1) Log.d(TAG, "The little one stops to suck her thumb,");
            if (i == 2) Log.d(TAG, "The little one stops to tie his shoe,");
            if (i == 3) Log.d(TAG, "The little one stops to climb a tree,");
            if (i == 4) Log.d(TAG, "The little one stops to shut the door,");
            if (i == 5) Log.d(TAG, "The little one stops to take a dive,");
            if (i == 6) Log.d(TAG, "The little one stops to pick up sticks,");
            if (i == 7) Log.d(TAG, "The little one stops to pray to heaven,");
            if (i == 8) Log.d(TAG, "The little one stops to shut the gate,");
            if (i == 9) Log.d(TAG, "The little one stops to check the time,");
            if (i == 10) Log.d(TAG, "The little one stops to say \"The End\",");

            Log.d(TAG, "And they all go marching down, to the ground to get out of the rain.");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
