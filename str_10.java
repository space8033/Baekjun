// 너무 어렵다 더배우고 다시풀어보자
package bj_problem;

import java.util.Scanner;

public class str_10 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			if(check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);	
	}
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int p = 0;
		String s = sc.next();
		
		for(int i = 0; i<s.length(); i++) {
			int now = s.charAt(i);
			
			if(p != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					p = now;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		return true;
	}
}

