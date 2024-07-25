package java_basic_programs;

public class Sumodd 
{
public static void main(String[] args) 
{
	sumOdd(2, 10);
	
}
public static boolean isOdd(int num)
{
	if(num%2!=0&&num>0)
	{
		return true;
	}
	return false;
	
}
public static int sumOdd(int start,int end)
{
	
	if(end>=start && start>0 && end >0)
	{
		int sum=0;
		for( int i=start;i<=end;i++)
		{
			if(isOdd(i))
			{
				
				sum=sum+i;
				//System.out.println(sum);
			}
			//System.out.println(sum);
		}
				
		System.out.println(sum);
		return sum;
	}
	return -1;
	
}
}
