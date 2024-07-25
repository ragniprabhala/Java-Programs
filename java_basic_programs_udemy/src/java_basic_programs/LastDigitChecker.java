package java_basic_programs;

public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean a=hasSameLastDigit(9, 99, 999);
boolean val=isValid(1051);
System.out.println(val);
System.out.println(a);
	}
	public static boolean hasSameLastDigit(int n1,int n2,int n3)
	{
		int ld1=0;
		int ld2=0;
		int ld3=0;
		
		if(n1>=10&&n2<=1000 && n1<=1000 && n2>=10&&n3>=10 && n3<=1000)
		{
			
			
				//System.out.println("hi");
				ld1=n1%10;
				ld2=n2%10;
				ld3=n3%10;
				//System.out.println(ld1);
				
				if((ld1==ld2)||(ld1==ld3)||(ld2==ld3))
				{
					return true;
				}
				
			
		}
		return false;
		
		
	}
	public static boolean isValid(int num)
	{
		if(num>=10 && num<=1000)
		{
			return true;
		}
		return false;
		
	}

}
