package bj_problem_math1;

import java.math.BigInteger;
import java.util.Scanner;

public class math1_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		BigInteger sum = A.add(B);
		sc.close();
		
		System.out.println(sum.toString());
		
	}

}
