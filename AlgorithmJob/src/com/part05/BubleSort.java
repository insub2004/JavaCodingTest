package com.part05;

import java.util.Scanner;

public class BubleSort {

	public static void main(String[] args) {
		
		/*
		 * 버블정렬
		 * (오름차순 기준)
		 * 
		 * N개면 N번 탐색	O(n^2)
		 * 
		 * 탐색부분 제일 마지막부터 정렬된 부분(S)이라고 생각하고
		 * 맨 앞부터 2자리 숫자를 S까지 비교하면서 큰 수를 뒤쪽으로 swap하고
		 * S까지 swap을 완료하면 S를 한칸 앞으로 당긴다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {			// n일 때랑 n-1일 때랑 무슨차이일까
			for(int j=0; j<n-1-i;j++) {		// n-1-i자체가 정렬된 부분까지 반복할 수 있게 해준다.
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			for(int p=0; p<n; p++) {
				System.out.printf("%d ", arr[p]);
			}
			System.out.println();
		}	
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
	}
}
