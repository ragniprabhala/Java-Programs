package java_oops_udemy;

public class Customer_main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer firstCustomer= new Customer("puppy",2500,"puppyrag@gmail.com");
		Customer secondcustomer=new Customer();
		
		System.out.println(secondcustomer.getCreditLimit()+"  "+secondcustomer.getName()+" "+secondcustomer.getEmailAdrs());
		//System.out.println(firstCustomer.getCreditLimit()+"  "+firstCustomer.getName()+" "+firstCustomer.getEmailAdrs());

	}

}
