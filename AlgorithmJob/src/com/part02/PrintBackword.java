package com.part02;

import java.util.Scanner;

public class PrintBackword {

	public static void main(String[] args) {
		
		/*
		 * 정수를 입력으로 받아 입력 받은 수를 거꾸로 출력하는 문제이다.
		 * 
		 * 입력
		 * 입력의 첫 수는 수의 개수 n 이다. ( 1 <= n <= 1000 ) 
		 * 다음 줄에는 n 개의 수가 입력으로 주어진다. 각 수는 -10000 초과 10000 미만인 정수이다.
		 * 
		 * 출력
		 * 한 줄에 입력받은 수를 거꾸로 출력한다.
		 * 
		 * 입출력 예제
		 *  8
			1 -2 3 4 6 8 2 1
			
			1 2 8 6 4 3 -2 1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=len-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
	}
}
