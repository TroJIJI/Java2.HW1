package com.geektech;

public class Transport {
    private int year;
    private String type;

    public Transport(){

    }

    public Transport(int year, String type) {
        this.year = year;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }
}
