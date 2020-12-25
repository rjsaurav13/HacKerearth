package javahe;

import java.util.Scanner;

public class Relationship {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k = 0;k<t;k++) {
		int n = scanner.nextInt();
		int n1 = 2 * n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n1; j++) {
				if (j<= i || j >n1- i) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			
			System.out.println();
		}
		}
	}
}
