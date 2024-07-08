package com.la0.abstraction;

public class Class_Abstraction_Benz extends Class_Abstraction_car{
	@Override
	public void year_of_manufacturing() {
		System.out.println("2013");
	}
	@Override
	public void place_of_menufacturing() {
		System.out.println("India");
	}
	public static void main(String[] args) {
		Class_Abstraction_car abstraction_car = new Class_Abstraction_Benz();
		abstraction_car.year_of_manufacturing();
		abstraction_car.place_of_menufacturing();


	}


}
