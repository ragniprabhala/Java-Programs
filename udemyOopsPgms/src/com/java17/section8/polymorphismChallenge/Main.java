package com.java17.section8.polymorphismChallenge;

public class Main {

	public static void main(String[] args) 
	{
		
Car car = new ElectricCar(5.5, 4);
car.startEngine();
car.drive();
	}

}
