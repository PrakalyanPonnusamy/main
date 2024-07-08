package com.lao.constructors;

public class ParametrizedConstructor {
	String name;
	String Sex;

	ParametrizedConstructor(String UN, String sx) {
		name = UN;
		Sex = sx;
		System.out.println("Here we are seeing "+name+" & his gender is "+Sex);
	}
	public void printing() {
		System.out.println("Here we are seeing "+name+" & his gender is "+Sex);
	}
	public static void main(String[] args) {
		ParametrizedConstructor constructor = new ParametrizedConstructor("Jana", "Male");
		constructor.printing();

	}

}
