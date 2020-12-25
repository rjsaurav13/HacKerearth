package javahe;

import java.util.Scanner;

public class Test400 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int len = scanner.nextInt();
		int[] a = new int[len];
		int[] b = new int[len];
		for (int i = 0; i < len; i++) {
			a[i] = scanner.nextInt();	
		}
		for (int i = 0; i < len; i++) {

			b[i] = scanner.nextInt();

		}
		for (int i = 0; i < len; i++) {
			while (a[i] >= a[0])
				if (a[i] != a[0]) {
					a[i] = a[i] - b[i];
					count++;
				}
		}
		System.out.println(count);
		scanner.close();
	}
}
