package javahe;

import java.util.Scanner;

public class SplitHouse {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int N,M;
		StringBuilder l;
		N=scanner.nextInt();
		M=N/2;
		String x = "BBH";
		String z="H";
		StringBuilder y = new StringBuilder(String.valueOf(x.charAt(0)));
		if(N>=1&&N<=20) {
			System.out.println("YES");
			if(N%2==0) {//even
				for(int i= 1; i<=M-1; i++) {
				  y.append("B").append(x.charAt(1));
				 }
				System.out.println(y+"B");
			}else {//odd
				for(int i= 2; i<=M; i++) {
					y.append("B").append(x.charAt(1));
					
				}
				System.out.println(y+"BH");
			}
			
			
		}else {
			System.out.println("No");
		}
		
	
		
		
		
		
	}
	
	

}
