package com.lao.constructors;

public class ConstructorOverloading {
	int size;
	String type;
ConstructorOverloading(){
	System.out.println("This is Parametrized constructor");
}
ConstructorOverloading(int totaldimension){
	size = totaldimension;
	System.out.println("This is nonn Parameterized constructor so it has the size of "+size);
}
ConstructorOverloading(String type2){
	type = type2;
	System.out.println("This is type 2 "+type);
}
	public static void main(String[] args) {
		ConstructorOverloading constructorOverloading = new ConstructorOverloading();
		ConstructorOverloading constructorOverloading2 = new ConstructorOverloading(20);
		ConstructorOverloading constructorOverloading3 = new ConstructorOverloading("COn3");
		
	}

}
