package java_basic_programs;

public class DigiSum 
{
public static void main(String[] args) 
{
	
	int a=sumDigits(1234);
	System.out.println(a);
	
}
public static int sumDigits(int num)
{
	if(num<0)
	{
		return -1;
	}
int sum=0;	
int lastdigit=0;

while(num>0)
{
	lastdigit=num%10;
	num=num/10;
	sum=sum+lastdigit;
	
}
 
	
	return sum;
	
}
}
