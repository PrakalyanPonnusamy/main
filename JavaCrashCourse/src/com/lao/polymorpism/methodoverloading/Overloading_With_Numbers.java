package com.lao.polymorpism.methodoverloading;

public class Overloading_With_Numbers {
public void mains(int a, int b) {
	System.out.println(a+b);
}
public void main(float a, float b) {
	System.out.println(a+b);
}
public void main(int a, int b, int c) {
	System.out.println(a+b+c);
}

public static void main(String args[]) {
	Overloading_With_Numbers  numbers =  new Overloading_With_Numbers();
	numbers.main(10, 20);
	numbers.main(1, 20, 30);
}}
