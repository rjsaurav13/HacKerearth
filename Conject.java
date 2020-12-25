package javahe;

import java.util.Scanner;

public class Conject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long N = 0;
		for (int i = 0; i < t; i++) {
			N = scanner.nextLong();
			do {
				if (N % 2 != 0) {
					N = 3 * N + 1;
				}
				else if(N%2==0) {
					N=N/2;
				}
				if(N==1) {
					System.out.println("NO");
					break;
				}else {
					System.out.println("YES");
					break;
				}
			} while (N >= 1);
		}
		scanner.close();

	}
}
