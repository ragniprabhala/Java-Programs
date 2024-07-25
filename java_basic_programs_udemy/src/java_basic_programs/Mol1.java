package java_basic_programs;

public class Mol1 
{
	
	public static double convertToCentimeters(int hi)
	   {
		
		
		double hcm= hi*2.54;
				
		return hcm;
		   
		  
	   }
	public static double convertToCentimeters(int feet,int inches)
	{
		
		
		int i=12*feet+inches;
		double cm=convertToCentimeters(i);
		
		return cm;
		
	}
   public static void main(String[] args)
   {
	   
	double ans=convertToCentimeters(5,8);
	System.out.println(ans);
}

}
