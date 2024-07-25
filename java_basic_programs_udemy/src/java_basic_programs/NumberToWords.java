package java_basic_programs;



public class NumberToWords {

	public static void main(String[] args) 
	{
		numberToWords(-222);
	
		
	}
public static void numberToWords(int num)
{
	int revnum=	reverse(num);
	
	if(num<0)
	{
		System.out.println("Invalid Value");
	}
	else if(num==0)
	{
		System.out.println("Zero");
	}
	else 
		{
	
	int originalDigitCount = getDigitCount(num);
    int reversedDigitCount = getDigitCount(revnum);
	int digit=0;
	while(revnum!=0)
	{
	
		digit=revnum%10;
		
		if (digit == 0) {
	        System.out.println("Zero");
	    } else if (digit == 1) {
	        System.out.println("One");
	    } else if (digit == 2) {
	        System.out.println("Two");
	    } else if (digit == 3) {
	        System.out.println("Three");
	    } else if (digit == 4) {
	        System.out.println("Four");
	    } else if (digit == 5) {
	        System.out.println("Five");
	    } else if (digit == 6) {
	        System.out.println("Six");
	    } else if (digit == 7) {
	        System.out.println("Seven");
	    } else if (digit == 8) {
	        System.out.println("Eight");
	    } else if (digit == 9) {
	        System.out.println("Nine");
	    } else {
	        System.out.println("Invalid digit");
	    }
		revnum=revnum/10;
		
		
	}
	for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
        System.out.println("Zero");
    }
	
		}
}
public static int reverse(int num)
{
	int ld=0;
	int sum =0;
	while(num!=0)
	{
		ld=num%10;
	//System.out.print(ld);
	sum=sum*10+ld;
	
	
		num=num/10;
		
	}
	return sum ;
	
}
public static int getDigitCount(int num)
{
	
	if (num < 0) {
        return -1;
    }

    if (num == 0) {
        return 1;
    }
	int ld=0;
	int count=0;
	while(num!=0)
	{
		
		num=num/10;
		count++;
	}
	return count;
}

	
}

