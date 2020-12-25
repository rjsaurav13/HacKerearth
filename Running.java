package javahe;

import java.util.Scanner;

public class Running {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d, r, x, count = 0;
		float pi=22/7;
		d = scanner.nextInt();
		for (int i = 0; i < d; i++) {
			r = scanner.nextInt();
			x = scanner.nextInt();
			if ((2*22*r/7)<(100*x)) {
				count++;
			}
			
		}
		System.out.println(count);
		scanner.close();
	}
}
