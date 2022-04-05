package bj_problem_repeat;

import java.util.Scanner;

public class repeat_4 {
	
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		hanoi(N,1,3,2);
		
		System.out.println(cnt);
		System.out.println(sb);		
		
	}
	
	public static void hanoi(int n, int start, int end, int sub) {
		if(n == 0) {
			return;
		}else {
			cnt++;
			
			hanoi(n-1, start, sub, end);
			sb.append(start + " " + end + "\n");
			hanoi(n-1, sub, end, start);
			
		}
		
	}

}
