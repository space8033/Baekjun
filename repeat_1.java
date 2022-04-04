package bj_problem_repeat;

import java.util.Scanner;

public class repeat_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int answer = factorial(N);
		System.out.println(answer);
		
	}
	
	public static int factorial(int N) {
		if(N <= 1) {
			return 1;
		}else {
			return N*factorial(N-1);
		}
	}

}
