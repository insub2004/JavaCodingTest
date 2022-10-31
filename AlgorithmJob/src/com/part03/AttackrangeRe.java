package com.part03;

import java.util.Scanner;

public class AttackrangeRe {

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

		int arr[][] = new int[N+1][N+1];	// �̰� ����� ���� 2���� �迭 0���� ä�ﲨ�� �迭�� ũ�⸦ �����ϰ� �ʱ�ȭ�� ���൵ �⺻��0���� �ʱ�ȭ��	
		
		// �迭�� �ʱ�ȭ	�̰� ���������
		/*for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				arr[i][j] = 0;
			}
		}*/
		
		// x,y��ǥ �������� �Ÿ���ŭ�� ���� �ֱ�
		while(ran>0) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					if(Math.abs(i-x)+Math.abs(j-y) == ran) { 
						arr[i][j]=ran;
					}
				}
			}
			ran--;
		}
		
		
		for(int i=1;i<=N; i++) {
			for(int j=1;j<=N;j++) {
				if(i==x && j==y) {
					System.out.print("x ");
					continue;
				}
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
