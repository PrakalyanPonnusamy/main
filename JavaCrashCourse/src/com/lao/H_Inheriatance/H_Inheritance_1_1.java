package com.lao.H_Inheriatance;


public class H_Inheritance_1_1 extends H_Inheritance_1 {
	public void subjects() {
		String Subject1 = "English";
		String Subject2="Tamil";
		System.out.println(Subject1+" "+Subject2);
	}
	public static void main(String[] args) {
		H_Inheritance_1_1 obj = new H_Inheritance_1_1();
		obj.subjects();
		obj.RollNumber();
	
	}

}