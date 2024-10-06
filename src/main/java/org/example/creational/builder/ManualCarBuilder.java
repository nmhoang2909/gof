package org.example.creational.builder;

public class ManualCarBuilder implements Builder {
    @Override
    public void reset() {

    }

    @Override
    public void setManual() {
        System.out.println("set manual engine");
    }

    @Override
    public void setAutomatic() {

    }

    @Override
    public void setSeat() {

    }

    @Override
    public void getProduct() {
        this.setManual();
    }
}
