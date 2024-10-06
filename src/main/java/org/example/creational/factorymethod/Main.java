package org.example.creational.factorymethod;

public class Main {
    public static void main() {
        new RoadLogistics().planDeliver();
        new SeaLogistics().planDeliver();
    }
}
