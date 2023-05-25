package com.d3;

import java.util.Scanner;

public class Qn6730 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int N = sc.nextInt();
			
			int max = 0;
			int min = 0;
			
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<N-1; i++) {
				if(arr[i]<=arr[i+1]) {
					if(max<arr[i+1]-arr[i]) max = arr[i+1]-arr[i];
				}
				else if(arr[i]>arr[i+1]){
					if(min>arr[i+1]-arr[i]) min = arr[i+1]-arr[i];
				}
			}
			
			System.out.printf("#%d %d %d\n", test_case,max, min*-1);
			
		}
		
	}
}
