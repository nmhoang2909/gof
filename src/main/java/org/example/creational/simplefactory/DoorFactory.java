package org.example.creational.simplefactory;

public class DoorFactory {
    public static WoodenDoor makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}
