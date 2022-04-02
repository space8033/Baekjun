package bj_problem_math2;

import java.util.Scanner;

public class math2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		
		boolean[] b = new boolean[N-M+1];
		
		for(int i = M; i <= N; i++) {
			if(i == 1) {
				b[i-M] = true;
			}
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j == 0) {
					b[i-M] = true;
					break;
				}
			}
			if(!b[i-M]) {
				System.out.println(i);
			}
		}
	}

}
