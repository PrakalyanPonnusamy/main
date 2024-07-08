package com.lao.constructors;

public class NonParametrized {
	
	NonParametrized(){
		String Username = "Jana";
		int EMPId = 2259;
		System.out.println(Username +" AND "+ EMPId);
	}
	public static void main(String[] args) {
		NonParametrized nonParametrized = new NonParametrized();
	}

}
