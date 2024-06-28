package com.example.lab3;

public class Language {
    int imgIcon;
    String tvTen;

    public Language() {
    }

    public Language(int imgIcon, String tvTen) {
        this.imgIcon = imgIcon;
        this.tvTen = tvTen;
    }

    public int getImgIcon() {
        return imgIcon;
    }

    public void setImgIcon(int imgIcon) {
        this.imgIcon = imgIcon;
    }

    public String getTvTen() {
        return tvTen;
    }

    public void setTvTen(String tvTen) {
        this.tvTen = tvTen;
    }
}
