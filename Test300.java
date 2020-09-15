package javahe;

import java.util.Scanner;

public class Test300 {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
			int num1 = 0, num = 0;
			String number = "";
			int len = scanner.nextInt();
			int ans = 0;
			for (int i = 0; i < len / 2; i++) {
				number = scanner.next();
				if (number.length() == 1) {
					ans = Integer.parseInt(number);
				} else {
					num = Character.getNumericValue(number.charAt(0));
					ans = (ans * 10) + num;
				}
			}
			for (int k = len / 2; k < len; k++) {
				number = scanner.next();
				if (number.length() == 1) {
					ans = Integer.parseInt(number);
				} else {
					num1 = Character.getNumericValue(number.charAt(number.length() - 1));
					ans = (ans * 10) + num1;
				}
			}
			if (ans % 11 == 0) {
				System.out.println("OUI");
			} else {
				System.out.println("NON");
			}

			scanner.close();

	}
}
