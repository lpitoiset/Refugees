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
import android.widget.Toast;

import java.util.ArrayList;

public class CountryDetails extends ActionBarActivity implements android.view.View.OnClickListener{

    Button btnSave ,  btnDelete;
    Button btnClose;
    EditText editTextName;
    EditText editTextCode;
    EditText editTextPopRef;
    EditText editTextPopAsylum;
    EditText editTextPopReturned;
    EditText editTextPopIDP;
    EditText editTextPopReturnedIDP;
    EditText editTextPopStateless;
    EditText editTextPopOOC;
    private int _Country_Id=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);

        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnClose = (Button) findViewById(R.id.btnClose);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextCode = (EditText) findViewById(R.id.editTextCode);
        editTextPopRef = (EditText) findViewById(R.id.editTextPopRef);
        editTextPopAsylum = (EditText) findViewById(R.id.editTextPopAsylum);
        editTextPopReturned = (EditText) findViewById(R.id.editTextPopReturned);
        editTextPopIDP = (EditText) findViewById(R.id.editTextPopIDP);
        editTextPopReturnedIDP = (EditText) findViewById(R.id.editTextPopReturnedIDP);
        editTextPopStateless = (EditText) findViewById(R.id.editTextPopStateless);
        editTextPopOOC = (EditText) findViewById(R.id.editTextPopOOC);

        btnSave.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnClose.setOnClickListener(this);


        _Country_Id =0;
        Intent intent = getIntent();
        _Country_Id =intent.getIntExtra("country_Id", 0);
        CountryRepo repo = new CountryRepo(this);
        Country country = new Country();
        country = repo.getCountryById(_Country_Id);

        editTextCode.setText(String.valueOf(country.code));
        editTextName.setText(country.name);
        editTextPopRef.setText(country.pop_ref);
        editTextPopAsylum.setText(country.pop_asylum);
        editTextPopReturned.setText(country.pop_returned);
        editTextPopIDP.setText(country.pop_idp);
        editTextPopReturnedIDP.setText(country.pop_returned_idp);
        editTextPopStateless.setText(country.pop_stateless);
        editTextPopOOC.setText(country.pop_ooc);
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