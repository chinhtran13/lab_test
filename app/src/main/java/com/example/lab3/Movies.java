package com.example.lab3;

public class Movies {
    String title, fproducer, year;

    public Movies() {
    }

    public Movies(String title, String fproducer, String year) {
        this.title = title;
        this.fproducer = fproducer;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFproducer() {
        return fproducer;
    }

    public void setFproducer(String fproducer) {
        this.fproducer = fproducer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
