package com.softworld.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) 
	{
		HashSet<String> hashSet= new HashSet<String>();
		hashSet.add("ram");
		hashSet.add("sita");
		hashSet.add("hanuma");
		hashSet.add("lakshman");
		hashSet.add("lakshman");
		Iterator<String> itr= hashSet.iterator();
		System.out.println("removes duplicate elements");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
