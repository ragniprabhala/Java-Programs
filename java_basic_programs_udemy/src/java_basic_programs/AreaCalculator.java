package java_basic_programs;

public class AreaCalculator 
{
public static void main(String[] args) 
{
	double area=area(5);
	double area2=area(5.6);
	System.out.println(area);
}

public static double area(double radius)
{
    
    if(radius>0)
    {
    double a=radius*radius*Math.PI;
	return a;
	
}
    else
    {
    	return -1.0;
    }
}

public static double area(double x, double y)
{
	if(x>0||y>0)
	{
		return x*y;
	}
	else
	{
		return -1.0;
	}
	
}
}