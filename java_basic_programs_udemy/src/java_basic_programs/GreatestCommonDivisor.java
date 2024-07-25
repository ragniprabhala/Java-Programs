package java_basic_programs;

public class GreatestCommonDivisor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=getGreatestCommonDivisor(18, 9);
		System.out.println(a);

	}
	public static int getGreatestCommonDivisor(int first ,int second)
	{
		if(first<10 || second <10)
		{
			return -1;
		}
		int max =0;
		for(int i=1;i<first||i<second;i++)
		{
			if(first%i==0&&second%i==0)
			{
			       max=i;
				//System.out.println(max);
			}
			
			
		}
		return max;
		
		
		
	}

}
