package com.example.lab3;

public class NationalFlag {
    int imgIcon, codeZip;
    String nameNational;

    public NationalFlag() {
    }

    public NationalFlag(int imgIcon, int codeZip, String nameNational) {
        this.imgIcon = imgIcon;
        this.codeZip = codeZip;
        this.nameNational = nameNational;
    }

    public int getImgIcon() {
        return imgIcon;
    }

    public void setImgIcon(int imgIcon) {
        this.imgIcon = imgIcon;
    }

    public int getCodeZip() {
        return codeZip;
    }

    public void setCodeZip(int codeZip) {
        this.codeZip = codeZip;
    }

    public String getNameNational() {
        return nameNational;
    }

    public void setNameNational(String nameNational) {
        this.nameNational = nameNational;
    }
}
