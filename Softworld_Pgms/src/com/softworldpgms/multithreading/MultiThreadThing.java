package com.softworldpgms.multithreading;

public class MultiThreadThing extends Thread
{
@Override
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
