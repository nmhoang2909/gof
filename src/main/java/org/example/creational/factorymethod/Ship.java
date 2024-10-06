package org.example.creational.factorymethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("ship");
    }
}
