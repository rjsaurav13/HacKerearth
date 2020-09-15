package javahe;

import java.util.Scanner;

public class CharSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int t = scanner.nextInt();
		for (int j = 0; j < t; j++) {
			String name = scanner.nextLine();
			int[] a = new int[name.length()];
			for (int i = 0; i < name.length(); i++) {
				for (char ch = 'a'; ch <= 'z'; ch++) {
					a[i] = (int) name.charAt(i) - 96;

				}
				sum = sum + a[i];
			}
			System.out.println(sum);
		}
	}
}
