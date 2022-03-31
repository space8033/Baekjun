package bj_problem;

import java.util.Scanner;

public class str_5 {

	public static void main(String[] args) {
		int[] abc = new int[26];
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		sc.close();
		
		for(int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && 'Z' >= s.charAt(i)) {
				abc[s.charAt(i) - 'A']+= 1;
			} else {
				abc[s.charAt(i) - 'a']+= 1;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int i = 0; i < 26; i++) {
			if (abc[i] > max) {
				max = abc[i];
				ch = (char)(i+65);

			}else if (abc[i] == max) {
				ch = '?';
			
			}
		}
		System.out.print(ch);
	}

}
