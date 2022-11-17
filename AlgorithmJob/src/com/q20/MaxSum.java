package com.q20;

import java.util.Scanner;

public class MaxSum {

	// 10�� �ҿ�
	// m�� ���ϸ鼭 �ٲ� ans�����ٵ� ū ������ Ȯ��������
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1;t<=T;t++) {
			
			int n = sc.nextInt();	// ������ ����
			int m = sc.nextInt();	// ���� ��
			
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int ans = -1;
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(arr[i]+arr[j] <= m && ans < arr[i]+arr[j]) {
						ans = arr[i]+arr[j];
					}
				}
			}
			
			System.out.printf("#%d %d\n", t,ans);
			
		}
		
	}
}
