package java_oops_udemy;

public class Point_main {

	public static void main(String[] args) 
	{
		Point point= new Point(6,5);
		Point p=new Point();
		System.out.println(point.distance());
		Point point2 = new Point(3,1);
	System.out.println(point.distance(point2));
	System.out.println(point.distance(2,2));	
System.out.println(p.distance());
	}

}
