package java_basic_programs;

public class IntEqualityPrinter {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		printEqual(1, 2, 3);
	}
	public static void printEqual(int x,int y,int z)
	{
		if(x<0 || y<0 || z<0)
		{
			System.out.println("Invalid Value");
		}
		else if(x==y&&x==z&&z==y)
		{
			System.out.println("All numbers are equal");
		}
		else if(x!=y&&x!=z&&z!=y)
		{
			System.out.println("All numbers are different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}
	}

}
