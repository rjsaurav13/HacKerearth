package javahe;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num = 0, ans = 0;
		String number = "";
		int len = scanner.nextInt();
 
		for (int k = 0; k < len / 2; k++) {
			number = scanner.next();
			ans = (ans * 10) + Character.getNumericValue(number.charAt(0));
 
		}
		for (int k = len / 2; k < len; k++) {
			number = scanner.next();
			ans = (ans * 10) + Character.getNumericValue(number.charAt(number.length() - 1));
 
		}
		if (ans % 11 == 0) {
			System.out.println("OUI");
		} else {
			System.out.println("NON");
		}
		scanner.close();
	}
}
