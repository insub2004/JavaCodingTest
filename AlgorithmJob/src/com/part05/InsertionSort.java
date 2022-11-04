package com.part05;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		/*
		 * 삽입정렬 원소를 정렬된 배열 범위 중 알맞은 자리에 삽입시킨다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 갯수

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) { 	// j>0인 이유는 정렬된 범위의 1번째 값까지
				if (arr[j] < arr[j - 1]) {
					int tmp02 = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp02;	
				}else break;				// 앞 쪽이 정렬된 상태니깐 자신보다 작거나 같은 경우는 더이상 볼 필요 없다.
			}
			for (int k = 0; k < n; k++) {
				System.out.printf("%d ", arr[k]);

			}
			System.out.println();
		}

	}
}
