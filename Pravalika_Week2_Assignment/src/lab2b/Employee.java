package lab2b;
import java.util.Scanner;
public class Employee
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("enter name :");
	String name= sc.nextLine();

	System.out.println("enter age ");
	int age= sc.nextInt();

	System.out.println("enter salary ");
	double salary = sc.nextDouble();

	boolean haserrors=false;

	if(age<0 || age>=120)
	{
		haserrors=true;

	}

	if(name.isBlank())
	{
		System.out.println("name cannot be blank");
		haserrors=true;
	}
	if(salary<=0)
	{
		System.out.println("salary should be greater than zero");
		haserrors=true;
	}

	if(!haserrors)
	{
		System.out.println("input is correct");
	}
	else
	{
		System.out.println("input is not correct");
	}


}
}
