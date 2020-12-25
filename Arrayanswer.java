package javahe;

import java.util.Scanner;

public class Arrayanswer {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 double answer=1;
	    int len = scanner.nextInt();
	    int[] arra=new int[len];
	    for(int i = 0; i < len; i++){
	        arra[i]=scanner.nextInt();
	        answer = (answer * arra[i]) % (Math.pow(10,9)+7);
	        }
	    System.out.println(answer);
}
}
