package bj_problem_arr;

import java.util.Scanner;

public class arr_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int[] arr;
		
		for(int i = 0; i < C ; i++) {
			int n = sc.nextInt();
				arr = new int[n];
				double sum = 0;
				
				for(int j = 0; j<n; j++) {
					int score = sc.nextInt();
					arr[j] = score;
					sum += score;
				}
				double avg = sum/n;
				double cnt = 0;
				
				for(int j =0; j<n; j++) {
					if(arr[j] > avg) {
						cnt ++;
					}
				}
				System.out.printf("%.3f%%\n", (cnt/n)*100);
		}
		
		
	}

}
