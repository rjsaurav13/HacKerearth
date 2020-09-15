package javahe;

import java.util.Scanner;

public class DataBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int table = scanner.nextInt();
		int rows = scanner.nextInt();
		int col = scanner.nextInt();
		String p= "+",n="-",h="|";
		
		String[] rcol = new String[rows]; 
		for (int i = 0; i < table; i++) {
			for (int j = 0; j < rows; j++) {
				rcol[j] = scanner.nextLine();
			}
			
		}

		scanner.close();
	}

}

//for (i = 1; i < arr.length; i++) 
//// if (arr[i] > max)
// max = arr[i];
//System.out.println("+---------+");
//System.out.println("| saurav  |");
//System.out.println("+---------+");
//return max; 
