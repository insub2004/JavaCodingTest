package com.partq30;

import java.util.Scanner;

public class DateCnt02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int arr[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int t=1; t<=T; t++) {
			
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			
			// m월 d일을 -> d+=m 해서 day로 합쳐버리자
			for(int i=1; i<m1; i++) {
				d1 += arr[i];
			}
			for(int i=1; i<m2; i++) {
				d2 += arr[i];
			}
			
			System.out.printf("#%d %d\n", t, d2-d1+1);
			
		}
		
	}
}
