package com.recursion;

import java.util.Scanner;

public class Tobin01 {
	/*
	 * ����
	�� ���� n, k�� �Է¹޾� k���� 1�� ���� n�ڸ� ���� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.

	�Է�
	�� ���� n, k�� �Է����� �־�����. ( 0 < n <= 30, 0 <= k < 8 , n >= k )

	���
	����� ������������ ����Ѵ�.
	
	���� �Է�
	4 2
	���� ���
	1100
	1010
	1001
	0110
	0101
	0011
	
	���� �Է�
	2 0
	���� ���
	00
	 */
	
	public static int[] arr;
	public static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();	// n���� �ڸ�
		int k = sc.nextInt();	// 1�� ����
		
		arr = new int[n];	
		
		getResult(0,k);
		
	}

	private static void getResult(int x, int k) {
		
		if(k==0) {
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		else {
			for(int j=x;j<n;j++) {
				arr[j] = 1;
				getResult(j+1, k-1);
				arr[j] = 0;
			}
		}
	}
}
