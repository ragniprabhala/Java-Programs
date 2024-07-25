package polymorphism;

public class Animal 
{
	public void makeSound()
	{
		System.out.println("animal makes sound");
	}
}
class Dog extends Animal
{
	@Override
	public void makeSound()
	{
		System.out.println("dogs bark");
	}
	
}
class Cat extends Animal
{
	@Override
	public void makeSound()
	{
		System.out.println("Cat meows");
	}
}
