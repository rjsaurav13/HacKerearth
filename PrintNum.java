package javahe;

import java.util.Scanner;

public class PrintNum {
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        int len = scanner.nextInt();
	        int[] arr = new int[len]; 
	        for(int i = 0; i < len; i++){
	            arr[i] = scanner.nextInt();
	        } 
	        for(int j = 0; j < len; j++){
	            System.out.println(arr[j]+" ");
	        }
	}

}
