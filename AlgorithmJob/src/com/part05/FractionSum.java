package com.part05;

import java.util.Scanner;

public class FractionSum {

	//	백준 1735번
	// 	1) 먼저 분수의 합을 구하고
	//  2) 유클리드 호제법으로 GCD를 구하고 분모,분자를 각각 나눠서 기약분수로 만들자.
	
	public static int FindGCD(int a, int b) {
		
		int r = 0;
		int result = 0;
		
		while(true) {
			r = a%b;
			if(r==0) {
				result = b;
				break;
			}
			a = b;
			b = r;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ja01 = sc.nextInt();	//분자 2개 분모 2개 입력
		int mo01 = sc.nextInt();	
		int ja02 = sc.nextInt();
		int mo02 = sc.nextInt();
		
		int num01 = (ja01*mo02)+(ja02*mo01);	// 분수의 합 분자부분 (a*분모2)+(b*분모1)
		int num02 = mo01*mo02;					// 분수의 합 분모부분	 분모1 * 분모2
		
		//GCD구하기
		int GCD = FindGCD(num01,num02);
		
		//기약분수로 만들기
		System.out.print(num01/GCD + " ");
		System.out.println(num02/GCD);
	}
	
}
