package com.softworld.java8.tenprograms;

interface Vehicle {
    void start(); 

    default void displayInfo() { 
        System.out.println("This is a vehicle.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started.");
    }

    @Override
    public void displayInfo() { // Override default method
        System.out.println("This is a bike.");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); //  Car started.
        car.displayInfo(); // This is a vehicle.

        Vehicle bike = new Bike();
        bike.start(); // Bike started.
        bike.displayInfo(); // This is a bike.
    }
}

