package com.lao.javalearning;

public class BankAccount {
	Long accountnumber = 9842241585l;
	Integer bankbalance = 700;
	String holdername = "janagarathinam";
	
	public void Balanace() {
		System.out.println("The balance is "+bankbalance);
	}
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.Balanace();
		
	}

}
