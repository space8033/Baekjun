package bj_problem_math1;

import java.util.Scanner;

public class math1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int x = 0;
		sc.close();
		
		while (x < (int)(Math.ceil((V-B)/(A-B)))) {
			x++;

		}
		System.out.println(x);
		
		
	}

}
