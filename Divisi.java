package javahe;

import java.util.*;

public class Divisi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ans = 0 ,num = 0 ;
		String number = "", number1 = "";
		int len = scanner.nextInt();
		for(int i = 0; i < len/2; i++) {
			num = scanner.nextInt();
			number=String.valueOf(num);
			ans = ans*10 + Character.getNumericValue(number.charAt(0));
		}
		for(int i = len/2; i < len; i++) {
			num = scanner.nextInt();
			number = String.valueOf(num);
			ans = ans*10 + Character.getNumericValue(number.charAt(number.length()-1));
		}
		float mod = ans % 11;
		if(mod==0.0) {
			System.out.println("OUI");
		}else {
			System.out.println("NON");
		}
		scanner.close();
	}
}






















/*for (int k = 0; k < (len / 2); k++) {
	int i = scanner.nextInt();
	number=String.valueOf(i);
	ans = (ans * 10) + Character.getNumericValue(number.charAt(0));
}
for (int k = (len / 2); k < len; k++) { 
	int i = scanner.nextInt();
	number=String.valueOf(i);
	ans = (ans * 10) + Character.getNumericValue(number1.charAt(number1.length() - 1));
}
float mod = ans % 11 ;
if (mod == 0) {
	System.out.println("OUI");
} else {
	System.out.println("NON");
}*/