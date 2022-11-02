package com.part03;

import java.util.Scanner;

public class Offset {

	public static void main(String[] args){
		
		/*
		 * 5x5 2���� �迭�� �־��� �� � ���Ұ� �����¿쿡 �ִ� ���Һ��� ���� �� 
		 * �ش� ��ġ�� * �� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��輱�� �ִ� ���� �����¿� �� 
		 * �����ϴ� ���Ҹ��� ���Ѵ�.
		 * 
		 */
		
		/*
		 * 	3 4 1 4 9
			2 9 4 5 8
			9 0 8 2 1
			7 0 2 8 4
			2 7 2 1 4
			
			Ǯ�� : �����ڸ��� ū ���ڵ��� �־ ��ġ �����¿찡 �ִ� ��ó�� ������
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[10][10];
		
		// 1~5���� ������ �迭 �ֱ�
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		//�����ڸ� 0~6 a[0][i], a[6][i], a[i][0], a[6][i] �� ū�� �ֱ� 99
		for(int i=0; i<=6; i++) {
			a[0][i] = 99;
			a[6][i] = 99;
			a[i][0] = 99;
			a[i][6] = 99;
		}
		
		//�����¿� ���ϱ�
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(a[i][j] < a[i-1][j] &&
					a[i][j] < a[i+1][j] &&
					a[i][j] < a[i][j-1] &&
					a[i][j] < a[i][j+1]) System.out.print("* ");
				else System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
