package testing;

import java.util.Scanner;

public class Postive_Negative_Number_Check {
	int number;
	String negative_number="Negative_Number";
	String positive_number = "Positive_Number";
	public Postive_Negative_Number_Check(int num) {
		number = num;
	}
	public String mains() {
		if(number<0)
			return negative_number;
		else
			return positive_number;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mains2 = scanner.nextInt();
		Postive_Negative_Number_Check testing = new Postive_Negative_Number_Check(mains2);
		System.out.println(testing.mains());
	}

}
