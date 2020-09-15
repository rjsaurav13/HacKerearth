package javahe;


import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char temp;
		String s = scanner.nextLine();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			temp = s.charAt(i);
			if (Character.isLowerCase(temp)) {
				System.out.print(Character.toUpperCase(temp));
			} else if (Character.isUpperCase(temp)) {
				System.out.print(Character.toLowerCase(temp));
			}
		}

	}
}
