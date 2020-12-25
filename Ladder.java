package javahe;

import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("*   *");
			System.out.println("*   *");

			System.out.println("*****");

		}
		System.out.println("*   *");
		System.out.println("*   *");
		//System.out.println();
		scanner.close();
	}

}
