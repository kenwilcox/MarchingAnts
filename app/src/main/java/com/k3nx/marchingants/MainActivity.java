package com.k3nx.marchingants;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        // Just Logging some lyrics to the Marching Ants song
        // Based on the lyrics provided here:
        // http://www.metrolyrics.com/the-ants-go-marching-lyrics-children.html
        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];

            //String base = String.format("Ants go marching %1$s by %1$s", number);
            String base = getResources().getString(R.string.song_format, number);
            String song = base + getResources().getString(R.string.hoorah);
            String pause = base + ",";

            Log.d(TAG, song);
            Log.d(TAG, song);
            Log.d(TAG, pause);

            if (i == 0) Log.d(TAG, "The little one stops to suck her thumb,");
            if (i == 1) Log.d(TAG, "The little one stops to tie his shoe,");
            if (i == 2) Log.d(TAG, "The little one stops to climb a tree,");
            if (i == 3) Log.d(TAG, "The little one stops to shut the door,");
            if (i == 4) Log.d(TAG, "The little one stops to take a dive,");
            if (i == 5) Log.d(TAG, "The little one stops to pick up sticks,");
            if (i == 6) Log.d(TAG, "The little one stops to pray to heaven,");
            if (i == 7) Log.d(TAG, "The little one stops to shut the gate,");
            if (i == 8) Log.d(TAG, "The little one stops to check the time,");
            if (i == 9) Log.d(TAG, "The little one stops to say \"The End\",");

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
