package com.q20;

import java.util.Scanner;

public class MaxSum {

	// 10분 소요
	// m의 이하면서 바뀐 ans값보다도 큰 값인지 확인해주자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1;t<=T;t++) {
			
			int n = sc.nextInt();	// 수열의 갯수
			int m = sc.nextInt();	// 비교할 합
			
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int ans = -1;
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(arr[i]+arr[j] <= m && ans < arr[i]+arr[j]) {
						ans = arr[i]+arr[j];
					}
				}
			}
			
			System.out.printf("#%d %d\n", t,ans);
			
		}
		
	}
}
