package javahe;

import java.util.Scanner;

public class ItsMagic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int min = 0, count = 0, pos = 0;
		int[] arr = new int[num];
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
				count++;
			}
			int[] arr1 = new int[count];

			for (int l = 0; l < arr1.length; l++) {
				if ((sum - arr[l]) % 7 == 0) {
					arr1[l] = arr[l];
				}
				int k = 0;
				while (k<arr1.length) {
					min = arr1[0];
				if (arr1[l] < min) {
					min = arr1[l];
				}
				}
			}
			if (min == arr[j]) {
				pos = j;
			}
		}

		System.out.println(pos);
		scanner.close();

	}
}