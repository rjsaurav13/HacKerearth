package javahe;

import java.util.Scanner;

public class Testcase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tcase = scanner.nextInt(); // test cases
		int sum = 0;
		for (int k = 0; k < tcase; k++) {
	
			int gb = 0, pb = 0, num = 0, max = 0, min = 0, count1 = 0, count2 = 0;
			gb = scanner.nextInt(); // cost of green balloon
			pb = scanner.nextInt(); // cost of purple balloon
			num = scanner.nextInt(); // no of participants
			if (gb < pb) {
				max = pb;
				min = gb;
			} else if (gb > pb) {
				max = gb;
				min = pb;
			}else {
				max = gb;
				min = pb;
			}
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < 2; j++) {
					int[][] pos = new int[num][2];
					pos[i][j] = scanner.nextInt();
					for (int r = 0; r < num; r++) {

						if (pos[r][0] == 1) {
							count1++;

						} else if (pos[r][1] == 1) {
							count2++;
						}
						if (count1 < count2) {
							sum = (max * count1 + min * count2);
						} else if (count1 > count2) {
							sum = (min * count1 + max * count2);
						}else if(count1 == count2) {
							sum = (gb * count1 + pb * count2);
						}else if(max==min ){
							sum = (max * count2 + min * count1);
						}

					}
				}
			}
			System.out.println(sum);
			
		}
		
		scanner.close();
	}

}