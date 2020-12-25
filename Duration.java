package javahe;

import java.util.Scanner;

public class Duration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int SH, SM, EH, EM, H, M, H1, M1,T;
		T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			SH = scanner.nextInt();
			SM = scanner.nextInt();
			EH = scanner.nextInt();
			EM = scanner.nextInt();
			H = EH - SH;
			M = EM - SM;
			if(M<0) {
				H1=H-1;
				M1=60+M;
				System.out.println(H1+" "+M1);
			}
			else {
			System.out.println(H+" "+M);
			}
		}
		scanner.close();
	}
}
