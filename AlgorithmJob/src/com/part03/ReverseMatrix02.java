package com.part03;

import java.util.Scanner;

public class ReverseMatrix02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // ������ Ƚ��

		int start = 0; // ó�� ������ ������ ���� + ������ ��� ���� ���� ����

		int[][] arr = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		while (start < N) {
			for (int i = 0; i < 10; i++) { // ���κ� ��ȯ
				if (arr[start][i] == 0) {
					arr[start][i] = 1;
				} else if (arr[start][i] == 1) {
					arr[start][i] = 0;
				}
			}
			for (int j = 0; j < 10; j++) { // ��κ� ��ȯ
				if (start == j)
					continue; // 0,0 1,1 ���� ��� ���� ���� �κ��� ���� ���κ� ��ȯ���� �ٲ��־����� ����
				if (arr[j][start] == 0) {
					arr[j][start] = 1;
				} else if (arr[j][start] == 1) {
					arr[j][start] = 0;
				}
			}
			start++;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}
}
