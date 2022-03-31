package bj_problem_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math1_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		
		int temp = (V-A)/(A-B);

		if ((V-A)%(A-B) == 0) {
			System.out.println(temp+1);		
		} else {
			System.out.println(temp+2);					
		}
		
		
	}

}
