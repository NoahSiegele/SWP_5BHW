package com.example.formula1;

import android.graphics.LinearGradient;
import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

public class ScrollingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = null;

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Kongosauger", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        try {
            ArrayList<String> data = new DataTask().execute().get();
            ListView rv = (ListView)findViewById(R.id.list);
            adapter = new ArrayAdapter<String>(this, R.layout.list_entry, R.id.entry_text, data);
            rv.setAdapter(adapter);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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



class DataTask extends AsyncTask<String, String, ArrayList<String>> {

    @Override
    protected ArrayList<String> doInBackground(String... params) {
        URL githubEndpoint = null;
        try {
            githubEndpoint = new URL("https://ergast.com/api/f1/current/driverStandings.json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

// Create connection
        try {
            HttpsURLConnection myConnection =
                    (HttpsURLConnection) githubEndpoint.openConnection();
            if (myConnection.getResponseCode() == 200) {
                InputStream responseBody = myConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(responseBody));
                StringBuilder sb = new StringBuilder();
                String input = null;
                while ((input = reader.readLine()) != null) {
                    sb.append(input);
                    sb.append("\n");
                }
                String json = sb.toString();

                ArrayList<String> myDataset = new ArrayList<>();
                JSONObject rootObject = new JSONObject(json);
                String arrEntry = rootObject.getJSONObject("MRData").getJSONObject("StandingsTable").getJSONArray("StandingsLists").get(0).toString();
                JSONObject arrEntryObject = new JSONObject(arrEntry);
                JSONArray standingsJsonList = arrEntryObject.getJSONArray("DriverStandings");
                for (int i = 0; i < standingsJsonList.length(); i++) {
                    JSONObject listEntry = new JSONObject(standingsJsonList.get(i).toString());
                    listEntry.getJSONObject("Driver").getString("givenName");
                    myDataset.add(listEntry.getJSONObject("Driver").getString("givenName"));
                }
                return myDataset;

            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void onPostExecute(ArrayList<String> l){

    }
}
