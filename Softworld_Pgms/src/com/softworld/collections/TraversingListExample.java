package com.softworld.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingListExample 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("ragni");
		list.add("puppy");
		list.add("bhargavi");
		list.add("pravs");
		list.add("mani");
		
		System.out.println("travsering list through iterator");
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("traversing list through for each loop ");
		for (String names : list) {
			System.out.println(names);
			
		}
		System.out.println("traversing list through for loop");
		for(int i=1;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("traversing through listIterator interface");
		
        ListIterator<String> listitr= list.listIterator(list.size());
        System.out.println("element iterates in reverse order");
        while(listitr.hasPrevious())
        {
        	String string= listitr.previous();
        	System.out.println(string);
        	
        }
        
        
        
	}





}
