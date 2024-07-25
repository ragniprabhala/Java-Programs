package java_basic_programs;

import java.util.Scanner;

public class switchChallenge
{
	

	public static void main(String[] args)
	{
		
		
		char ch='A';
		
		
		switch(ch)
		{
		case 'A':
			System.out.println("Nato keyword for letter A is Able");
			break;
		case 'B':
			System.out.println("Nato keyword for letter B is Baker");
			break;
			
		case 'C':
			System.out.println("Nato keyword for letter C is Charlie");
		    break;
		
		case 'D':
			System.out.println("Nato keyword for letter D is Dog");
		    break;
		case 'E':
			System.out.println("Nato keyword for letter E is Easy");
		    break;
		default:
            System.out.println("Invalid letter");
            break;
		}
	}

}
