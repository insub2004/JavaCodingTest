package com.part05;

import java.util.Scanner;

public class CombinationPascal {

	/*
	 * ����
		n���� ����� m���� ������ ������� �̴� ����� ���� �����̶�� �ϸ� nCm���� ��Ÿ����.
		�� ������ �Ľ�Į�� �ﰢ���� ���� ������ ������ �ִٰ� �Ѵ�.
		n�� m�� �־������� nCm�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  
		
		�Է�
		ù° �ٿ� ���� n, m(0 �� m �� n �� 30)�� ���´�.
		
		���
		ù° �ٿ� nCm�� ���� ����Ѵ�.
		
		=> �Ľ�Į �ﰢ������ Ǯ��
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//�Ľ�Į �ﰢ�� �����
		int arr[][] = new int[n+1][n+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<i+1; j++) {
				if(j==0 || i==j) arr[i][j] = 1;
				else if(j<i) arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		/*
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<i+1; j++) {
					System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		*/
		System.out.println(arr[n][m]);
		
	}
	
}
