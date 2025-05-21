package com.atriaday7;

public class Account {
		private int accNo;
		private String Name;
		private double Balance;
		private Bank bank;
//		public Account(int accNo,String Name,double balance,Bank bank) {
//			super();
//			
//		}
		public Account(int accNo, String name, double balance, Bank bank) {
			super();
			this.accNo = accNo;
			Name = name;
			Balance = balance;
			this.bank = bank;
		}
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getBalance() {
			return Balance;
		}
		public void setBalance(double balance) {
			Balance = balance;
		}
		public Bank getBank() {
			return bank;
		}
		public void setBank(Bank bank) {
			this.bank = bank;
		}
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", Name=" + Name + ", Balance=" + Balance + ", bank=" + bank + "]";
		}
		
		
		
}
