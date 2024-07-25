package polymorphism;

public class Animal_main 
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		Animal animal2= new Dog();
		Animal animal3= new Cat();
		animal.makeSound();
		animal2.makeSound();
		animal3.makeSound();
	}
	
}
