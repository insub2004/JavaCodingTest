package com.part02;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		/*
		 * N�� �־��� ��, ������ ���� ���α׷��� �ۼ��غ���. 
		 * 
		 * �Է�
		 * ù° �ٿ� �ڿ��� N�� �־�����.(1<=N<=100)
		 * 
		 * ����� ����
		 * 
		 * 3 
		 * 
		 * 1 2 4
		 * 3 5
		 * 6
		 * 
		 * 5
		 * 
		 * 1 2 4 7 11
		 * 3 5 8 12
		 * 6 9 13
		 * 10 14
		 * 15
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//���� ����
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int x=0, y=0;
		
		int cnt = 1;
		
		for(int i=0; i<n; i++) {
			x = i;
			y = 0;
			for(int j=0; j<=i; j++) {
				arr[x][y] = cnt;
				cnt++;
				x--;
				y++;
			}
		}
		/*`0		1		2
		 * (00) 1 (10) 2  (20) 4
		 * (01) 3 (11) 5
		 */
		
		for(int i=0; i<n; i++) {
			x = i;
			y = 0;
			for(int j=0; j<=i; j++) {
				System.out.print(arr[x][y]);
				x--;
				y++;
			}
		}
		
		
		
	}
}
