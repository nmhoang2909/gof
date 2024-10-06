package org.example.creational.builder;

public interface Builder {
    void reset();
    void setManual();
    void setAutomatic();
    void setSeat();
    void getProduct();
}
