package com.softworld.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DistinctElements
{
	public static void main(String[] args)

	
	{	
		
		List<Integer> l1= new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(10);
		l1.add(5);
		l1.add(15);
		l1.add(20);
		l1.add(5);
		l1.add(18);

		System.out.println("list of duplicate elements "+ l1);
		HashSet<Integer> hSet = new HashSet<Integer>(l1);
		
		//System.out.println("hashset"+hSet);

		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>(l1);
		//System.out.println("linkedHashSet"+set);
		Iterator<Integer> iterator = set.iterator();
		System.out.println("Distinct elements in insertion order ");
	     while(iterator.hasNext())
	     {
	    	 System.out.println(iterator.next());
	    	 
	     }
	
	  TreeSet<Integer> treeSet = new TreeSet<Integer>(set);
	            
		System.out.println("Distinct elements in ascending order");
		System.out.println("TreeSet"+treeSet);
		for(Integer i:treeSet)
		{
			System.out.println(i);
		}
	     
		
		
	}

	
}
