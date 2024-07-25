package com.java17.section8.EncapsulationChallenge;

public class Printer
{
private int tonerLevel;
private int pagesPrinted;
private boolean duplex;

public Printer(int tonerLevel, boolean duplex) {
	super();
	this.tonerLevel = (tonerLevel<100 && tonerLevel>0)?tonerLevel:-1;
	this.duplex = duplex;
}
public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
	super();
	this.tonerLevel = tonerLevel;
	this.pagesPrinted = pagesPrinted;
	this.duplex = duplex;
}
public int addToner(int tonerAmount)
{
	int tonerLevelAmount=tonerLevel+tonerAmount;
	if(tonerLevelAmount<0||tonerLevelAmount>100)
	{
		System.out.println("tonerLevel should not exceed 100 or below 0 percent");
		
	}
	else {
		tonerLevel=tonerAmount+tonerLevel;
	}
	return tonerLevel;
	
}

public int printPages(int pages)
{
	int jobpages=(duplex) ? (pages)/2 +(pages%2):pages;
	pagesPrinted=pagesPrinted+jobpages;
	return pagesPrinted;
	
}

public int getPagesPrinted() {
	// TODO Auto-generated method stub
	return pagesPrinted;
}

}
