package bj_problem_math2;

import java.util.Scanner;

public class math2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		if(x > w/2) {
			x= w-x;
		}
		if(y > h/2) {
			y= h-y;
		}
		
		if(x>y) {
			System.out.println(y);
		}else {
			System.out.println(x);
			
		}
	}

}
