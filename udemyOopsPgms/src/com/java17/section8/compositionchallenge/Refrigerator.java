package com.java17.section8.compositionchallenge;

public class Refrigerator 
{
	private boolean hasWorkToDo;
	
	
	public Refrigerator() {
		super();
	}

	public Refrigerator(boolean hasWorkToDo)
	{
	this.hasWorkToDo=hasWorkToDo;
	
	}
	

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public boolean isHasWorkToDo() {
		return hasWorkToDo;
	}
	
	public void orderfood()
	{
		if(hasWorkToDo)
		{
			System.out.println("food is prepared");
			hasWorkToDo=false;
		}
		
	}

}
