package com.part07;

import java.util.Scanner;

public class BasicFactorial {

	// 기본적인 재귀함수를 팩토리얼을 이용해서 만들어보자
	// 재귀함수 -> 귀납적으로 계산하는 방법
	/* 재귀함수 디자인 3가지 절차
	 * 1) 함수의 역할을 말로 정확하게 표현하자.
	 * 2) 기저조건(Base condition)에서 함수가 제대로 동작함을 보인다.
	 * 3) 함수가(작은input에 대하여) 제대로 동작한다고 가정하고 함수를 완성한다.
	 */
	public static int getFact(int n) {
		
		if(n==0) return 1;
		else return n*getFact(n-1);
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(getFact(n));
		
	}
}
