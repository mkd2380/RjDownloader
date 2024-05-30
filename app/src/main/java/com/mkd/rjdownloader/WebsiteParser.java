package com.mkd.rjdownloader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class WebsiteParser  {

    String BASE_URL = "https://host2.mediacon-rj.app/media/mp3/";


    public interface ParsingCallback {
        void onParsingComplete(String message);

        void onParsingError(Exception e);
    }

    public void parseWebsite(String url, ParsingCallback callback) {


    }
}




