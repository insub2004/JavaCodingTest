package com.d1;

import java.util.Scanner;

public class Qn2072 {

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
			
			int sum = 0;
			
			for(int i=0; i<10; i++) {
				if(arr[i]%2 != 0) {
					sum+=arr[i];
				}
			}
			System.out.println("#"+test_case+" "+sum);
		}
	}
}
