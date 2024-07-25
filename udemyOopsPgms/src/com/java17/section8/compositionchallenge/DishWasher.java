package com.java17.section8.compositionchallenge;

public class DishWasher 
{
private boolean hasWorkToDo;


public DishWasher() {
	super();
}

public DishWasher(boolean hasWorkToDo)
{
	this.hasWorkToDo=hasWorkToDo;
}

public void setHasWorkToDo(boolean hasWorkToDo) {
	this.hasWorkToDo = hasWorkToDo;
}

public void doDishes()
{
	if(hasWorkToDo)
	{
		System.out.println("dishes has be cleaned");
		hasWorkToDo=false;
	}
	
}
}
