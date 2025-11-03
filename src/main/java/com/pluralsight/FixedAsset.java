package com.pluralsight;

public abstract class FixedAsset implements Valuable{
    private String name;
    private double originalValue;



    public FixedAsset(String name, double originalValue) {
        this.name = name;
        this.originalValue = originalValue;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarkeyvalue() {
        return originalValue;
    }

    public void setMarkeyvalue(double markeyvalue) {
        this.originalValue = markeyvalue;
    }


    public abstract double getValue();


}
