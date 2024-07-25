package java_basic_programs;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		printYearsAndDays((long) 561600);
	}
	
	public static void printYearsAndDays(Long minutes)
	{
		
		if(minutes>0)
		{
			long hours=minutes/60;
			long days=hours/24;
			long year=days/365;
			long remainingdays=days%365;
			
			 System.out.println(minutes+"min = "+year+"y and "+remainingdays+"d");
			
			
		}
		else
		{
			System.out.println("invalid value");
		}
	}


}
