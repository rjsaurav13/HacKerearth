package javahe;

import java.util.Scanner;

public class MinStep {
	public static void main(String[] args) {
		int t, j = 0, count = 0;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		int k = scanner.nextInt();
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			if (k < m) {
				j = k * n;
				count++;
				if (j % 2 == 0) {
					j = j - 1;
					count++;
				} else if (j % 2 != 0) {
					j = j - 2;
					count++;
				}
				j = j * 2;
				count++;

				System.out.println(count);
			} else if (k > m) {

				j = j - 2;
				count = 1 + count++;

				j = j - 1;

				count++;
				if (j != m) {
					j = j - 2;
					count++;
				}
				System.out.println(count);
			}
		}
	}

}