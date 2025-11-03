package com.pluralsight;

public abstract class FixedAsset {
    private String name;
    private double markeyvalue;


    public FixedAsset(String name, double markeyvalue) {
        this.name = name;
        this.markeyvalue = markeyvalue;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarkeyvalue() {
        return markeyvalue;
    }

    public void setMarkeyvalue(double markeyvalue) {
        this.markeyvalue = markeyvalue;
    }


    public abstract double getValue();


}
