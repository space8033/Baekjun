package bj_problem;

import java.util.Scanner;

public class str_5 {

	public static void main(String[] args) {
		int[] abc = new int[26];
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		sc.close();
		
		for(int i = 0; i <= s.length(); i++) {
			if ('A' <= s.charAt(i) && 'Z' >= s.charAt(i)) {
				abc[s.charAt(i) - 'A']+= 1;
			} else {
				abc[s.charAt(i) - 'a']+= 1;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int j = 0; j < 26; j++) {
			if (abc[j] > max) {
				max = abc[j];
				ch = (char)(j+65);
			}else if (abc[j] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}

}
