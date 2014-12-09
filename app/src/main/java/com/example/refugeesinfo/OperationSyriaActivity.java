package com.example.refugeesinfo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.Object;
import org.json.JSONObject;
import org.json.JSONArray;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.client.methods.HttpPost;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONException;




public class OperationSyriaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation_syria);
        DefaultHttpClient   httpclient = new DefaultHttpClient(new BasicHttpParams());
        HttpPost httppost = new HttpPost("http://data.unhcr.org/api/instances/show.json?id=syria");
// Depends on your web service
        httppost.setHeader("Content-type", "application/json");

        InputStream inputStream = null;
        String result = null;
        try {
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();

            inputStream = entity.getContent();
            // json is UTF-8 by default
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
            StringBuilder sb = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null)
            {
                sb.append(line + "\n");
            }
            result = sb.toString();
        } catch (Exception e) {
            // Oops
        }
        finally {
            try{if(inputStream != null)inputStream.close();}catch(Exception squish){}
        }

        JSONObject jObject = new JSONObject(result);
        JSONArray jArray = jObject.getJSONArray("ARRAYNAME");
        for (int i=0; i < jArray.length(); i++)
        {
            try {
                JSONObject oneObject = jArray.getJSONObject(i);
                // Pulling items from the array
                String oneObjectsItem = oneObject.getString("STRINGNAMEinTHEarray");
                String oneObjectsItem2 = oneObject.getString("anotherSTRINGNAMEINtheARRAY");
            } catch (JSONException e) {
                // Oops
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_operation_syria, menu);
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
