package com.lao.statickeywoard;

public class Static_Variable {
	static int Amount = 0;
	public static void main(String[] args) {
		Static_Variable object = new Static_Variable();
		object.Amount=1000;
		Static_Variable object1 = new Static_Variable();
		object1.Amount=2000;
		System.out.println(object.Amount);
		System.out.println(object.Amount);	
	}
}
