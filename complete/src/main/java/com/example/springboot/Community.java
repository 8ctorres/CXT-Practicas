package com.example.springboot;

public class Community{
    private final int id;
    private final String name;
    private final String capital;

    public Community(int id, String name, String capital){
        this.id = id;
        this.name = name;
        this.capital = capital;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getCapital(){
        return this.capital;
    }
}