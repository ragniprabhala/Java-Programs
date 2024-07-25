package com.java17.section8.exercise38.compositechallenge;

public class Main {

	public static void main(String[] args) {
		
		Wall wall1=new Wall("west");
		Wall wall2= new Wall("East");
		
		Wall wall3= new Wall("south");
		Wall wall4 = new Wall("North");
		
Ceiling ceiling = new Ceiling(12,55);

Bed bed = new Bed("modern", 4, 3, 2, 1);
Lamp lamp= new Lamp("classic", false, 75);

BedRoom bRoom= new BedRoom("ragni",wall1, wall2, wall3, wall4,  ceiling, bed, lamp);

bRoom.makeBed();
bRoom.getLamp().turnOn();
	}

}
