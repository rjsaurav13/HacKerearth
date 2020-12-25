package javahe;

import java.util.Scanner;

public class Medicine {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int len = scanner.nextInt();
	    int pgno = scanner.nextInt();
	    if(len <= 23 &&  pgno>=500 && pgno<=1000 ) {
	    	System.out.println("Take Medicine");
	    	
	    }else {
	    	System.out.println("Don't take Medicine");
	    }
	}
}
