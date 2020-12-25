package javahe;

import java.util.Scanner;

public class Goki {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len= scanner.nextInt();
		int skl = scanner.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i<len;i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]>=skl) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}

}
