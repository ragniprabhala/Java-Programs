package com.java17.section8.compositionchallenge;

public class Main 
{
	public static void main(String[] args)
	{
		
		SmartKitchen smk=new SmartKitchen();
		/*
		 * smk.getIceBox().setHasWorkToDo(true);
		 * smk.getDishWasher().setHasWorkToDo(true);
		 * smk.getBrewMaster().setHasWorkToDo(true); smk.getIceBox().orderfood();
		 * smk.getDishWasher().doDishes(); smk.getBrewMaster().brewCoffee();
		 */
		
		
		smk.setKitchenState(true, true, false);
		smk.doKitchenWork();
		
	}


}
