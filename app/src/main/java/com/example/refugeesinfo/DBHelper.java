package com.example.refugeesinfo;

/**
 * Created by laurent on 04/12/14.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper  extends SQLiteOpenHelper {
    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION = 4;

    // Database Name
    private static final String DATABASE_NAME = "refugees.db";

    public DBHelper(Context context ) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here

        String CREATE_TABLE_COUNTRY = "CREATE TABLE " + Country.TABLE  + "("
                + Country.KEY_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + Country.KEY_name + " TEXT, "
                + Country.KEY_code + " TEXT, "
                + Country.KEY_pop_ref + " INTEGER, "
                + Country.KEY_pop_asylum + " INTEGER, "
                + Country.KEY_pop_returned + " INTEGER, "
                + Country.KEY_pop_idp + " INTEGER, "
                + Country.KEY_pop_returned_idp + " INTEGER, "
                + Country.KEY_pop_stateless + " INTEGER, "
                + Country.KEY_pop_ooc + " INTEGER )";

        db.execSQL(CREATE_TABLE_COUNTRY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + Country.TABLE);

        // Create tables again
        onCreate(db);

    }

}