package com.lao.polymorpism.methodoverloading;

public class Main_Poly {
	public void talk(Parent thewaywetalk) {
		System.out.println("Poliote");
	}
	public void talk(Partner thewaywetalk) {
		System.out.println("Love, Romantic");
	}
	public void talk(Boss thewaywetalk) {
		System.out.println("Just Bussiness");
	}
	public static void main(String[] args) {
		Main_Poly poly = new Main_Poly();
		Parent parent = new Parent();
		Partner partner =  new Partner();
		Boss boss =  new Boss();
		poly.talk(parent);
		parent.main();
		poly.talk(boss);
		poly.talk(partner);
	}

}
