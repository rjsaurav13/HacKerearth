package javahe;

import java.util.*;

public class Divisibility {
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String num = "";
		int no = 0;
		int d = 0;
		int N = scanner.nextInt();
		int sum1 = 0, sum2 = 0;
		int[] n1 = new int[N];
		int[] n2 = new int[N];
		int[] n3 = new int[N];
		int[] n4 = new int[N];
		int[] n5 = new int[N];
		for (int i = 0; i < N; i++) {
			num = scanner.next();
			no = Character.getNumericValue(num.charAt(0));
			n1[i] = no;
		}
		for (int j = 0; j < N / 2; j++) {
			n2[j] = n1[j];
			n4[j] = n2[j];
			// System.out.println(n4[j]);
		}
		int no2 = Integer.parseInt(num);
		for (int k = N / 2; k < N; k++) {
			n3[k] = no2 % 10;
			no2 = no2 / 10;
			n4[k] = n3[k];

			// System.out.println(n4[k]);
		}
		for (int l = 0; l < N; l++) {
			d = n4[l] % 11;

		}
		if (d == 0) {
			System.out.println("OUI");
		} else {
			System.out.println("NON");
		}
		/*
		 * if ((sum1 + sum2) % 11 == 0) { System.out.println("OUI"); } else {
		 * System.out.println("NON"); }
		 */
		scanner.close();
	}

}
