package org.example.creational.simplefactory;

public class Main {
    public static void main() {
        WoodenDoor door = DoorFactory.makeDoor(1.2f, 2.3f);
        System.out.println(door.getHeight());
        System.out.println(door.getWidth());
    }
}
