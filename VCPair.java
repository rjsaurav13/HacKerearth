package javahe;

import java.util.Scanner;

public class VCPair {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tcase = scanner.nextInt();
		for (int j = 0; j < tcase; j++) {
			int count = 0, len = 0;
			len = scanner.nextInt();
			String word = scanner.next();
			for(int i =0;i<len-1;i++){
    if((word.charAt(i)!='a'&& word.charAt(i)!='e'&&word.charAt(i)!='i'&&word.charAt(i)!='o'&&word.charAt(i)!='u')&&(word.charAt(i+1)=='a'||word.charAt(i+1)=='e'||word.charAt(i+1)=='i'||word.charAt(i+1)=='o'||word.charAt(i+1)=='u'))

    {

        count++;

    }
    }
			System.out.println(count);
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
