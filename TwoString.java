package javahe;

import java.util.Arrays;
import java.util.Scanner;

public class TwoString {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.next());
		String d1 = "";
		String d2 = "";
			
		for (int i = 0; i < t; i++) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			
			char[] ns1 = new char[s1.length()];
			char[] ns2 = new char[s2.length()];
			ns1 = s1.toCharArray();
			ns2 = s2.toCharArray();	
			Arrays.sort(ns1);
			Arrays.sort(ns2);
			d1 = String.valueOf(ns1);
			d2= String.valueOf(ns2);
			if(d1.equals(d2)) {
				System.out.println("YES");
		
			}else {
				System.out.println("NO");
				
			}
			
		}
		scanner.close();
	}
}
