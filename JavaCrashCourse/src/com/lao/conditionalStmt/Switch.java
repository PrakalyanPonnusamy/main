package com.lao.conditionalStmt;

public class Switch {
	String name;
	public Switch(String username) {
		name = username;
	}
	public void mains() {
		switch(name) {
		case "praveen":
			System.out.println("This is Praveen");
			break;
		case "jana":
			System.out.println("This is jana");
			break;
		case "rahul":
			System.out.println("This is Rahul");
			break;
		default:
			System.out.println(name + "you're not in the list please check with the admin");

		}
	}
	public static void main(String[] args) {
		Switch switch1 = new Switch("jana");
		switch1.mains();
	}

}
