package bj_problem_math2;

import java.util.Scanner;

public class math2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < N; i ++) {
			
			int a = sc.nextInt();
			boolean jud = true;
			
			if( a == 1) {
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(a); j++) {
				if(a % j == 0) {
					jud = false;
					break;
				}
			}
			
			if(jud) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
