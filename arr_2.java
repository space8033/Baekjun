package bj_problem_arr;

import java.util.Scanner;

public class arr_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		int max = 0;
		int N = 0;
		
		for(int i = 0; i <9; i++) {
			a[i] = sc.nextInt();
			
			if(max <= a[i]) {
				max = a[i];
				N = i+1;
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(N);	
		

	}

}
