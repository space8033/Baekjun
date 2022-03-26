package bj_problem;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (A == B && B == C && C == A) {
			System.out.println(10000+A*1000);
		}
		else if (A != B && B != C && C != A) {
			if (A >= B && A >= C) {
				System.out.println(100*A);
			}
			else if (B >= A && B>=C) {
				System.out.println(100*B);
			}
			else {
				System.out.println(100*C);
			}
		}
		else {
			if (A == B) {
				System.out.println(1000+100*A);
			}
			else if (B == C) {
				System.out.println(1000+100*B);
			}
			else {
				System.out.println(1000+100*C);
			}
		}
	}
} 