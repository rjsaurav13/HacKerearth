package javahe;

import java.util.Scanner;

public class Lift {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tcase = scanner.nextInt();
		int i = 0, a = 0, b = 7,a1=0,b1=0;
		while (i < tcase) {
			int N = scanner.nextInt();
			a1=Math.abs(N - a);
			b1=Math.abs(N - b);
			if (a1 < b1) {
				System.out.println("A");
				a = N;
			} else if (a1 > b1) {
				System.out.println("B");
				b = N;
			} else if (a1 == b1) {
				if (a > b) {
					System.out.println("B");
					b=N;
				} else {
					System.out.println("A");
					a=N;
				}
			}
			i++;
		}
		scanner.close();
	}
}
