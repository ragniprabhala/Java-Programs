package com.java17.section8.polymorphismChallenge;

public class GasPoweredCar extends Car
{
private double avgKmPerLitre;
private int cylinders;

public GasPoweredCar()
{
	
}
public GasPoweredCar(double avgKmPerLitre, int cylinders) {
	
	this.avgKmPerLitre = avgKmPerLitre;
	this.cylinders = cylinders;
}
@Override
public void startEngine()
{
System.out.println("car is ignited");	
}

@Override
public void drive()
{
	super.runEngine();
	System.out.println("gas powered car is driving");
}

}
