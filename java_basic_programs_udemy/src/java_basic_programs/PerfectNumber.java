package java_basic_programs;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		boolean a=isPerfectNumber(5);
		System.out.println(a);
		
	}
	public static boolean isPerfectNumber(int num)
	{
		int sum=0;
		if(num<1)
		{
			return false;
		}
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				if(sum==num)
				{
					return true;
				}
			}
		}
		return false;
		
		
	}

}
