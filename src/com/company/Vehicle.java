package com.company;

public abstract class Vehicle {
    boolean isActive;

    Vehicle() {
        this.isActive = true;
    }

    Vehicle(boolean isActive) {
        this.isActive = isActive;
    }

    public abstract void drive();
}
