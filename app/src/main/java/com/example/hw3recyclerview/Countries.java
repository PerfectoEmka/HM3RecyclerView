package com.example.hw3recyclerview;

public class Countries {

    private String name, capitalCity;
    private int  flag;


    public Countries(String name, String capitalCity, int flag) {
        this.name = name;
        this.capitalCity = capitalCity;
        this.flag = flag;
    }


    public int getFlag() {
        return flag;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getName() {
        return name;
    }
}
