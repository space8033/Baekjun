package bj_problem;

import java.util.Scanner;

public class str_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		sc.close();
		
		for(int i = 0; i< s.length(); i++) {
			
			if(s.charAt(i) == 'c' && i< s.length() -1) {
				if(s.charAt(i+1) == '=') {
					i++;
				} else if(s.charAt(i+1) == '-') {
					i++;
				}
			}else if(s.charAt(i) == 'd') {
				if(i< s.length() -2 && s.charAt(i+1) == 'z'&& s.charAt(i+2) == '=') {
					i += 2;
				}else if(i< s.length() -1 && s.charAt(i+1) == '-') {
					i++;
				}
			}else if(s.charAt(i) == 'l'&& i< s.length() -1) {
				if(s.charAt(i+1) == 'j') {
					i++;
				}
			}else if(s.charAt(i) == 'n'&& i< s.length() -1){
				if(s.charAt(i+1) == 'j') {
					i++;
				}
			}else if(s.charAt(i) == 's'&& i< s.length() -1) {
				if(s.charAt(i+1) == '=') {
					i++;
				}
			}else if(s.charAt(i) == 'z'&& i< s.length() -1) {
				if(s.charAt(i+1) == '=') {
					i++;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
