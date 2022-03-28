package bj_problem_arr;

import java.util.Scanner;

public class arr_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			arr[i] = arr[i]%42;
		}
		
		for (int i = 0; i <10; i++) {
			int a = 0;
			for (int j = i+1; j <10; j++) {
				if(arr[i] == arr[j]) {
					a++;	
				}
			}
			
			if(a == 0) {
				cnt ++;
			}
		}
		sc.close();
		System.out.println(cnt);
		
	}

}
