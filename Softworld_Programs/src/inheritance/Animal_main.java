package inheritance;

public class Animal_main {

	public static void main(String[] args) 
	{
		Animal animal = new Animal("cat", "meow");
		animal.makeSound();
		System.out.println("----dog details---");
Dog dog= new Dog("german shepard");
dog.displayDetails();
dog.makeSound();

	}

}
