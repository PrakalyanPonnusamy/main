package com.lao.loopingstmt;

public class For_While_Dowhile_USINGMETHODS {
	
	public void forloop() {
		System.out.println("FOR LOOP");
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	public void whileloop() {
		System.out.println("WHILE");
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	public void dowhileloop() {
		System.out.println("DO WHILE");
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
	}
	public static void main(String[] args) {
		For_While_Dowhile_USINGMETHODS object = new For_While_Dowhile_USINGMETHODS();
		object.forloop();
		object.whileloop();
		object.dowhileloop();
	}

}
