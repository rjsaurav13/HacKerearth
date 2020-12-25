package javahe;

import java.util.Scanner;

public class Teddy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name.length());
		
		scanner.close();
	}

}
