package org.example.creational.abstractfactory;

public class Main {
    public void main() {
        service(new LuxuryFurnitureFactory());
        service(new ModernFurnitureFactory());
    }

    public void service(FurnitureFactory factory) {
        System.out.println(factory.createChair().hasLeg());
    }
}
