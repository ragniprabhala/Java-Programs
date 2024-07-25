package java_oops_udemy;

public class BankAccount_Exercise1 

{
	private int accountNumber;
	private double accountBalance;
	private String customerName;
	private String email;
	private String PhoneNum;
	
	

	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}


	public String getCustomerName() {
		
		return customerName;
	}


	public void setCustomerName(String customerName) {
		
		this.customerName = customerName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNum() {
		
		return PhoneNum;
		
	}


	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	
	public void withdrawFunds(double depositamount)
	{
		if(accountBalance>0&&accountBalance>=depositamount)
		{
		accountBalance=	accountBalance-depositamount;
		System.out.println("account balance after withdraw "+accountBalance);
		}
		else {
			System.out.println("insufficient funds");
		}
	}
 public void depositFunds(double addamount)
 
 {
	 accountBalance=accountBalance+addamount;
	 System.out.println("account balance after deposit "+accountBalance);
 }
}
