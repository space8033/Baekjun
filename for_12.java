package bj_problem;

import java.util.Scanner;

public class for_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if ( A == 0 && B == 0) {
				break;
			}
			
			System.out.println(A+B);			
		}
		sc.close();		
	}

}
