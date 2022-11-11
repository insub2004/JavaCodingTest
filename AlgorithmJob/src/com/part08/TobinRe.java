package com.part08;

import java.util.Scanner;

public class TobinRe {

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
	
	1�� ���� ä�������Ѵ�.
	n���� k���� 1�� ä���� ������� 1�� ������ cnt�� �Ǻ��ϸ� �� ��  
	 */
	
	public static int n;
	public static int cnt=0;
	public static int[] result;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int k = sc.nextInt();
		
		result = new int[n];
		
		getResult(0,k);		//k��ŭ�� 1�� ǥ���ؾ��ϴϱ�
		
	}

	private static void getResult(int x,int k) {
		
		if(k==0) {
			for(int i=0; i<n; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
		} else {
			for(int i=x; i<n; i++) {
				result[i] = 1;
				getResult(i+1, k-1);
				result[i] = 0;
			}
		}
		
	}
}
