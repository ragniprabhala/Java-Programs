package java_oops_udemy;



public class Person
{
private String firstName;
private String lastname;
private int age;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age<0||age>100)
	{
		this.age=0;
		
	}
	else {
		this.age = age;
	}
	
	
	
}
public boolean isTeen()
{
	if(this.age>12&&this.age<20)
	{
		return true;
	}
	else {
		return false;
	}
	
	
}
public String getFullName()
{
	if(this.firstName.isEmpty())
	{
		return this.lastname;
	}
	else if(this.lastname.isEmpty())
	{
		return this.firstName;
	}
	else if(this.firstName.isEmpty()&&this.lastname.isEmpty())
	{
		return "";
	}
	return this.firstName+" "+this.lastname;
	
}

}
