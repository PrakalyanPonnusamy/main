package com.lao.ML_Inheritance;

public class ML_Inheritance_1_1 extends ML_Inheritance_1 {
	public void subjects() {
		String Subject1 = "English";
		String Subject2="Tamil";
		System.out.println(Subject1+" "+Subject2);
	}
	public static void main(String[] args) {
		ML_Inheritance_1_1 obj = new ML_Inheritance_1_1();
		obj.subjects();
		obj.RollNumber();
	}

}
