package com.example.gamerecycle;

public class ItemModel {

    String name, year, detail;
    int poster;

    public ItemModel(String name, String year, String detail, int poster) {
        this.name = name;
        this.year = year;
        this.poster = poster;
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getPoster() {
        return poster;
    }
}
