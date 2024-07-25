package java_basic_programs;

public class EvenNumChallenge 
{
	public static void main(String[] args)
	{
		evenRange(5, 20);
	}

	public static boolean isEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		return false;
		
	}
	
	public static int evenRange(int start,int end)
	{
		int counteven=0;
		int countodd=0;
		while(start < end )	
		{
			if(isEven(start))
			{
				System.out.println(start);
				counteven++;
				
			}
			if(counteven==5)
			{
				break;
			}
			
			else {
				countodd++;
			}
			start++;
		}
		System.out.println(counteven);
		System.out.println(countodd);
		return end;
		
	}
}
