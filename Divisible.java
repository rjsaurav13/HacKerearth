package javahe;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int r = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		for (int i = l; i <= r; i++) {
			if (i % k == 0) {
				count++;

			}

		}
		System.out.print(count);
	}
}
