package com.java17.section8.compositionchallenge;

public class CoffeeMaker 
{

	private boolean hasWorkToDo;

	public CoffeeMaker(boolean hasWorkToDo) {
		super();
		this.hasWorkToDo = hasWorkToDo;
	}
	
	public CoffeeMaker() {
		// TODO Auto-generated constructor stub
	}

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	public void brewCoffee()
	{
		if(hasWorkToDo)
		{
			System.out.println("coffee has been brewed ");
			hasWorkToDo=false;
		}
	}
}
