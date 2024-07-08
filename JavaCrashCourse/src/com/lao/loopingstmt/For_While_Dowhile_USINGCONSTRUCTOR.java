package com.lao.loopingstmt;
public class For_While_Dowhile_USINGCONSTRUCTOR {
	int jana;
	float lachu;
	For_While_Dowhile_USINGCONSTRUCTOR(){
		System.out.println("FOR LOOP");
		for (int i=jana;i<10;i++) {
			System.out.println(i);}
	}
	For_While_Dowhile_USINGCONSTRUCTOR(int j){
		System.out.println("WHILE LOOP");
		jana = j;
		while(j<20) {
			System.out.println("This is "+ j);
			j++;}
	}
	For_While_Dowhile_USINGCONSTRUCTOR(float k){
		System.out.println("DO WHILE");
		lachu = k;
		do {
			System.out.println(k);
			k++;
		} while (k<5);
	}
	public static void main(String[] args) {
		For_While_Dowhile_USINGCONSTRUCTOR for2 = new For_While_Dowhile_USINGCONSTRUCTOR(1);
		For_While_Dowhile_USINGCONSTRUCTOR for1 = new For_While_Dowhile_USINGCONSTRUCTOR();
		For_While_Dowhile_USINGCONSTRUCTOR for3 = new For_While_Dowhile_USINGCONSTRUCTOR(0.0f);
	
	}
}
