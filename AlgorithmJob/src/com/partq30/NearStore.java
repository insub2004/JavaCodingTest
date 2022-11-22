package com.partq30;

import java.util.Scanner;

public class NearStore {

	// 문제 파악 잘하자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = Math.abs(sc.nextInt());
			}
			
			int min = arr[0];
			int cnt = 0;
			for(int i=0; i<arr.length; i++) {
				if(min > arr[i]) 
					min = arr[i];
			}
			
			for(int i=0; i<arr.length; i++) {
				if(min==arr[i]) cnt++;
			}
			
			System.out.printf("#%d %d %d\n", t,min,cnt);
			
		}
	}
}
