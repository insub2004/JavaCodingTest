package com.part03;

import java.util.Scanner;

public class Attackrange {

	public static void main(String[] args) {
		/*
		 * ����
			�����̴� ����� ������ ������ �������� �����κ��� ������ ����ϴ� ���潺 ������ ������ �÷����ϴ� ���� �����ߴ�. �׷��� ������ ���潺 ������ ����� ������ �Ѵ�.
			
			����� �����̸� ����, ���潺 ���� ������ �÷��̾ ��ġ�ϴ� ������ ��Ÿ��� ��Ÿ���� ����� �����ϸ� �ȴ�.  
			
			�Է�
			�Է� ù° �ٿ��� ���潺 ������ �� ũ�� N�� �־���. ���� N��N ũ���� 2���� �����̴�. (N�� 6�̻� 100������ ¦��)
			
			��° �ٿ��� ������ ��ġ�� ��ġ X, Y�� ������ ��Ÿ� R�� �־�����. X�� ���� ��ȣ, Y�� ���� ��ȣ�� �ǹ��Ѵ�. (X, Y�� 1�̻� N������ �ڿ���, R�� N/2������ �ڿ���)
			
			 
			
			���
			���� ��°� ���� ������ ��Ÿ��� ��Ÿ���� ����Ѵ�. (������ ��Ÿ��� �ƹ��� �� ���� ��� ���� ����.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int x = sc.nextInt();			// ��
		int y = sc.nextInt();			// ��
		int ran = sc.nextInt();			// ��Ÿ�
		
		int arr[][] = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = 0;
			}
		}
		
		arr[x][y] = 'x';
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j]+' ');
			}
			System.out.println();
		}
		
	}
}
