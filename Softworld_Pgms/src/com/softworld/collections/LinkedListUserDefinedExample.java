package com.softworld.collections;

import java.util.LinkedList;

class Book
{
	int id;
	String name,author,publisher;
	
	public Book(int id, String name, String author, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	
}
public class LinkedListUserDefinedExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"good vibes","vexking","xyz");
		
		Book b2 = new Book(2,"silent patient","ruth","abc");
		Book b3 = new Book(3,"it ends with us","collen hover","rtz");
		
		LinkedList<Book> booklist= new LinkedList<Book>();
		booklist.add(b1);
		booklist.add(b3);
		booklist.add(b2);
		//Traversing list
		for(Book b:booklist)
		{
			System.out.println(b);
		}
	}

}
