package com.d2;

import java.util.Scanner;

public class Qn1204 {

	// 최빈수 구하기
	
	public static int MAX = 1000;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int t = sc.nextInt();	//test_case
			
			int[] arr = new int[MAX];
			
			for(int i=0;i<MAX;i++) {
				arr[i] = sc.nextInt();
			}
			
			// 비교할 값
			int val = 0;
			// 최고 카운트
			int maxCnt = 0;
			// 비교 변수
			int cnt = 0;
			// 최빈값
			int result = 0;
			for(int i=0;i<MAX;i++) {
				if(arr[i] == -1) continue;
				val = arr[i];
				cnt = 0;
				for(int j=0;j<MAX;j++) {
					if(arr[j]==val) {
						cnt++;
						arr[j] = -1;
					}
				}
				if(maxCnt<cnt) {
					result = val;
					maxCnt = cnt;
				}else if(maxCnt == cnt && result < val) {
					result = val;
					maxCnt = cnt;
				}
			}
			System.out.printf("#%d %d\n", t, result);
			
		}
		
	}
	
}
