package Week3ArrayLabs;

public class ArrayDecs 
{
public static void main(String[] args)
{
	int[] cityPopulation = new int[20];
    
    
    String[] squad = new String[11];
    
    
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    
    
    System.out.println("Planets in the solar system:");
    for (String planet : planets) {
        System.out.println(planet);
    }
}
}
