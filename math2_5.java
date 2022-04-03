package bj_problem_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math2_5 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine());
			if( N == 0) {
				break;
			}
			
			boolean[] a = new boolean[N];
			
			for(int i = 2*N; i > N; i--) {
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i%j == 0) {
						a[i-N-1] = true;
					}
				}
			}
			for(int i = 0; i < N; i++) {
				if(a[i] == false) {
					cnt ++;
				}
			}
			
			System.out.println(cnt);
		}
		
	
	}
	
}
