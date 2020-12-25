package javahe;

import java.util.Scanner;

public class Magic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int j = 0; j < t; j++) {
			int len = scanner.nextInt();
			String[] word = new String[len];
			
			char[] m = new char[len];
			for (int i = 1; i <= len; i	++) {
				word[i] = scanner.next();
				int l = (int)word[i].charAt(i); 
				if (l > 64 && l < 67) {
					l = 67;
				} else if (l >= 68 && l < 71) {
					l = 71;
				} else if (l == 72) {
					l = 73;
				} else if (l >= 74 && l < 79) {
					l = 79;
				} else if (l >= 80 && l < 83) {
					l = 83;
				} else if (l >= 84 && l <= 90) {
					l = 89;
				}
				System.out.print((char) l);
			}
		}
		scanner.close();
	}
}
