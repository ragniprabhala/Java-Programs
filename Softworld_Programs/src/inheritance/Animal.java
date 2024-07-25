package inheritance;

public class Animal 
{
private String species;
private String sound;

public Animal(String species, String sound) {
	
	this.species = species;
	this.sound = sound;
}
public void makeSound()
{
	System.out.println(species +" makes "+sound);
}
}

class Dog extends Animal
{
	private String breed;

	public Dog(String breed)
	{
		super("dog", "bark");
		this.breed=breed;
	}
	public void displayDetails()
	{
		System.out.println("breed name "+breed);
		
	}
}




