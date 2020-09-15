package javahe;

import java.util.Scanner;

public class Help {
	public static void main(String[] args) {
		int num = 0;
		char c1;
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		if (name.charAt(2) == 'A' || name.charAt(2) == 'E' || name.charAt(2) == 'I' || name.charAt(2) == 'O'
				|| name.charAt(2) == 'U' || name.charAt(2) == 'Y') {
			System.out.println("INVALID");
		
		}
		else if((Character.getNumericValue(name.charAt(0))+Character.getNumericValue(name.charAt(1)))%2==0&&
				(Character.getNumericValue(name.charAt(3))+Character.getNumericValue(name.charAt(4)))%2==0&&
				(Character.getNumericValue(name.charAt(4))+Character.getNumericValue(name.charAt(5)))%2==0&&
				(Character.getNumericValue(name.charAt(7))+Character.getNumericValue(name.charAt(8)))%2==0) {
			System.out.println("VALID");
		} else

			System.out.println("INVALID");
	}

}

