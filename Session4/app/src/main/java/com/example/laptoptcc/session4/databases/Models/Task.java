package com.example.laptoptcc.session4.databases.Models;

/**
 * Created by laptopTCC on 2/8/2017.
 */

public class Task {
    private String name;
    private String color;

    public Task(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "color:"+ this.getColor() +  "name:"+this.getName();
    }
}
