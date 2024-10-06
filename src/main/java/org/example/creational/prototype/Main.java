package org.example.creational.prototype;

import java.io.InvalidObjectException;
import java.util.Objects;

public class Main {
    public void main() throws InvalidObjectException {
        Circle circle = new Circle();
        Circle anotherCircle = (Circle) circle.clone();
        Rectangle rectangle = new Rectangle();
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();

        if (!Objects.equals(circle, anotherCircle)) {
            throw new InvalidObjectException("should be the same Circle");
        }
        if (!Objects.equals(rectangle, anotherRectangle)) {
            throw new InvalidObjectException("should be the same Rectangle");
        }
    }
}
