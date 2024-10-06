package org.example.creational.prototype;

public abstract class Shape {
    private String color;

    Shape() {
    }

    Shape(Shape target) {
        if (null != target) {
            this.color = target.color;
        }
    }

    public abstract Shape clone();
}
