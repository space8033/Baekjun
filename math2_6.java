package bj_problem_math2;

import java.util.Scanner;

public class math2_6 {
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		get_prime();
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int a = N/2;
			int b = N/2;
			
			while(true) {
				if(prime[a] == false && prime[b] == false) {
					System.out.println(a + " " + b);
					break;
				}
				a--;
				b++;
			}
		}
	}
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i*i; j < prime.length; j+= i) {
				prime[j] = true;
			}
		}
	}
}
