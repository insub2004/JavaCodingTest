package com.part02;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		/*
		 * 숫자를 입력 받아 이진수로 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력
		 * 첫 번째 줄에 숫자를 입력 받는다. 숫자의 크기는 1,000보다 작거나 같다
		 * 
		 * 출력
		 * 첫째 줄에 숫자를 이진수로 바꾸어 출력한다.
		 *
		 * 입출력 예제
		 * 14
		 * 1110
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.print(Integer.toBinaryString(x));
		
		
	}
}
