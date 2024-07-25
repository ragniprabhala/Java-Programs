package com.softworld.collections;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) 
	{
	Map map	= new HashMap();
	map.put(1, "ram");
	map.put(2, "jai");
	map.put(3, "sravs");
	
	Set set = map.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext()) 
	{
		Map.Entry entry= (Entry)itr.next();
		System.out.println(entry.getKey()+"  "+entry.getValue());
		
	}

	}

}
