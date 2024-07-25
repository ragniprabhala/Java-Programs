package com.softworldpgms.multithreading;

public class Main 
{
public static void main(String[] args) {
	
	MultiThreadThing mThing= new MultiThreadThing();
		MultiThreadThing multiThreadThing= new MultiThreadThing();
		multiThreadThing.start();
		mThing.start();
		
}
}
