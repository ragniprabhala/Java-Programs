package com.softworldpgms.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


	public class SerializationDemo {
		
	    public static void main(String[] args) throws ClassNotFoundException 
	    {
	        // Create an object
	        Person person = new Person("Alice", 30);

	        // Serialize the object
	        try {
	            FileOutputStream fileOut = new FileOutputStream("person.ser");
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(person);
	            objectOut.close();
	            fileOut.close();
	            System.out.println("Object serialized and saved to person.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        
	        try {
	            FileInputStream fileIn = new FileInputStream("person.ser");
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
	            Person deserializedPerson = (Person) objectIn.readObject();
	            objectIn.close();
	            fileIn.close();
	            System.out.println("Deserialized object:");
	            System.out.println("Name: " + deserializedPerson.getName());
	            System.out.println("Age: " + deserializedPerson.getAge());
	        } catch (IOException  e) {
	            e.printStackTrace();
	        }
	    }
	}


	class Person implements Serializable {
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	}


