package com.example.recyclerview;

public class Book {
    int photo;
    String title;
    String desc;
    int price;

    public Book(int photo, String title, String desc, int price){
        this.photo = photo;
        this.title = title;
        this.desc = desc;
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }
}


