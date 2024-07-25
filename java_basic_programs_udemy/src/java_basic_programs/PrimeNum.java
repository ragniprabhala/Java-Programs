package java_basic_programs;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter any number : ");
		int num=s.nextInt();
		
		boolean flag =false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		System.out.println(flag);
		if(!flag)
		{
			System.out.println(num+ " num is  prime");
		}
		else
		{
			System.out.println(num +" is  not prime ");
		}
		
		}
		

	}

