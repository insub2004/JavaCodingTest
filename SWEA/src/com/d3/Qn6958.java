package com.d3;

import java.util.Scanner;

public class Qn6958 {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		

		for (int test_case = 1; test_case <= T; test_case++) {
			
			int cnt = 0;	// 1�� ��� ��
			int max = 0;	// 1���� ���� 
			int val = 0;	// �� ����� ���� ��
			
			int N = sc.nextInt();	//��� ��
			int M = sc.nextInt();	//���� ��
			
			int arr[][] = new int[N][M];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					val += arr[i][j];
				}
				
				if(max==val)cnt++;
				else if(max<val) {
					cnt = 1;
					max = val;
				}
				
				val = 0;
			}
			
			System.out.printf("#%d %d %d", test_case, cnt, max);
			
		}
	}
}
