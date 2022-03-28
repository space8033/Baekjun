package bj_problem_func;

import java.util.Scanner;

public class function_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(getHan(sc.nextInt()));
		sc.close();		
	}

	private static int getHan(int n) {
		int cnt = 0;
		if (n <100) {
			return n;
		}
		else {
			cnt = 99;
			if(n == 1000) {
				n = 999;
			}
		
			for(int i = 100; i<=n; i++) {
				int a = i/100;
				int b = (i/10) % 10;
				int c = i%10;
			
				if ((a-b) == (b-c)) {
					cnt ++;
				}
			}
		}
		return cnt;
	}
}