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
        switch (i) {
            case 1: ret = "one"; break;
            case 2: ret = "two"; break;
            case 3: ret = "three"; break;
            case 4: ret = "four"; break;
            case 5: ret = "five"; break;
            case 6: ret = "six"; break;
            case 7: ret = "seven"; break;
            case 8: ret = "eight"; break;
            case 9: ret = "nine"; break;
            case 10: ret = "ten"; break;
        }
        return ret;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Just Logging some lyrics to the Marching Ants song
        for (int i = 0; i <= 10; i++) {
            Log.d(TAG, "Ants go marching " + convert(i) + " by " + convert(i) + ". Hoorah! Hoorah!");
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
