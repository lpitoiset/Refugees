package com.example.refugeesinfo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;


public class DBTestActivity extends ListActivity implements android.view.View.OnClickListener {

    Button btnAdd, btnGetAll;
    TextView country_Id;

    @Override
    public void onClick(View view){
        if (view==findViewById(R.id.btnAdd)){
            Intent intent = new Intent(this, CountryDetails.class);
            intent.putExtra("country_Id", 0);
            startActivity(intent);
        }
        else {
            CountryRepo repo = new CountryRepo(this);
            ArrayList<HashMap<String, String>> countryList = repo.getCountryList();
            if (countryList.size()!=0){
                ListView lv = getListView();
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        country_Id = (TextView) view.findViewById(R.id.country_Id);
                        String countryId = country_Id.getText().toString();
                        Intent objIntent = new Intent(getApplicationContext(),CountryDetails.class);
                        objIntent.putExtra("country_Id", Integer.parseInt(countryId));
                        startActivity(objIntent);

                    }
                });
                ListAdapter adapter = new SimpleAdapter(DBTestActivity.this, countryList, R.layout.viewcountryentry, new String[] { "id", "name"}, new int[] {R.id.country_Id, R.id.country_name});
                setListAdapter(adapter);
            }
            else{
                Toast.makeText(this,"NO country",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbtest);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnGetAll = (Button) findViewById(R.id.btnGetAll);
        btnGetAll.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dbtest, menu);
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
