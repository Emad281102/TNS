package com.atriaday7.bank;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank= new BankImpl();
		Account acc=new Account(111,"Emad",20000,bank);
		acc.deposit(2000);
		System.out.println(acc);
		acc.withdraw(1000);
		System.out.println(acc);

	}

}
