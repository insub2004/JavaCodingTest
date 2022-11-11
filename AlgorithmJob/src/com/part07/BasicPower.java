package com.part07;

import java.util.Scanner;

public class BasicPower {

	// 거듭제곱을 구하기를 재귀함수를 통해서 구해보자
	// 1) getPower(n,m)은 n^m을 반환하는 함수
	// 2) 기저조건 getPower(n,0)은 1이다.
	// 3) getPower(n,m)=getPower(n,m-1)*n
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(getPower(n,m));
		
	}

	private static int getPower(int n, int m) {
		// n^m을 반환하는 함수
		if(m==0) return 1;
		else return n*getPower(n, m-1);
	}
	
}
