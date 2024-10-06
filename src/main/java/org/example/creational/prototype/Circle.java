package org.example.creational.prototype;

public class Circle extends Shape {
    Circle() {
    }

    Circle(Circle target) {
        super(target);
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
