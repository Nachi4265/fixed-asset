package com.pluralsight;

public class House extends FixedAsset {

    private int yearBuilt;
    private int sqaureFeet;
    private int bedRooms;


    public House(String name, double markeyvalue, int yearBuilt, int sqaureFeet, int bedRooms) {
        super(name, markeyvalue);
        this.yearBuilt = yearBuilt;
        this.sqaureFeet = sqaureFeet;
        this.bedRooms = bedRooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSqaureFeet() {
        return sqaureFeet;
    }

    public void setSqaureFeet(int sqaureFeet) {
        this.sqaureFeet = sqaureFeet;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    //TODO HOW DOES A HOUSE CALC IT'S CURRENT VALUE
    @Override
    public double getValue() {
        return 0;
    }
}
