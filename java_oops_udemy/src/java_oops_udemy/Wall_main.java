package java_oops_udemy;

public class Wall_main
{
public static void main(String[] args) 
{
	Wall wall = new Wall(1.125,-1.0);
	System.out.println("area= "+wall.getArea());
	wall.setHeight(-1.5);
	System.out.println(wall.getWidth());
	System.out.println(wall.getHeight());
	System.out.println("area= "+wall.getArea());
	
}
}
