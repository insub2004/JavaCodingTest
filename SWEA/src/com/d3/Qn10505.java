package com.d3;

import java.util.Scanner;

public class Qn10505 {

	//¼Òµæ ºÒ±ÕÇü
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int N = sc.nextInt();	//ÃµÃ¼ ÀÎ¿ø
			
			int[] arr = new int[N];
			
			int sum = 0;
			int cnt = 0;
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			for(int i=0; i<N; i++) {
				if(arr[i]<=sum/N) cnt++;
			}
			
			System.out.printf("#%d %d\n", test_case,cnt);
			
		}
		
		
		
	}
}
