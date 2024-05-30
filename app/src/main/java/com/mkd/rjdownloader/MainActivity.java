package com.mkd.rjdownloader;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    private final String URL = "https://play.radiojavan.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pingUrl();

    }


    public boolean pingUrl() {
        HttpURLConnection connection = null;
        try {
            URL u = new URL(URL);
            connection = (HttpURLConnection) u.openConnection();
            connection.setRequestMethod("HEAD"); // Use HEAD request for efficiency
            connection.connect();
            int responseCode = connection.getResponseCode();
            return responseCode >= 200 && responseCode < 300; // Success codes are in 2xx range
        } catch (MalformedURLException e) {
            // Handle invalid URL
            return false;
        } catch (IOException e) {
            // Handle connection error
            return false;
        } finally {
            connection.disconnect(); // Close the connection
        }
    }


}



