package com.softworld.collections;
import java.util.*;
public class LinkedHashSetExample   
{  
  
// main method  
public static void main(String argvs[])  
{  
   
LinkedHashSet<String> lhs = new LinkedHashSet<String>();  
  
// Adding elements to the above Set  
lhs.add("Java");  
lhs.add("T");  
lhs.add("Point");  
lhs.add("Good");  
lhs.add("Website");  
 
System.out.println("The hash set is: " + lhs);  
  
// Removing an element from the above linked Set  
  
System.out.println(lhs.remove("Good"));  
  
System.out.println("After removing the element, the hash set is: " + lhs);  
  
System.out.println(lhs.remove("For"));  
  
}  
}  
