package bj_problem_math1;

import java.util.Scanner;

public class math1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		int sum = 1;
		int b = 0;
		
		sc.close();
		
		while(N>sum) {
			a++;
			b += 6;
			sum += b;
			
		}
		
		System.out.println(a);
		
	}

}
