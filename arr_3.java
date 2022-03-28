package bj_problem_arr;

import java.util.Scanner;

public class arr_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int value = A * B * C;
		
		int[] arr = new int[10];
		
		sc.close();
		
		while(value != 0) {
			arr[value%10]++;
			value = value/10;
		}
		
	
		for (int j : arr) {
			System.out.println(j);
		}
		
		
	}

}
