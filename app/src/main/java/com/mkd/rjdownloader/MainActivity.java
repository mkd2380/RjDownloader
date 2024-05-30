package com.mkd.rjdownloader;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebsiteParser websiteParser = new WebsiteParser();
        websiteParser.parseWebsite("", new WebsiteParser.ParsingCallback() {
            @Override
            public void onParsingComplete(String title, List<String> elementsText) {

                Toast.makeText(MainActivity.this, "ssss", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onParsingError(Exception e) {

            }
        });

    }


}



