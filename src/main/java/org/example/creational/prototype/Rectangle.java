package org.example.creational.prototype;

public class Rectangle extends Shape {
    Rectangle() {

    }

    Rectangle(Rectangle target) {
        super(target);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
