package com.softworld.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//import javafx.scene.control.Alert;

public class ArrayListExample {

	public static void main(String[] args) 
	
	{
		ArrayList<String> a1= new ArrayList<String>();
		System.out.println("adding elements to list");
		a1.add("apple");
		a1.add("oranges");
		a1.add("banana");
		a1.add("raspberry");
		a1.add("watermelon");
		a1.add("avocado");
		a1.add("cherries");
		ArrayList a2= new ArrayList();
		a2.add("pomegrante");
		a2.add("grapes");
		a1.addAll(a2);
		System.out.println(a1);
		
		System.out.println("sorting list");
		Collections.sort(a1);
		System.out.println(a1);
		
		System.out.println("iterating through list");
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.err.println("");
		
		if(a1.contains("oranges"))
		{
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		}
		
		System.out.println("removing elements");
		a1.remove(3);
		a1.remove(a2);//removing arraylist a2
		System.out.println(a1);
		
	}

}
