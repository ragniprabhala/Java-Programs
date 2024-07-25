package com.softworldpgms.customexceptions;

public class BankAccount 
{
private double balance;
public BankAccount(double balance)
{
		this.balance=balance;
	
}
public void withdraw(double amount) throws InsufficientFundsException
{
	if(amount>balance)
	{
		throw new InsufficientFundsException("Insufficient funds to withdraw $\" + amount");
	}
	
	balance -= amount;
    System.out.println("$" + amount + " withdrawn successfully.");
    
}
public double getBalance() {
    return balance;
}
}
