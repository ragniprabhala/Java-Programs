package patterns;



public class Pattern4 
{

	public static void main(String[] args) 
	{
	/*for(int i=1;i<=9;i++)
	{
		if(i<=5)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		else
		{
			for(int j=i;j<=9;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}*/
		int n=4;int j=0;
		for(int i=0;i<=2*n;i++)
		{
			if(i>n)
			{
			j=2*n-i;
			}
			else
			{
				j=i;
			}
					for(int k=0;k<=j;k++)
					{
						System.out.print("*");
					}
					System.out.println();
		}
	}
}
