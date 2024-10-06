package org.example.creational.singleton;

import java.util.Objects;

public class Main {
    public void main() throws IllegalAccessException {
        Driver driver = Driver.getInstance();
        driver.getDriver();
        driver.setDriver();

        Driver driver1 = Driver.getInstance();

        if (!Objects.equals(driver, driver1)) {
            throw new IllegalAccessException("only one Driver has been created");
        }
    }
}
