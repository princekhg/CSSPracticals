package com.css.practical;

public class Shipping {
    String sourcePlace,destinationPlace;
    int netWeight;
    int totalWeight;

    public Shipping(String sourcePlace, String destinationPlace, int netWeight, int totalWeight) {
        this.sourcePlace = sourcePlace;
        this.destinationPlace = destinationPlace;
        this.netWeight = netWeight;
        this.totalWeight = totalWeight;
    }
}
