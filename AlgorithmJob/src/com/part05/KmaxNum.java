package com.part05;

import java.util.Scanner;

public class KmaxNum {

	public static void main(String[] args) {

		/*
		 * O(n*k) -> o(n)
		 * 
		 * 문제
			N개의 자연수가 주어질 때, 이 자연수들 중에서 k번째로 큰 수를 찾는 프로그램을 작성하시오. 만약 k=1 이라면, 가장 큰 수를 찾으면 된다.
			
			 
			
			입력
			첫 번째 줄에 자연수 N, k가 주어진다. (1 ≤ N ≤ 100,000, 1 ≤ k ≤ 10) 두 번째 줄에 N개의 자연수가 주어진다.  
			
			출력
			첫 번째 줄에 k번째 수를 출력한다.
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
