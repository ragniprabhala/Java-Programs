package com.softworld.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	
	
@Autowired
@Qualifier("humanHeart")
private Heart heart;

public Human() {
	// TODO Auto-generated constructor stub
}





public Heart getHeart() {
	return heart;
}


public Human(Heart heart) {
	super();
	this.heart = heart;
}

public void setHeart(Heart heart) {
	this.heart = heart;
}

public void startPumping()
{
	if(heart!=null)
	{
		heart.pump();
		
	}
	else {
		System.out.println("ur dead");
	}
}
}
