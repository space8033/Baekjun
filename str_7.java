package bj_problem;

import java.util.Scanner;

public class str_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A/100 + ((A%100)/10)*10 + (A%10)*100 >= B/100 + ((B%100)/10)*10 + (B%10)*100) {
			System.out.println(A/100 + ((A%100)/10)*10 + (A%10)*100);
			
		} else {
			System.out.println(B/100 + ((B%100)/10)*10 + (B%10)*100);
			
		}
	
	}

}
