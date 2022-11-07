package com.doit;

import java.util.Scanner;

public class QN15 {

	public static void main(String[] args) {
	
		// ���� 2750�� �� �����ϱ�(��������)
		
		// N�� 1000�������� ���������� �ð����⵵ O(n^2)�� Ǯ�� ����
		
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