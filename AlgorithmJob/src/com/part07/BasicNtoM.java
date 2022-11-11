package com.part07;

import java.util.Scanner;

public class BasicNtoM {

	// N부터 M까지 더하기 재귀함수로 구현해보자
	// 1) getSum(n,m)은 n부터 m까지의 합을 구하는 함수 ex)getSum(1,4)=10
	// 2) getSum(n,n) = n
	// 3) getSum(n,m) = n + ~ + m-1 + m = getSum(n,m-1)+m
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(getSum(n,m));
		
	}

	private static int getSum(int n, int m) {
		
		if(n==m) return n;
		else return getSum(n,m-1) + m;
	}
	
}
