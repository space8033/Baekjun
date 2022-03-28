package bj_problem_arr;

import java.util.Arrays;
import java.util.Scanner;

public class arr_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		sc.close();
		
		System.out.print(arr[0] + " " + arr[N-1]);
	}

}
