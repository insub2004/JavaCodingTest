package com.part08;

import java.util.Scanner;

public class TobinRe {

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
	
	1이 먼저 채워져야한다.
	n개중 k개의 1로 채워서 출력하자 1의 갯수를 cnt로 판별하면 될 듯  
	 */
	
	public static int n;
	public static int cnt=0;
	public static int[] result;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int k = sc.nextInt();
		
		result = new int[n];
		
		getResult(0,k);		//k만큼만 1을 표시해야하니깐
		
	}

	private static void getResult(int x,int k) {
		
		if(k==0) {
			for(int i=0; i<n; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
		} else {
			for(int i=x; i<n; i++) {
				result[i] = 1;
				getResult(i+1, k-1);
				result[i] = 0;
			}
		}
		
	}
}
