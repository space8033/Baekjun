package bj_problem_arr;

import java.util.Scanner;

public class arr_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = 0;
		double sum = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			
			if (arr[i] >= max) {
				max = arr[i];
			}	
		}
		sc.close();
		System.out.println((sum/max*100)/N);
		
	}

}
