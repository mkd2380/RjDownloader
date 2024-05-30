package com.mkd.rjdownloader;

public class MediaModel {

    private int id;
    private String artist;
    private String link;
    private String photo;
    private String highQualityLink;
    private String lyric;


    public MediaModel(int id, String artist, String link, String photo, String highQualityLink, String lyric) {
        this.id = id;
        this.artist = artist;
        this.link = link;
        this.photo = photo;
        this.highQualityLink = highQualityLink;
        this.lyric = lyric;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHighQualityLink() {
        return highQualityLink;
    }

    public void setHighQualityLink(String highQualityLink) {
        this.highQualityLink = highQualityLink;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }



}
