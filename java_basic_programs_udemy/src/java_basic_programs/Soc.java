package java_basic_programs;



public class Soc {

	public static String getDurationString(int sec)
	{
		int min=sec/60;
		

	    
		
		return getDurationString(min,sec);
		
	}
	
	
	public static String getDurationString(int min,int sec)
	{
		
		int hour=min/60;
		int remainingmins=min%60;
		int remainingsecs=sec%60;
		
		 String durationString = String.format("%02d:%02d:%02d", hour, remainingmins, remainingsecs);
			
			return durationString;
		
	}
	public static void main(String[] args) 
	
	{
		
		String time=getDurationString(3745);
		String time2= getDurationString(65,45);
		System.out.println(time);
		System.out.println(time2);
		
	}

}
