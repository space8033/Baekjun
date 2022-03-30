package bj_problem_math1;

import java.util.Scanner;

public class math1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int a = 0;
		int b = 0;
		
		while(sum < X){
			b = sum;
			sum += a;
			a++;
		}
		X -= b;
		
		if ( a%2 == 0) {
			System.out.print(a-X);
			System.out.print("/");
			System.out.print(X);
		} else {
			System.out.print(X);
			System.out.print("/");
			System.out.print(a-X);
		}
		
	}

}
