package com.example.refugeesinfo;

/**
 * Created by laurent on 04/12/14.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

public class CountryRepo {
    private DBHelper dbHelper;

    public CountryRepo(Context context) {
        dbHelper = new DBHelper(context);
    }

    public int insert(Country country) {

        //Open connection to write data
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Country.KEY_name, country.name);
        values.put(Country.KEY_code, country.code);
        values.put(Country.KEY_pop_ref, country.pop_ref);
        values.put(Country.KEY_pop_asylum, country.pop_asylum);
        values.put(Country.KEY_pop_returned, country.pop_returned);
        values.put(Country.KEY_pop_idp, country.pop_idp);
        values.put(Country.KEY_pop_returned_idp, country.pop_returned_idp);
        values.put(Country.KEY_pop_stateless, country.pop_stateless);
        values.put(Country.KEY_pop_ooc, country.pop_ooc);

        // Inserting Row
        long Country_Id = db.insert(Country.TABLE, null, values);
        db.close(); // Closing database connection
        return (int) Country_Id;
    }

    public void delete(int country_Id) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        // It's a good practice to use parameter ?, instead of concatenate string
        db.delete(Country.TABLE, Country.KEY_ID + "= ?", new String[] { String.valueOf(country_Id) });
        db.close(); // Closing database connection
    }

    public void update(Country country) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();


        values.put(Country.KEY_name, country.name);
        values.put(Country.KEY_code, country.code);
        values.put(Country.KEY_pop_ref, country.pop_ref);
        values.put(Country.KEY_pop_asylum, country.pop_asylum);
        values.put(Country.KEY_pop_returned, country.pop_returned);
        values.put(Country.KEY_pop_idp, country.pop_idp);
        values.put(Country.KEY_pop_returned_idp, country.pop_returned_idp);
        values.put(Country.KEY_pop_stateless, country.pop_stateless);
        values.put(Country.KEY_pop_ooc, country.pop_ooc);

        // It's a good practice to use parameter ?, instead of concatenate string
        db.update(Country.TABLE, values, Country.KEY_ID + "= ?", new String[] { String.valueOf(country.country_ID) });
        db.close(); // Closing database connection
    }

    public ArrayList<HashMap<String, String>>  getCountryList() {
        //Open connection to read only
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  " +
                Country.KEY_ID + "," +
                Country.KEY_name + "," +
                Country.KEY_code + "," +
                Country.KEY_pop_ref + "," +
                Country.KEY_pop_asylum + "," +
                Country.KEY_pop_returned + "," +
                Country.KEY_pop_idp + "," +
                Country.KEY_pop_returned_idp + "," +
                Country.KEY_pop_stateless + "," +
                Country.KEY_pop_ooc +
                " FROM " + Country.TABLE;

        //Country country = new Country();
        ArrayList<HashMap<String, String>> countryList = new ArrayList<HashMap<String, String>>();

        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list

        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> country = new HashMap<String, String>();
                country.put("id", cursor.getString(cursor.getColumnIndex(Country.KEY_ID)));
                country.put("name", cursor.getString(cursor.getColumnIndex(Country.KEY_name)));
                country.put("code", cursor.getString(cursor.getColumnIndex(Country.KEY_code)));
                country.put("pop_ref", cursor.getString(cursor.getColumnIndex(Country.KEY_pop_ref)));
                country.put("pop_asylum", cursor.getString(cursor.getColumnIndex(Country.KEY_pop_asylum)));
                country.put("pop_returned", cursor.getString(cursor.getColumnIndex(Country.KEY_pop_returned)));
                country.put("pop_idp", cursor.getString(cursor.getColumnIndex(Country.KEY_pop_idp)));
                country.put("pop_returned_idp", cursor.getString(cursor.getColumnIndex(Country.KEY_pop_returned_idp)));
                country.put("pop_stateless", cursor.getString(cursor.getColumnIndex(Country.KEY_pop_stateless)));
                country.put("pop_ooc", cursor.getString(cursor.getColumnIndex(Country.KEY_pop_ooc)));
                countryList.add(country);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return countryList;

    }

    public Country getCountryById(int Id){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  " +
                Country.KEY_ID + "," +
                Country.KEY_name + "," +
                Country.KEY_code + "," +
                Country.KEY_pop_ref + "," +
                Country.KEY_pop_asylum + "," +
                Country.KEY_pop_returned + "," +
                Country.KEY_pop_idp + "," +
                Country.KEY_pop_returned_idp + "," +
                Country.KEY_pop_stateless + "," +
                Country.KEY_pop_ooc +
                " FROM " + Country.TABLE
                + " WHERE " +
                Country.KEY_ID + "=?";// It's a good practice to use parameter ?, instead of concatenate string

        int iCount =0;
        Country country = new Country();

        Cursor cursor = db.rawQuery(selectQuery, new String[] { String.valueOf(Id) } );

        if (cursor.moveToFirst()) {
            do {
                country.country_ID =cursor.getInt(cursor.getColumnIndex(Country.KEY_ID));
                country.name =cursor.getString(cursor.getColumnIndex(Country.KEY_name));
                country.code =cursor.getString(cursor.getColumnIndex(Country.KEY_code));
                country.pop_ref =cursor.getInt(cursor.getColumnIndex(Country.KEY_pop_ref));
                country.pop_asylum =cursor.getInt(cursor.getColumnIndex(Country.KEY_pop_asylum));
                country.pop_returned =cursor.getInt(cursor.getColumnIndex(Country.KEY_pop_returned));
                country.pop_idp =cursor.getInt(cursor.getColumnIndex(Country.KEY_pop_idp));
                country.pop_returned_idp =cursor.getInt(cursor.getColumnIndex(Country.KEY_pop_returned_idp));
                country.pop_stateless =cursor.getInt(cursor.getColumnIndex(Country.KEY_pop_stateless));
                country.pop_ooc =cursor.getInt(cursor.getColumnIndex(Country.KEY_pop_ooc));

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return country;
    }

}