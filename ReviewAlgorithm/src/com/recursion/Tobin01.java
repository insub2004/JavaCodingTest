package com.recursion;

import java.util.Scanner;

public class Tobin01 {
	/*
	 * 문제
	두 정수 n, k를 입력받아 k개의 1을 가진 n자리 이진 패턴을 출력하는 프로그램을 작성하세요.

	입력
	두 정수 n, k가 입력으로 주어진다. ( 0 < n <= 30, 0 <= k < 8 , n >= k )

	출력
	결과를 내림차순으로 출력한다.
	
	예제 입력
	4 2
	예제 출력
	1100
	1010
	1001
	0110
	0101
	0011
	
	예제 입력
	2 0
	예제 출력
	00
	 */
	
	public static int[] arr;
	public static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();	// n개의 자리
		int k = sc.nextInt();	// 1의 갯수
		
		arr = new int[n];	
		
		getResult(0,k);
		
	}

	private static void getResult(int x, int k) {
		
		if(k==0) {
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		else {
			for(int j=x;j<n;j++) {
				arr[j] = 1;
				getResult(j+1, k-1);
				arr[j] = 0;
			}
		}
	}
}
