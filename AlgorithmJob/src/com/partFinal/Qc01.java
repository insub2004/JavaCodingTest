package com.partFinal;

import java.util.Arrays;
import java.util.Scanner;

public class Qc01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// ���� ����
		
		int k = sc.nextInt();	// k��° ū��
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		System.out.println(arr[n-k]);
		
	}
}
