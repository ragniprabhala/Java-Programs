package com.java17.section8.polymorphismChallenge;

public class ElectricCar extends Car
{
private double avgKmPerCharge;
private int batterySize;

public ElectricCar(double avgKmPerCharge, int batterySize) {
	super();
	this.avgKmPerCharge = avgKmPerCharge;
	this.batterySize = batterySize;
}
@Override
public void startEngine()
{
	System.out.println("electric car engine is started");
	
}
@Override
public void drive()
{
	runEngine();
	System.out.println();
}
@Override
public void runEngine()
{
	System.out.println("electric car engine is running");
}
}