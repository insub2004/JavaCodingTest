package com.part02;

import java.util.Scanner;

public class SelectionSortRe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int idx = i;
			for(int j=i; j<n;j++) {
				if(arr[idx]>arr[j]) {
					idx = j;
				}
			}
			int tmp = 0;
			tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
	}
}
