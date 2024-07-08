package com.lao.conditionalStmt;

import java.util.Scanner;

public class IFELSE {
	Boolean coffee;
	IFELSE(Boolean cafe){
		coffee=cafe;
	}
	public void main2() {
		if(coffee.equals(true)) {
			System.out.println("Have it");
		}
		else
		{
			System.out.println("Fill and have it");
		}
	}
	public static void main(String[] args) {
		Scanner bools = new Scanner(System.in);
		Boolean inputs=bools.nextBoolean();
		IFELSE object = new IFELSE(inputs);
		object.main2();
	}

}
