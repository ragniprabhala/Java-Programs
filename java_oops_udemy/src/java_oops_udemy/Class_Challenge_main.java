package java_oops_udemy;

public class Class_Challenge_main 
{
public static void main(String[] args) 
{
	BankAccount_Exercise1 bAccount_Exercise1= new BankAccount_Exercise1();
	bAccount_Exercise1.setAccountBalance(1500);
	bAccount_Exercise1.setAccountNumber(1367891);
	bAccount_Exercise1.setCustomerName("Ragni");
	bAccount_Exercise1.setEmail("ragniprabhala3@gmail.com");
	bAccount_Exercise1.setPhoneNum("2036540969");
System.out.println(bAccount_Exercise1.getCustomerName());
	System.out.println("account balance "+bAccount_Exercise1.getAccountBalance());
	bAccount_Exercise1.depositFunds(600.50);
	bAccount_Exercise1.withdrawFunds(2100.5);
	//System.out.println(" account balance "+bAccount_Exercise1.getAccountBalance());
	System.out.println("account balance "+bAccount_Exercise1.getAccountBalance());
	bAccount_Exercise1.withdrawFunds(200);
}
}
