package com.softworld.collections;

import java.util.LinkedList;

public class linkedListExample {

	public static void main(String[] args) 
	{
		LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        
        linkedList.addFirst("Banana");

        // Add an element at the end
        linkedList.addLast("Grapes");

        // Add an element at a specific index
        linkedList.add(2, "Mango");
        
        //removing specific element
        linkedList.remove(2);
        
        //traversing through for each loop
        for(String fruits: linkedList)
        {
        	System.out.println(fruits);
        }


	}

}
