package org.example.creational.builder;

public class Main {
    public static void main() {
        Director director = new Director();
        AutomaticCarBuilder builder = new AutomaticCarBuilder();
        director.createAutomaticCar(builder);

        ManualCarBuilder builder1 = new ManualCarBuilder();
        director.createManualCar(builder1);
    }
}
