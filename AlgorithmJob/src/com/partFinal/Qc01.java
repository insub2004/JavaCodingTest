package com.partFinal;

import java.util.Arrays;
import java.util.Scanner;

public class Qc01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 숫자 갯수
		
		int k = sc.nextInt();	// k번째 큰수
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		System.out.println(arr[n-k]);
		
	}
}
