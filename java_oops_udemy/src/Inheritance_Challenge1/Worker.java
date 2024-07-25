package Inheritance_Challenge1;

public class Worker 
{
private String name;
private String birthDate;
protected String endDate;
public Worker()
{
	
}
public Worker(String name, String birthDate) {
	super();
	this.name = name;
	this.birthDate = birthDate;
	
}
public int getAge()
{
	int currentYear=2024;
	int birthYear=Integer.parseInt(birthDate.substring(6));
return currentYear-birthYear;
}
public double collectPay()
{
	System.out.println("pay collected");
	return 0.0;
}
public void terminate(String endDate)
{
	this.endDate=endDate;
	  
}
@Override
public String toString() {
	return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + ", getAge()=" + getAge()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
class Employee extends Worker
{

private long employeeId;
private String hireDate;
private static int employeeNo=1;
public Employee(String name, String birthDate,String hireDate) 
{
	super(name, birthDate);
	this.employeeId=Employee.employeeNo++;
	this.hireDate=hireDate;
	// TODO Auto-generated constructor stub
}

}
class SalariedEmployee extends Employee
{
	private double annualSalary;
	private boolean isRetired;
	

	public SalariedEmployee(String name, String birthDate, String hireDate,double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary=annualSalary;
		
	}
	
	@Override
	public double collectPay()
	{
		double paycheck=annualSalary/26;
	double adjustedPay=(isRetired) ?0.9*paycheck: paycheck;
		return (int) adjustedPay;
	}
	public void retire()
	{
		terminate("12/12/2025");
		isRetired=true;
		 
	}
}

