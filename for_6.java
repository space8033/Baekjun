package bj_problem;

import java.util.Scanner;

public class for_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i = N; i >= 1; i--) {
			System.out.println(i);		
		}
	}
}
