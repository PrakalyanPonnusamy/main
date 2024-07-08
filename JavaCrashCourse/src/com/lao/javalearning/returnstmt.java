package com.lao.javalearning;

public class returnstmt {
	Integer Amount = 10000;
	public Integer Amount() { //if it void it will not return anything, though we used the return it will throw error on void. 
		return Amount; // only if it returned it can used in the main function.

	}
	public static void main(String[] args) {
		returnstmt amount = new returnstmt();
		// we have to store the returned value into something to print the value
		System.out.println(amount.Amount());

	}

}
