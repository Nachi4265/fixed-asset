package com.pluralsight;

public class Gold extends FixedAsset{

    private double weight;

    public Gold(String name, double originalValue, double weight) {
        super(name, originalValue);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    ///todo how does gold calculate it's current value
    @Override
    public double getValue() {
        return 0;
    }
}
