package bj_problem_math2;

import java.util.Scanner;

public class math2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N == 1) {
		} else {
			for(int j = 2; j < 10000000; j++) {
				for(int i = 2; i < 10000000; i++) {
					if(N%i == 0) {
						N = N/i;
						System.out.println(i);
						break;
					}
				}
				if(N == 1) {
					break;
				}
			}
		}
	}

}
