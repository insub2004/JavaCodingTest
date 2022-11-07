package com.d1;

import java.util.Scanner;

public class Qn2025 {

	// N줄 덧셈
	// 1부터 주어진 숫자만큼 모두 더한 값을 출력하시오
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/*
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		*/
		System.out.println(n*(n+1)/2);
	}
	
}
