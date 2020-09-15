package javahe;

import java.util.Scanner;

public class Life {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num != 42) {
			System.out.println(num);
			num= scanner.nextInt();
		}
		scanner.close();
	}
}
/*int num = 0, count = 0;
int[] arr = new int[10000];
while (num != 42) {
	for (int i = 0; i < 100; i++) {
		arr[i] = scanner.nextInt();
		count++;
		if (arr[i] == 42)
			break;

	}
	for (int j = 0; j < count-1; j++) {
		System.out.println(arr[j]);
	}
*/
