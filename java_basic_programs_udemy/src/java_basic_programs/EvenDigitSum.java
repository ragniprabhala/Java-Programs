package java_basic_programs;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=getEvenDigitSum(-22);
System.out.println(a);
	}

	public static int getEvenDigitSum(int num)
	{
		int lastdigit=0;
		int sum=0;
		if(num<0)
		{
			return -1;
		}
	  while(num!=0)
	  {
		  lastdigit=num%10;
		  num=num/10;
		  if(lastdigit%2==0)
		  {
			  sum=sum+lastdigit;
		  }
		  
		  
	  }
	return sum;
	}
}
