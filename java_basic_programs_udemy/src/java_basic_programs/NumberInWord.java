package java_basic_programs;

import java.util.Scanner;

public class NumberInWord {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		 System.out.println("enter any num to get word");
		int num=scanner.nextInt();
	   
printNumberInWord(num);
		
	}
	public static void  printNumberInWord(int num)
	{
		switch(num)
		{
		case 0:System.out.println("zero");
		break;
		case 1:System.out.println("one");
		break;
		case 2:System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		case 4:System.out.println("four");
		break;
		case 5:System.out.println("five");
		break;
		case 6:System.out.println("six");
		break;
		case 7:System.out.println("seven");
		break;
		case 8:System.out.println("eight");
		break;
		case 9:System.out.println("nine");
		break;
		default:
			System.out.println("other");
		break;
		}
	}

}
