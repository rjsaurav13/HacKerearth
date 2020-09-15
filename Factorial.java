package javahe;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int multi=1;
        for(int i=1;i<=num;i++){
            multi=multi*i;
            
        }
        System.out.println(multi);
	}
	
}
