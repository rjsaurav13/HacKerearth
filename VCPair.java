package javahe;

import java.util.Scanner;

public class VCPair {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word2 = "", word1 = "";
		int tcase = scanner.nextInt();
		for (int j = 0; j < tcase; j++) {
			int count1 = 0, len = 0;
			len = scanner.nextInt();
			word1 = scanner.next();
			word2 = word1.substring(0, len);
			for (int a = 0; a < len; a++) {
				for (int b = a + 1; b < len; b++) {
					if ((word2.charAt(a) == 'a' || word2.charAt(a) == 'e' || word2.charAt(a) == 'i'
							|| word2.charAt(a) == 'o' || word2.charAt(a) == 'u'))
							if (word2.charAt(b) != 'a' && word2.charAt(b) != 'e' && word2.charAt(b) != 'i'
									&& word2.charAt(b) != 'o' && word2.charAt(b) != 'u') {
						count1++;
					}

				}
			}
			System.out.println(count1);
		}
		
		scanner.close();
	}
}

/*
 * if ( word2.charAt(a) != 'a' || word2.charAt(a) != 'e' || word2.charAt(a) !=
 * 'i' || word2.charAt(a) != 'o' || word2.charAt(a) != 'u') { count2++; }
 * 
 * else if (a % 2 != 0 || word2.charAt(a) == 'a' || word2.charAt(a) == 'e' ||
 * word2.charAt(a) == 'i' || word2.charAt(a) == 'o' || word2.charAt(a) == 'u') {
 * 
 * count1++;
 */

/*
 * if (word2.charAt(a) != 'a' || word2.charAt(a) != 'e' || a % 2 == 0 ||
 * word2.charAt(a) != 'i' || word2.charAt(a) != 'o' || word2.charAt(a) != 'u') {
 * count2++; } if (b % 2 != 0 || word2.charAt(b) == 'a' || word2.charAt(b) ==
 * 'e' || word2.charAt(b) == 'i' || word2.charAt(b) == 'o' || word2.charAt(b) ==
 * 'u') { count1++; }
 */