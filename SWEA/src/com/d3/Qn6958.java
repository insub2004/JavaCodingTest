package com.d3;

import java.util.Scanner;

public class Qn6958 {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		

		for (int test_case = 1; test_case <= T; test_case++) {
			
			int cnt = 0;	// 1등 사람 수
			int max = 0;	// 1등이 맞춘 
			int val = 0;	// 한 사람이 맞춘 수
			
			int N = sc.nextInt();	//사람 수
			int M = sc.nextInt();	//문제 수
			
			int arr[][] = new int[N][M];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					val += arr[i][j];
				}
				
				if(max==val)cnt++;
				else if(max<val) {
					cnt = 1;
					max = val;
				}
				
				val = 0;
			}
			
			System.out.printf("#%d %d %d", test_case, cnt, max);
			
		}
	}
}
