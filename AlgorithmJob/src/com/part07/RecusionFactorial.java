package com.part07;

import java.util.Scanner;

public class RecusionFactorial {

	// n을 입력하면 n!구현하는 재귀함수를 만들자
	// 1) factorial(n)은 n!을 구하는 함수
	// 2) factorial(0) = 1	
	// 3) factorial(n) = factorial(n-1)*n
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
	}

	private static int factorial(int n) {
		
		if(n==0) return 1;
		else return n*factorial(n-1);
	}
	
}
