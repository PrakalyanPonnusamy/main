package com.lao.ML_Inheritance;

public class ML_Inheritance_1_2 extends ML_Inheritance_1_1 {
	public void username() {
		String UN = "Jana";
		System.out.println(UN);
	}
	public static void main(String[] args) {
		ML_Inheritance_1_2 obj = new ML_Inheritance_1_2();
		obj.RollNumber();
		obj.username();
		obj.subjects();
	}

}
