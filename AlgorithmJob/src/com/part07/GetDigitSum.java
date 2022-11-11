package com.part07;

import java.util.Scanner;

public class GetDigitSum {

	// 각 자리수의 합
	// 12321-> 1232의 각 자리수의 합 + 1
	// 1232 -> 123의 각 자리수의 합 + 2
	
	// 1) getDigitSum(x)는 x의 각 자리수의 합을 반환하는 함수
	// 2) getDigitSum(x)=x x가 한자리일 때
	// 3) getDigitSum(x) = getDigitSum(x/10) + (x%10)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(getDigitSum(n));
		
	}

	private static int getDigitSum(int n) {
		
		if(n/10 == 0) return n;			// if( 9>=n || n>0)
		else return getDigitSum(n/10) + (n%10);
	}
	
}
