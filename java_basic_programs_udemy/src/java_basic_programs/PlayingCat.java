package java_basic_programs;

public class PlayingCat {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	boolean ans=	isCatPlaying(false, 36);
	System.out.println(ans);

	}
	
	public static boolean isCatPlaying(boolean summer,int temperature)
	
	{
		
	
		 if(summer==true && temperature>=25 && temperature <=45)
		{
			return true;
		}
		
		else if(summer==false && temperature>=25 && temperature<=35 )
		{
			return true;
		}
		else	
		{
			return false;
		}
		


}
}
