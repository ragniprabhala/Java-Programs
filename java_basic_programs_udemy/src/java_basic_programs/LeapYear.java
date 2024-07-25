package java_basic_programs;

public class LeapYear {

	public static void main(String[] args)
	{
		boolean a=isLeapYear(1800);

		System.out.println(a);
		double b=Math.round(3.1756);
		System.out.println(b);
	}
	
	public static boolean isLeapYear(int year)
	 {
	     if(year>=1&&year<=9999)
	     {
	    	 if((year%4==0&&year%100!=0)||(year%400==0))
	    	 {
	    		 return true;
	    	 }
	    	 else
	    	 {
	    		 return false;
	    	 }
	     }
	     else
	     {
	    	 return false;
	     }

}
}

