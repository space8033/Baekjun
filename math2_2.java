package bj_problem_math2;

import java.util.Scanner;

public class math2_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int min = 10001;
		int cnt = 0;
		
		for (int i = M; i <= N; i++) {
			cnt = 0;
			
			for(int j =2; j <= i; j++) {
				if(i%j == 0) {
					cnt ++;
				}
			}
			if(cnt == 1) {
				sum += i;
				if(i<min) {
					min = i;
				}
			}
		}
		if (sum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
			
		}
	}
	
}
