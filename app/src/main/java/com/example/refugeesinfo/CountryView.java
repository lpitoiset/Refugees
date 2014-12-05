package com.example.refugeesinfo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import java.text.DecimalFormat;


import java.util.ArrayList;

public class CountryView extends ActionBarActivity implements android.view.View.OnClickListener{

    Button btnClose;
    TextView editTextName;
    TextView editTextCode;
    TextView editTextPopRef;
    TextView editTextPopAsylum;
    TextView editTextPopReturned;
    TextView editTextPopIDP;
    TextView editTextPopReturnedIDP;
    TextView editTextPopStateless;
    TextView editTextPopOOC;
    TextView editTextPopTotal;
    private int _Country_Id=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_view);

        btnClose = (Button) findViewById(R.id.btnClose);

        editTextName = (TextView) findViewById(R.id.valueName);
        editTextCode = (TextView) findViewById(R.id.editTextCode);
        editTextPopRef = (TextView) findViewById(R.id.editTextPopRef);
        editTextPopAsylum = (TextView) findViewById(R.id.editTextPopAsylum);
        editTextPopReturned = (TextView) findViewById(R.id.editTextPopReturned);
        editTextPopIDP = (TextView) findViewById(R.id.editTextPopIDP);
        editTextPopReturnedIDP = (TextView) findViewById(R.id.editTextPopReturnedIDP);
        editTextPopStateless = (TextView) findViewById(R.id.editTextPopStateless);
        editTextPopOOC = (TextView) findViewById(R.id.editTextPopOOC);
        editTextPopTotal = (TextView) findViewById(R.id.valuePopTotal);

        btnClose.setOnClickListener(this);


        _Country_Id =0;
        Intent intent = getIntent();
        _Country_Id =intent.getIntExtra("country_Id", 0);
        CountryRepo repo = new CountryRepo(this);
        Country country = new Country();
        country = repo.getCountryById(_Country_Id);

        DecimalFormat formatter = new DecimalFormat("#,###,###");
//        String yourFormattedString = formatter.format(100000);

        editTextCode.setText(String.valueOf(country.code));
        editTextName.setText(String.valueOf(country.name));
//        editTextName.setText(country.name);
        editTextPopRef.setText(String.valueOf(country.pop_ref));
        editTextPopAsylum.setText(String.valueOf(country.pop_asylum));
        editTextPopReturned.setText(String.valueOf(country.pop_returned));
        editTextPopIDP.setText(String.valueOf(country.pop_idp));
        editTextPopReturnedIDP.setText(String.valueOf(country.pop_returned_idp));
        editTextPopStateless.setText(String.valueOf(country.pop_stateless));
        editTextPopOOC.setText(String.valueOf(country.pop_ooc));
        editTextPopTotal.setText(String.valueOf(country.pop_total));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_country_details, menu);
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

    public void onClick(View view) {
        if (view == findViewById(R.id.btnSave)){
            CountryRepo repo = new CountryRepo(this);
            Country country = new Country();
//            country.age= Integer.parseInt(editTextAge.getText().toString());
            country.code=editTextCode.getText().toString();
            country.name=editTextName.getText().toString();
            country.pop_ref=editTextPopRef.getText().toString();
            country.pop_asylum=editTextPopAsylum.getText().toString();
            country.pop_returned=editTextPopReturned.getText().toString();
            country.pop_idp=editTextPopIDP.getText().toString();
            country.pop_returned_idp=editTextPopReturned.getText().toString();
            country.pop_stateless=editTextPopStateless.getText().toString();
            country.pop_ooc=editTextPopOOC.getText().toString();
            country.pop_total=editTextPopTotal.getText().toString();
//            country.pop_ooc=Integer.parseInt(editTextPopOOC.getText().toString());
            country.country_ID=_Country_Id;

            if (_Country_Id==0){
                _Country_Id = repo.insert(country);

                Toast.makeText(this,"New Country Insert",Toast.LENGTH_SHORT).show();
            }else{

                repo.update(country);
                Toast.makeText(this,"Country Record updated",Toast.LENGTH_SHORT).show();
            }
        }else if (view== findViewById(R.id.btnDelete)){
            CountryRepo repo = new CountryRepo(this);
            repo.delete(_Country_Id);
            Toast.makeText(this, "Country Record Deleted", Toast.LENGTH_SHORT);
            finish();
        }else if (view== findViewById(R.id.btnClose)){
            finish();
        }


    }

}