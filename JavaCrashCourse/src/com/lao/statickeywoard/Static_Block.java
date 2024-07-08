package com.lao.statickeywoard;

public class Static_Block {
	static {
		System.out.println("This is a static block");
	}
	static {
		System.out.println("we can use multiple static block in a program");
	}
	static {
		System.out.println("This will be executed on priority of all the other");
	}
	public static void main(String[] args) {
		System.out.println("This is main and all the execution will be in the order, i.e, as per written on the code");
	}

}
