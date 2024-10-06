package org.example.creational.factorymethod;

abstract class Logistics {
    abstract Transport createTransport();
    public void planDeliver() {
        createTransport().deliver();
    }
}
