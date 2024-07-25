package com.softworld.java8.defaultStaticInterface;

public class Car implements Vehicle
{
	private String brand;

	public Car(String brand) {
		this.brand=brand;
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}

	@Override
	public String speedUp() {
		
		// TODO Auto-generated method stub
		
		return "car speedup";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "car slow down";
	}
	public static void main(String[] args) 
	{
		
		Vehicle vehicle= new Car("BMW");
		
		System.out.println(vehicle.slowDown());
		System.out.println(vehicle.speedUp());
		System.out.println(vehicle.getBrand());
		vehicle.turnAlarmOn();
		vehicle.turnAlarmOff();
		Vehicle.myStaticMethod();
		
		
		

	}
	
	

}
