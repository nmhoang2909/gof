package org.example;

import org.example.creational.simplefactory.DoorFactory;
import org.example.creational.simplefactory.WoodenDoor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WoodenDoor door = DoorFactory.makeDoor(1.2f, 2.3f);
        door.getHeight();
        door.getWidth();
    }
}