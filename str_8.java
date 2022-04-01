package bj_problem;

import java.util.Scanner;

public class str_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'B' ||s.charAt(i) == 'C') {
				cnt += 3;
		
			} else if(s.charAt(i) == 'D' || s.charAt(i) == 'E' ||s.charAt(i) == 'F') {
				cnt += 4;
				
			} else if(s.charAt(i) == 'G' || s.charAt(i) == 'H' ||s.charAt(i) == 'I') {
				cnt += 5;
				
			} else if(s.charAt(i) == 'J' || s.charAt(i) == 'K' ||s.charAt(i) == 'L') {
				cnt += 6;
			
			} else if(s.charAt(i) == 'M' || s.charAt(i) == 'N' ||s.charAt(i) == 'O') {
				cnt += 7;
			
			} else if(s.charAt(i) == 'P' || s.charAt(i) == 'Q' ||s.charAt(i) == 'R'|| s.charAt(i) == 'S') {
				cnt += 8;
		
			} else if(s.charAt(i) == 'T' || s.charAt(i) == 'U' ||s.charAt(i) == 'V') {
				cnt += 9;
			
			} else {
				cnt += 10;
			
			}
		}
		System.out.println(cnt);
		
	}
}
