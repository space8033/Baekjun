package bj_problem_repeat;

import java.util.Scanner;

public class repeat_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int answer = fibo(N);
		
		
		System.out.println(answer);
		
	}
	public static int fibo(int N) {
		if(N == 0) {
			return 0;
		}else if(N == 1) {
			return 1;
		}else {
			return fibo(N-1) + fibo(N-2);
		}
	}
}
