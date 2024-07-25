package java_basic_programs;


import java.security.PublicKey;
import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
inputThenPrintSumAndAverage();
	}
	public static void inputThenPrintSumAndAverage()
	{
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		double av=0;
		long avg=0;
		int count=1;
		System.out.println("enter a number");
		
		while(true)
		{
		try {
			String a=scanner.nextLine();
			
			int num=Integer.parseInt(a);
			
			sum=sum+num;
			count++;
			av=sum/count;
			avg=Math.round(av);
			
			System.out.println(count);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			 System.out.println("SUM = " + sum + " AVG = " + avg);
			continue;
		}
		
		}
		
	}

}
