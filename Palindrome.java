package javahe;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String name2=name;
		int len = name.length();
		String str = "";
		
		for (int i = len - 1; i >= 0; i--) {
			str = str + name.charAt(i);
			// String str1 = String.valueOf(name2[i]);

		}
		if(name2.equals(str)) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		
		 
	}

}
