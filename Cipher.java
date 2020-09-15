package javahe;

import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int num = scanner.nextInt();
		int[] n1 = new int[n.length()];
		int i = 0;
		for (i = 0; i <= n.length(); i++) {
			char[] n2 = new char[n.length()];
			try {
				if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z') {
					if (((int) n.charAt(i) + num) > 90) {

						n1[i] = ((int) n.charAt(i) + num - 65) % 26 + 65;
						n2[i] = (char) n1[i];
					} else if (((int) n.charAt(i) + num) <= 90) {
						n1[i] = (int) n.charAt(i) + num;
						n2[i] = (char) n1[i];
					}
				} else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z') {
					if (((int) n.charAt(i) + num) > 122) {
						n1[i] = ((int) n.charAt(i) + num - 97) % 26 + 97;
						n2[i] = (char) n1[i];
					} else if (((int) n.charAt(i) + num) <= 122) {
						n1[i] = (int) n.charAt(i) + num;
						n2[i] = (char) n1[i];
					}
				} else if ((int) n.charAt(i) >= 48 && (int) n.charAt(i) <= 57) {
					if (((int) n.charAt(i) + num) > 57) {
						n1[i] = ((int) n.charAt(i) + num - 48) % 10 + 48;
						n2[i] = (char) n1[i];
					} else if (((int) n.charAt(i) + num) <= 57) {
						n1[i] = (int) n.charAt(i) + num;
						n2[i] = (char) n1[i];
					}
				} else {
					n2[i] = n.charAt(i);
				}
				System.out.print(n2[i]);

			} catch (StringIndexOutOfBoundsException e) {
				System.out.println();
			}

		}

		scanner.close();
	}

}
