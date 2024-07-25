package Week3ArrayLabs;
import java.util.Arrays;
public class MyArrays 

{
	
	public static void main(String[] args) {
        // Create and populate the Bollywood string array
        String[] bollywood = {"Amithab", "SRK", "Sushanth", "Ranveer"};

        // Print each element using println
        for (String actor : bollywood) {
            System.out.println(actor);
        }

        // Print using a FOR loop and LENGTH COMMAND
        for (int i = 0; i < bollywood.length; i++) {
            System.out.println(bollywood[i]);
        }

        // Add an element
        String newActor = "Sidharth";
        bollywood = addElement(bollywood, newActor);

        // Search for an element and print its location
        String searchActor = "Sushanth";
        int location = Arrays.asList(bollywood).indexOf(searchActor);
        if (location != -1) {
            System.out.println(searchActor + " found at index " + location);
        } else {
            System.out.println(searchActor + " not found in the array.");
        }

        // Sort and print using FOR loop
        sortArray(bollywood);

        // Create and populate the Ages int array
        int[] ages = {25, 30, 40, 22, 50};

        // Print using a FOR loop
        for (int age : ages) {
            System.out.println("Age: " + age);
        }

        // Sort and print using FOR loop
        sortArray(ages);
    }

    // Function to add an element to a string array
    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }

    // Function to sort a string array
    public static void sortArray(String[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Array:");
        for (String element : array) {
            System.out.println(element);
        }
    }

    // Function to sort an int array
    public static void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Array:");
        for (int element : array) {
            System.out.println("Age: " + element);
        }
    }
}


