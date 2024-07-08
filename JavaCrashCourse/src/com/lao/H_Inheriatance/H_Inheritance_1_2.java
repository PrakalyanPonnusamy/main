package com.lao.H_Inheriatance;

public class H_Inheritance_1_2 extends H_Inheritance_1 {
	public void username() {
		String UN = "Jana";
		System.out.println(UN);
	}
	public static void main(String[] args) {
		H_Inheritance_1_2 obj = new H_Inheritance_1_2();
		obj.RollNumber();
		obj.username();
	}

}