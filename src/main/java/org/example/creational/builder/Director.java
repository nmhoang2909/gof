package org.example.creational.builder;

public class Director {
    public void createAutomaticCar(Builder builder) {
        builder.setAutomatic();
        builder.getProduct();
    }

    public void createManualCar(Builder builder) {
        builder.setManual();
        builder.getProduct();
    }
}
