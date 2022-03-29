package bj_problem;

import java.util.Scanner;

public class str_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		String num = new String();
		
		num = sc.next();
		sc.close();
		char numarr[] = num.toCharArray();
		
		for (int i = 0; i<numarr.length; i++) {
			sum += (numarr[i]-48);
			
		}
		
		System.out.println(sum);
	}

}
