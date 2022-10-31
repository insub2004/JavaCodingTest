package com.doit;

import java.util.Scanner;

public class QN15 {

	public static void main(String[] args) {
	
		// 백준 2750번 수 정렬하기(버블정렬)
		
		// N이 1000까지여서 버블정렬의 시간복잡도 O(n^2)로 풀이 가능
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
