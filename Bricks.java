package javahe;

import java.util.Scanner;

public class Bricks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N, i = 1, j = 2;
		N = scanner.nextInt();
do {
		N = N - i;
		if (N <= 0 || N == 0) {
			System.out.println("patlu");
			break;
		}
		N = N - j;
		if (N <= 0 || N == 0) {
			System.out.println("motu");
			break;
		}
		i += 1;
		j += 2;
}while(N!=0);
		scanner.close();
	}

}
