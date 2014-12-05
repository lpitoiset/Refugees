package com.example.refugeesinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.example.refugeesinfo.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when the user clicks the Send button
     */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    /**
     * Called when the user clicks the Select Operation button
     */
    public void gotoSelectOperation(View view) {
        Intent intent = new Intent(this, SelectOperationActivity.class);
        startActivity(intent);
    }

    /**
     * Called when the user clicks the Population Statistics button
     */
    public void gotoPopStats(View view) {
        Intent intent = new Intent(this, PopStatsActivity.class);
        startActivity(intent);
    }


    /**
     * Called when the user clicks the DB Test button
     */
    public void gotoDBTest(View view) {
        Intent intent = new Intent(this, DBTestActivity.class);
        startActivity(intent);
    }


    /**
     * Called when the user clicks the DB Test button
     */
    public void gotoMaps(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



    /**
     * Called when the user clicks the DB Test button
     */
    public void gotoSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }


}
