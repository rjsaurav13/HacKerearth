package javahe;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anagram = 0;
		int d = 0;
		String word1 = scanner.nextLine();
		String word2 = scanner.nextLine();
		int count1 = word1.length();
		int count2 = word2.length();
		int[] count = new int[count1];
		for (int i = 0; i < word1.length(); i++) {
			for(char ch = 'a'; ch <='z';ch++) {
				if(word1.charAt(i)==ch) {
					count[i]=(int)ch;
				}
			}
			
		}
	}

}
