package javahe;

import java.util.Scanner;

public class Nostep {
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
			if (a[i] < b[i]) {
				count = -1;
				break;
			}
			if (a[i] > b[i]) {
				while (a[i] >= a[0]) {
					a[i] = a[i] - b[i];
					count += 1;
				}
				break;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
