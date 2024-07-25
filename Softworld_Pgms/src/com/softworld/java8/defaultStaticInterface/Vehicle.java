package com.softworld.java8.defaultStaticInterface;

public interface Vehicle 
{
String getBrand();
    
    String speedUp();
    
    
    String slowDown();
    
    default void turnAlarmOn() {
    	
        System.out.println("Turning the vehicle alarm on.");
    }
    
    default void turnAlarmOff() {
        System.out.println("Turning the vehicle alarm off");
    }
    static void myStaticMethod()
    {
    	System.out.println(" interface static method implementation");
    }

}
