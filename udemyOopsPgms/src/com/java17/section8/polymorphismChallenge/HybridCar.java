package com.java17.section8.polymorphismChallenge;

public class HybridCar extends Car
{
private double avgKmPerLitre;
private int batterySize;
private int Cylinders;
public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
	super();
	this.avgKmPerLitre = avgKmPerLitre;
	this.batterySize = batterySize;
	Cylinders = cylinders;
}
@Override
public void startEngine() {
	System.out.println("hybrid car is started");
}
@Override
public void drive() {
	System.out.println("hybrid car is driving");
}
@Override
protected void runEngine() {
	System.out.println("hybrid car is running");
}


	
}
