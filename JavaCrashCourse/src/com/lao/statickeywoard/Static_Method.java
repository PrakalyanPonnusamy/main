package com.lao.statickeywoard;

public class Static_Method {
	public static void one() {
		System.out.println("This is the example for static method");
	}
	public static void second() {
		System.out.println("This is the example for static that we no need to create an onject to ccall this in main function");
	}
	public static void main(String[] args) {
		one();
		second();
	}

}
