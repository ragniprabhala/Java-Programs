package java_oops_udemy;

public class Customer 
{
private String name;
private int creditLimit;
private String emailAdrs;
public String getName() {
	return name;
}
public int getCreditLimit() {
	return creditLimit;
}
public String getEmailAdrs() {
	return emailAdrs;
}
public Customer(String name,int creditLimit,String emailAdrs)
{
	this.name=name;
	this.creditLimit=creditLimit;
	this.emailAdrs=emailAdrs;
	System.out.println(name+ " "+creditLimit+" "+emailAdrs);
	
}
public Customer()
{
	this("ragni","ragniprabhala3@gmail.com");
}
public Customer(String name,String emailAdrs)
{
	
	this(name,2200,emailAdrs);
	//System.out.println("name "+name+ "credit limit: "+creditLimit);
	}

}
