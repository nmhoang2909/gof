package org.example.creational.singleton;

public class Driver {
    private static Driver instance;

    private Driver() {
    }

    public static Driver getInstance() {
        synchronized (Driver.class) {
            if (null != instance) {
                return instance;
            }
            return new Driver();
        }
    }

    public void getDriver() {
        System.out.println("get driver");
    }

    public void setDriver() {
        System.out.println("set driver");
    }
}
