package java_basic_programs;



public class NumberPalidrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	boolean a=isPalindrome(-222);
	System.out.println(a);
	}
public static boolean isPalindrome(int num)
{
		
	int lastdigit=0;
	int originalnum=num;
	int reverse=0;
	while(num!=0)
	{
		lastdigit=num%10;
		reverse=reverse*10+lastdigit;
		num=num/10;
		
}
	
	if(originalnum==reverse)
	{
		return true;
	}
	else {
		{
			return  false;
		}
	}
	
	
}
}
