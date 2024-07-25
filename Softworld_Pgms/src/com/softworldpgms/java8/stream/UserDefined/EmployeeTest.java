package com.softworldpgms.java8.stream.UserDefined;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest 
{

	public static void main(String[] args)
	{
		Employee e1= new Employee(1,"ragni", 40000, "Hr department");
		Employee e2= new Employee(2,"abc", 25000, "marketing department");
		Employee e3= new Employee(7,"xyz", 45000, "sales department");
		Employee e4= new Employee(4,"rty", 30000, "marketing department");
		Employee e5= new Employee(6,"ram", 15000, "finance department");
		Employee e6= new Employee(10,"Sita", 65000, "marketing department");
		
	List<Employee> employee= Arrays.asList(e1,e2,e3,e4,e5,e6);
	System.out.println("Salaries of the employees greater than 30k");
	employee.stream().filter(emp->emp.getSalary()>30000).forEach(emp->System.out.println(emp.getName()));
	System.out.println("employees from marketing Department");
	employee.stream().filter(emp->emp.getDept()=="marketing department").forEach(emp->System.out.println(emp.getName()));
	
	
		
		
	}
}
