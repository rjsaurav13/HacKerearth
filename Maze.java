package javahe;

import java.util.Scanner;

public class Maze {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int left=0,right=0,up=0,down=0;
	String dir;
	dir = scanner.nextLine();
	int len = dir.length();
	for(int i=0;i<len;i++) {
		if(dir.charAt(i)=='d'||dir.charAt(i)=='D') {
		down--;
		}
		else if(dir.charAt(i)=='u'||dir.charAt(i)=='U') {
			up++;
			}
		else if(dir.charAt(i)=='l'||dir.charAt(i)=='L') {
			left--;
			}
		else if(dir.charAt(i)=='r'||dir.charAt(i)=='R') {
			right++;
			}
	}
	System.out.println((left+right)+" "+(up+down));
}
}
