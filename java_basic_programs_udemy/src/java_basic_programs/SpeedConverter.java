package java_basic_programs;

public class SpeedConverter 
{
public static void main(String[] args) 
{
	//long a=toMilesPerHour(10.25);
	//System.out.println(a);
	//printConversion(10.25);
	long m=Math.round(4.88);
	System.out.println(m);
}
	

    
    public static long toMilesPerHour(double KilometersPerHour)
{
	long val=0;
    if(KilometersPerHour<0)
    {
        System.out.println("invalid value");
        
        return -1;
    }
    
    
    else if(KilometersPerHour>0)
    {
        double milesperhour=KilometersPerHour/1.609;
        
      val=  Math.round(milesperhour);
        //System.out.println("positive");
       
    }
	return val;
}
	public static void printConversion(double KilometersPerHour)
	{
		long m=toMilesPerHour(KilometersPerHour);
		if(KilometersPerHour>0)
		{
	  
	  System.out.println(KilometersPerHour+"km/h="+m+"mi/h");
	  
	  
		}
	  
	}

}
	



