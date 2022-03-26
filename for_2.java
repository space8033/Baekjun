package bj_problem;

import java.util.Scanner;

public class for_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int arr[] = new int[C];
		
		for (int i = 0; i<C; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A + B;
		}
		
		sc.close();
		
		for (int j : arr) {
			System.out.println(j);
			
		}
		
		
	}

}
