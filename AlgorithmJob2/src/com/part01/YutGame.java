package com.part01;

import java.util.Scanner;

public class YutGame {

	public static void main(String[] args) {
		// ��(0) ��(1)
		// ��: �� 1��, �� 3�� => 0 1 1 1 => ���ϸ� 3
		
		// 4���� 3�� �޴´�.
		int[][] arr = new int[3][4];
		
		// sum�� 3:A(��), 2:B(��), 1:C(��), 0:D(��), 4:E(��)
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				sum+=arr[i][j];
			}
			switch (sum) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}
			sum=0;
		}
	}
}
