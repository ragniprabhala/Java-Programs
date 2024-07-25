package com.java17.section8.polymorphismChallenge;

public class Car 
{
private String description;

public Car()
{
	
}
public Car(String description) {
	super();
	this.description = description;
}

public void startEngine()
{
	System.out.println("Super class Car"+this.description +" engine");
} 

public void drive()
{
	runEngine();
	System.out.println("super class driving ");
}
protected void runEngine() 
{
	System.out.println(" car is running");
	
}


}
