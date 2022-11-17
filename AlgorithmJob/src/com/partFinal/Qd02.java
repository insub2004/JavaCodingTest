package com.partFinal;

import java.util.Scanner;

public class Qd02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num%2==0) arr[i]=1;
			else arr[i]=0;
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		int cnt=0;
		int tmp=arr[0];
		int idx=0;
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				for(int j=i+1; j<n; j++) {
					if(arr[j]!=arr[i]) {
						idx = j;
						break;
					}
				}
				tmp = arr[i+1];
				arr[i+1] = arr[idx];
				arr[idx] = arr[i+1];
				cnt++;
			}
			for(int k=0; k<n; k++) {
				System.out.printf("%d ", arr[k]);
			}
			System.out.println();
		}
		
		System.out.println(cnt);
		
	}
}
