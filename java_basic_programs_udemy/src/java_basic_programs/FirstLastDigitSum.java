package java_basic_programs;



public class FirstLastDigitSum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int a=	sumFirstAndLastDigit(-10);
	System.out.println(a);

	}
	
	public static int sumFirstAndLastDigit(int num)
	{
	
int ld=0;
ld=num%10;
if(num<0)
{
	return -1;
}
//System.out.println(ld);
        while (num >=10) {
            
              
              num=num/10;
        }
    
		
		return num+ld;
		
	}

}
