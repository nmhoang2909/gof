package org.example.creational.simplefactory;

public class WoodenDoor implements Door {
    private float width;
    private float height;

    WoodenDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height;
    }
}
