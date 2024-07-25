package java_basic_programs;

public class Barking_dog 
{
public static void main(String[] args)
{
	boolean a=shouldWakeUp(true,0);
	System.out.println(a);
	
}



public static boolean shouldWakeUp(boolean barking ,int hourOfDay )
{
    if(barking ==true&& hourOfDay<8&&hourOfDay>=0||hourOfDay==23)
    {
     return true;   
    }
    else 
    {
    	return false;
    }
}
}
