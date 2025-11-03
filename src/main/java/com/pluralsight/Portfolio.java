package com.pluralsight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<Valuable>();
    }


    public  void add(Valuable valuable){
        this.assets.add(valuable);
    }

    public double getValue(){
        double currentVelue = 0;

        for(Valuable v : this.assets){
            currentVelue += v.getValue();
        }

        return currentVelue;
    }



}
