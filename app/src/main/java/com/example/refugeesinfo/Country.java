package com.example.refugeesinfo;
public class Country {
    // Labels table name
    public static final String TABLE = "Countries";

    // Labels Table Columns names
    public static final String KEY_ID = "id";
    public static final String KEY_name = "name";
    public static final String KEY_code = "code";
    public static final String KEY_pop_ref = "refugees";
    public static final String KEY_pop_asylum = "asylum";
    public static final String KEY_pop_returned = "returned";
    public static final String KEY_pop_idp = "idp";
    public static final String KEY_pop_returned_idp = "returned_idp";
    public static final String KEY_pop_stateless = "stateless";
    public static final String KEY_pop_ooc = "others";

    // property help us to keep data
    public int country_ID;
    public String name;
    public String code;
    public int pop_ref;
    public int pop_asylum;
    public int pop_returned;
    public int pop_idp;
    public int pop_returned_idp;
    public int pop_stateless;
    public int pop_ooc;
}