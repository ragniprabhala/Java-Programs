package com.java17.section8.exercise38.compositechallenge;

public class Lamp 
{
	private String style;
	private boolean battery;
	private int globRating;
	public Lamp(String style, boolean battery, int globRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}
	public void turnOn()
	{
		System.out.println("lamp is turned on");
	}
	public String getStyle() {
		return style;
	}
	
	public boolean isBattery() {
		return battery;
	}
	
	public int getGlobRating() {
		return globRating;
	}

	
}
