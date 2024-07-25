package java_basic_programs;

import java.util.Scanner;

public class MinMaxChallenge 
{
public static void main(String[] args) 
{
	Scanner scanner= new Scanner(System.in);
	boolean status=true;
	int min =0;
	int max=0;
	
	
	while(true)
	{
		System.out.println("enter a number");
		String num=scanner.nextLine();
	
		try {
			
			int a=Integer.parseInt(num);
			//max=Integer.parseInt(num);
			if(a<min)
			{
				min=a;
			}
			 if(a>max)
			 {
				 min=max;
				 max=a;
				 
			 }
			
			} 
		catch (NumberFormatException e) 
		{
		   
			   break;
		   }
		
		}
	System.out.println("min " +min);
	System.out.println("max " +max);
		
	}	
}

