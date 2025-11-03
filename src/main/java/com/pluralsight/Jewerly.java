package com.pluralsight;

public class Jewerly extends FixedAsset{

    private double karat;

    public Jewerly(String name, double originalValue, double karat) {
        super(name, originalValue);
        this.karat = karat;
    }


    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return 0;
    } //todo how does a jewel calc it;s velue


}
