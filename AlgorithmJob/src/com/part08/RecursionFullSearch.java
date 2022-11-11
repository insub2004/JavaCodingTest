package com.part08;

import java.util.Scanner;

public class RecursionFullSearch {

	/*
	 * n중for문
	 * n을 입력하면
	 * 1부터 n까지의 숫자 중 중복되지 않는 숫자를 전부 나열하라
	 * 
	 * 입력
	 * 3
	 * 
	 * 출력
	 * 123
	 * 132
	 * 213
	 * 231
	 * 312
	 * 321
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//입력
		int arr[] = new int[n];
		
		getResult(0, n, arr);
		
	}
	
	//current는 n번째 for문이라고 생각하자
	//
	private static void getResult(int current, int n, int[] result) {
		
		if(current>=n) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) {
				if(isNotContain(result,i)) {
					result[current] = i;
					getResult(current + 1, n, result);
					result[current] = 0;
				}
			}
		}
		
	}

	private static boolean isNotContain(int[] result, int a) {
		for(int i=0; i<result.length; i++) {					//여기 배열의 범위는 result의 범위를 봐야하므로
			if(result[i] == a) return false;					//0~result의 범위를 보는게 맞다
		}
		return true;
	}
	
}
