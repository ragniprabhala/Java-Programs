package java_basic_programs;

import java.util.Scanner;

public class Reading_User_Input {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		int sum=0;
		int count =0;

	do {
	try {
		
		System.out.println("enter a number");
		String a=scanner.nextLine();
		int num=Integer.parseInt(a);
		sum=sum+num;
		count++;
		
	}catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("enter only integers,invalid text ");
		
		
	}
	
	}
	
	while (count<5);
	

	
	

System.out.println(sum);
	

	}
}
