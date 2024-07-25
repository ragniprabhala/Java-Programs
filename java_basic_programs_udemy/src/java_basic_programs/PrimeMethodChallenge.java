package java_basic_programs;


public class PrimeMethodChallenge 
{
	
	public static void main(String[] args) 
	{
		
	primerange();
	}
	
	public static boolean isPrime(int num)
	{
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
	}
		return true;
	
		
	}
	public static void primerange()
	{
		int count=0;
		for(int i=2;i<=50;i++)
		{
			
			if(isPrime(i))
			{
				count++;
				//System.out.println("count---" +count);
				System.out.println(i);
				if(count==3)
				{
					break;
				}
				
			}
			
			
			
		}
		
	}
}

