package com.java17.section8.exercise38.compositechallenge;

public class Bed 
{
private String style;
private int pillows,height,sheets,quilt;
public Bed(String style, int pillows, int height, int sheets, int quilt) {
	super();
	this.style = style;
	this.pillows = pillows;
	this.height = height;
	this.sheets = sheets;
	this.quilt = quilt;
}
public void make()
{
	System.out.println("bed is being made");
}
public String getStyle() {
	return style;
}
public int getPillows() {
	return pillows;
}
public int getHeight() {
	return height;
}
public int getSheets() {
	return sheets;
}
public int getQuilt() {
	return quilt;
}

}
