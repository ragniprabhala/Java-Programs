package patterns;
public class Pattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int star=0;
int count=0;
		int space=5;
		for(int i=1;i<=7;i++)
		{
			
			if(i>=5&&i<=7)
			{
				star=star-2;
				space++;	
			}
			else
			{
				space--;
				star=i+count;
			}
			
			for(int j=1;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=star;m++)
			{
			System.out.print("*");
			}
			count++;
			System.out.println();
			}
		}
	}


