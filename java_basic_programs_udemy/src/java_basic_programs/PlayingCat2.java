package java_basic_programs;

public class PlayingCat2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean ans=isCatPlaying(true,10);
		System.out.println(ans);

	}

	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		
		boolean isplaying=false;
		
		if(summer)
		{
			if(temperature>=25 && temperature<=45)
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
			if(temperature>=25 && temperature<=35)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
