package com.d1;

import java.util.Scanner;

public class Qn2071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int arr[] = new int[10];
			
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			
			float sum = 0;
			
			for(int i=0; i<10; i++) {
				sum += arr[i];
			}
			
			System.out.println("#"+test_case + " " + Math.round(sum/10));
			
			//System.out.printf("#%d %.0f\n", test_case,sum/10);
			
		}
	}
}
