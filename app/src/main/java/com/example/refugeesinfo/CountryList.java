package com.example.refugeesinfo;
// doesnt work
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CountryList extends Activity {

    protected String[] countries = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Argentina"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pop_stats);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        ListView countryList = (ListView) findViewById(R.id.CountryList);
        countryList.setAdapter(adapter);
    }
}