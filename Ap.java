package javahe;

import java.util.Scanner;

public class Ap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// int tcase = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (b - a != c - b && b - a > c - b) {
			int div = (b - a) / 2;
			b = b - div;
			if (a < c) {
				a = a + 1;
			} else {
				c = c + 1;

			}
			System.out.println(div + 1);
		} else {
			System.out.println(0);
		}
	}

}
