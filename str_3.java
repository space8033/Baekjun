package bj_problem;

import java.util.Scanner;

public class str_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(S.indexOf(i) + " ");
		}
		
	}

}
