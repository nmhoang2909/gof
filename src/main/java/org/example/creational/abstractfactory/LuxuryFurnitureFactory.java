package org.example.creational.abstractfactory;

public class LuxuryFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new LuxuryChair();
    }
}
