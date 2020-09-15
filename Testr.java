package javahe;

import java.util.Scanner;

public class Testr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[num];
		int m;
		int sum = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
			sum = sum + arr[i];
			if (i == num) {
				break;
			}
		}

		for (int j = 0; j < num; j++) {

			if ((sum - arr[j]) % 7 == 0) {
				if (arr[j] < arr[j + 1]) {
					m = j;
					System.out.println(m);
					break;
				} else {
					m = j + 1;
					System.out.println(m);
					break;
				}

			}

		}

		scanner.close();
	}

}
