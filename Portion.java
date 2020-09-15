package javahe;

import java.util.Scanner;

public class Portion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	long num = scanner.nextLong();
		long sum=0;
		int length = String.valueOf(num).length();
		if(length==10) {
			long[] a= new long[length];
			long[] b= new long[length];
			for(int i =0 ;i<length;i++) {
			 	
			a[i]=num%10;
			num=num/10;
			}
			b[0]=a[0]*10;
			b[1]=a[1]*9;
			b[2]=a[2]*8;
			b[3]=a[3]*7;
			b[4]=a[4]*6;
			b[5]=a[5]*5;
			b[6]=a[6]*4;
			b[7]=a[7]*3;
			b[8]=a[8]*2;
			b[9]=a[9]*1;
			for(int j=0;j<length;j++) {
				sum=sum+b[j];
			}if(sum%11==0) {
				System.out.println("Legal ISBN");
			}else {
			System.out.println("Illegal ISBN");
			}
		}else {
			System.out.println("Illegal ISBN");
		}
	
		scanner.close();
	}
}
