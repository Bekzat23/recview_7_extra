package com.example.new_recycler_view;

public class Anime {
    int photo;
    String title;
    String desc;
    String genre;
    int year;

    public Anime(int photo, String title, String desc, String genre, int year){
        this.photo = photo;
        this.title = title;
        this.desc = desc;
        this.genre = genre;
        this.year = year;
    }

    public int getPhoto() {
        return photo;
    }
    public String getTitle() {
        return title;
    }
    public String getDesc() { return desc; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
}



