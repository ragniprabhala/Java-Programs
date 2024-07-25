package com.java17.section8.compositionchallenge;

public class SmartKitchen
{
private Refrigerator iceBox;
private DishWasher dishWasher;
private CoffeeMaker brewMaster;

public SmartKitchen()
{
	iceBox=new Refrigerator();
	brewMaster=new CoffeeMaker();
	dishWasher=new DishWasher();
	
}



/*public Refrigerator getIceBox() {
	return iceBox;
}*/



public DishWasher getDishWasher() {
	return dishWasher;
}



public CoffeeMaker getBrewMaster() {
	return brewMaster;
}

public void setKitchenState(boolean coffeeFlag,boolean dishwasherFlag,boolean fridgeFlag)
{
	brewMaster.setHasWorkToDo(coffeeFlag);
	iceBox.setHasWorkToDo(fridgeFlag);
	dishWasher.setHasWorkToDo(dishwasherFlag);
}
public void doKitchenWork()
{
	iceBox.orderfood();
	brewMaster.brewCoffee();
	dishWasher.doDishes();
}
}


