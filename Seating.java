package javahe;

import java.util.Scanner;

public class Seating {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int no = scanner.nextInt();
			if (no % 12 == 0) {
				System.out.println(no - 11 + " WS");
			} else if (no % 12 == 1) {
				System.out.println(no + 11 + " WS");
			}
			else if (no % 12 == 11) {
				System.out.println(no - 9 + " MS");
			}
			else if (no % 12 == 2) {
				System.out.println(no +9 + " MS");
			}
			else if (no % 12 == 3) {
				System.out.println(no + 7 + " AS");
			}
			else if (no % 12 == 10) {
				System.out.println(no - 7 + " AS");
			}
			else if (no % 12 == 4) {
				System.out.println(no + 5 + " AS");
			}
			else if (no % 12 == 9) {
				System.out.println(no - 5 + " AS");
			}
			else if (no % 12 == 5) {
				System.out.println(no + 3 + " MS");
			}
			else if (no % 12 == 8) {
				System.out.println(no - 3 + " MS");
			}
			else if (no % 12 == 6) {
				System.out.println(no + 1 + " WS");
			}
			else if (no % 12 == 7) {
				System.out.println(no - 1 + " WS");

			}
		}
		scanner.close();
	}
}
