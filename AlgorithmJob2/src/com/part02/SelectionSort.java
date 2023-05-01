package com.part02;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			int idx = i;
			for(int j=i; j<10; j++) {
				if(arr[idx]>arr[j]) {
					idx=j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
