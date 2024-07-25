package java_basic_programs;

public class SharedDigit {

	public static void main(String[] args) 
	{
	hasSharedDigit(12,43);
	
		
	}
	public static boolean hasSharedDigit(int n1,int n2)
	{
		int ld=0;
		int ld1=0;
		if(n1>=10&&n2<=99 && n1<=99 && n2>=10)
		{
			
			
				//System.out.println("hi");
				ld=n1%10;
				ld1=n2%10;
				n1=n1/10;
				n2=n2/10;
				
				return ((n1==n2)||(n1==ld1)||(ld==n2)||(ld==ld1));
				
			
		}
		
		return false;
		
		
		
		
		
		
	}

}
