package com.softworld.autowiring;

public class Heart 
{
	private String nameOfAnimal;
	private int noOfHeart;
	public void pump()
	{
		System.out.println("heart is pumping");
		System.out.println("alive");
	}
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	public int getNoOfHeart() {
		return noOfHeart;
	}
	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}
	
}
