package javahe;

import java.util.Scanner;

public class Movement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;
		int num = scanner.nextInt();
		int rem=num%5;
		int div=num/5;
		if(rem==0) {
			System.out.println(div);
		}else if(rem != 0) {
			count=count+1;
			System.out.println(div+count);
		}
	}

}
