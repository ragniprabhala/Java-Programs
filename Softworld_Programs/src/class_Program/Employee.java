package class_Program;

public class Employee
{
private String name="Ragni";
private String id="2454";
private String designation="IT manager";
private double salary=7500.0;


public void employeeDetails()
{
	System.out.println("name - "+name);
	System.out.println("id : "+id);
	System.out.println("designation : "+designation);
	System.out.println("salary "+salary);
}
public double updatesalary(double pay)
{
	double newsalary=this.salary+pay;
	return newsalary;
	
}
}
