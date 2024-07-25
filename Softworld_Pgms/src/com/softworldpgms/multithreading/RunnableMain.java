package com.softworldpgms.multithreading;

public class RunnableMain 
{
public static void main(String[] args) 
{
	MultiThreadingRunnable mtr = new MultiThreadingRunnable();
	MultiThreadingRunnable mtr1 = new MultiThreadingRunnable();
	Thread thread= new Thread(mtr);
	Thread thread1= new Thread(mtr1);
	thread.start();
	try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	thread1.start();
	
	
	
}
}
