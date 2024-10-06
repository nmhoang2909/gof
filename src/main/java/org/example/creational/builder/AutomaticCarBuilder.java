package org.example.creational.builder;

public class AutomaticCarBuilder implements Builder {
    @Override
    public void reset() {

    }

    @Override
    public void setManual() {

    }

    @Override
    public void setAutomatic() {
        System.out.println("set automatic engine");
    }

    @Override
    public void setSeat() {

    }

    @Override
    public void getProduct() {
        this.setAutomatic();
    }
}
