package com.lao.polymorpism.methodoverriding;

public class Child_class extends Parent_class{

	@Override
	public void marryher() {
		System.out.println("If i like her i will marry her");
	}
	public static void main(String[] args) {
		Parent_class class1 =  new Child_class();
		class1.marriage();
		class1.marryher();
	}

}
