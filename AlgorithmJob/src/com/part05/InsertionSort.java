package com.part05;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		/*
		 * �������� ���Ҹ� ���ĵ� �迭 ���� �� �˸��� �ڸ��� ���Խ�Ų��.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ����

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) { 	// j>0�� ������ ���ĵ� ������ 1��° ������
				if (arr[j] < arr[j - 1]) {
					int tmp02 = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp02;	
				}else break;				// �� ���� ���ĵ� ���´ϱ� �ڽź��� �۰ų� ���� ���� ���̻� �� �ʿ� ����.
			}
			for (int k = 0; k < n; k++) {
				System.out.printf("%d ", arr[k]);

			}
			System.out.println();
		}

	}
}
