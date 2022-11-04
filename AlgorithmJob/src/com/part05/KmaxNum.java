package com.part05;

import java.util.Scanner;

public class KmaxNum {

	public static void main(String[] args) {

		/*
		 * O(n*k) -> o(n)
		 * 
		 * ����
			N���� �ڿ����� �־��� ��, �� �ڿ����� �߿��� k��°�� ū ���� ã�� ���α׷��� �ۼ��Ͻÿ�. ���� k=1 �̶��, ���� ū ���� ã���� �ȴ�.
			
			 
			
			�Է�
			ù ��° �ٿ� �ڿ��� N, k�� �־�����. (1 �� N �� 100,000, 1 �� k �� 10) �� ��° �ٿ� N���� �ڿ����� �־�����.  
			
			���
			ù ��° �ٿ� k��° ���� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int k = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		System.out.println(arr[n - k]);

	}
}
