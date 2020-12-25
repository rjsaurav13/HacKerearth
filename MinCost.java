package javahe;

import java.util.Scanner;

public class MinCost {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int j = 1; j <= N; j++) {
			arr[1] = arr[1] - j;
			arr[j] = arr[j] - arr[1];
			System.out.println(arr[1] + " " + arr[2] + " " + arr[3]);
		}

		scanner.close();
	}
}
