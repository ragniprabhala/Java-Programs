package com.softworldpgms.customexceptions;

public class BankAccountMain 
{
	public static void main(String[] args)
	{
		BankAccount bankAccount = new BankAccount(2000);
		try {
			bankAccount.withdraw(2500);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current balance: $" + bankAccount.getBalance());
	}

}
