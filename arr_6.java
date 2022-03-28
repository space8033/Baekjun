package bj_problem_arr;

import java.util.Scanner;

public class arr_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();			
		}
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			int score = 0;
			
		for(int j = 0; j < arr[i].length(); j++) {
			char array[] = arr[i].toCharArray();
			if (array[j] == 'O') {
				score ++;
			} else {
				score = 0;
			}
			sum += score;
		}
		System.out.println(sum);
		}
		
	}

}
