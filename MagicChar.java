package javahe;

import java.util.Scanner;

public class MagicChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = "";
		int t = scanner.nextInt();
		for (int j = 0; j < t; j++) {
			int len = scanner.nextInt();
			int[] m = new int[len];
			word = scanner.next();
			for (int i = 0; i < word.length(); i++) {
				m[i] = (int) word.charAt(i);
				if (m[i] >= 65 && m[i] < 70) {
					m[i] = 67;
				} else if (m[i] >= 70 && m[i] < 73) {
					m[i] = 71;
				} else if (m[i] >= 73 && m[i] < 77) {
					m[i] = 73;
				} else if (m[i] > 76 && m[i] < 82) {
					m[i] = 79;
				} else if (m[i] >= 82 && m[i] < 87) {
					m[i] = 83;
				} else if (m[i] >= 87 && m[i] <= 90) {
					m[i] = 89;
				}

				else if (m[i] > 97 && m[i] <= 99) {
					m[i] = 97;
				} else if (m[i] >= 100 && m[i] < 103) {
					m[i] = 101;
				} else if (m[i] >= 104 && m[i] < 106) {
					m[i] = 103;
				} else if (m[i] >= 106 && m[i] < 109) {
					m[i] = 107;
				} else if (m[i] >= 109 && m[i] < 112) {
					m[i] = 109;
				} else if (m[i] >= 112 && m[i] < 123) {
					m[i] = 113;
				} else if (m[i] >= 33 && m[i] <= 64) {
					m[i] = 67;
				} else if (m[i] >= 91 && m[i] <= 93) {
					m[i] = 89;
				} else if (m[i] >= 94 && m[i] <= 96) {
					m[i] = 97;
				} else if (m[i] >= 123 && m[i] <= 127) {
					m[i] = 113;
				}
			}

			for (int d = 0; d < word.length(); d++) {
				System.out.print((char) m[d]);

			}
			System.out.println();
		}
		scanner.close();
	}

}
