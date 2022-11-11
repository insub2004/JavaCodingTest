package com.recursion;

import java.util.Scanner;

public class Binary {

	/*
	 * 문제
	숫자를 입력 받아 이진수로 출력하는 프로그램을 작성하시오.
	
	입력
	첫 번째 줄에 숫자를 입력 받는다. 숫자의 크기는 1,000보다 작거나 같다.
	
	출력
	첫째 줄에 숫자를 이진수로 바꾸어 출력한다.
	
	예제 입력
	14
	예제 출력
	1110
	
	재귀로 풀어보자
	 */
	
	/*
	 * 1)getBinary(n)은 2진수를 출력하는 함수이다.
	 * 2)getBinary(1)==1이고 binary(0)==0이다
	 * 3)getBinary(n) = binary(n/2) + n%2
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //입력받을 자연수
		
		getBinary(n);
	}

	private static void getBinary(int a) {
		// 9
		// f(9/2)+9%2 => f(4/2)+4%2 => f(2/2)+2%2 => f(1) - 1
		//			1	<=		0	<=		  0		<=		1
		// 11
		// f(11/2)+11%2 => f(5/2)+5%2 => f(2/2)+2%2 => f(1) - 1
		//			1	 <=			1  <=		0	<=		1
		// 이진수 손으로 구하고 아래에서 위로 적으니깐 출력 순서도 똑같다.
		if(a==1) System.out.print("1");
		else if(a==0) System.out.print("0");
		else {
			getBinary(a/2);
			System.out.printf("%d", a%2);
		}
		
	}
}
