package javahe;

import java.util.Scanner;

public class Sdisplay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int m = 0; m < t; m++) {
			int cal = 0;
			String digit = scanner.next();
			for (int k = 0; k < digit.length(); k++) {
				int d = Character.getNumericValue(digit.charAt(k));
				switch (d) {
				case 0:
					cal += 6;
					break;
				case 1:
					cal += 2;
					break;
				case 2:
					cal += 5;
					break;
				case 3:
					cal += 5;
					break;
				case 4:
					cal += 4;
					break;
				case 5:
					cal += 5;
					break;
				case 6:
					cal += 6;
					break;
				case 7:
					cal += 3;
					break;
				case 8:
					cal += 7;
					break;
				case 9:
					cal += 6;
					break;
				}
			}
				if (cal % 2 != 0) {
					System.out.print("7");
					for (int k = 0; k < (cal / 2) - 1; k++) {
						System.out.print("1");
					}
				} else if (cal % 2 == 0) {
					for (int k = 0; k < cal / 2; k++) {
						System.out.print("1");
					}
				}
				System.out.println();
			}
		
		scanner.close();
	}
}
