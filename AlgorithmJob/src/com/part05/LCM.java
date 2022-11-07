package com.part05;

import java.util.Scanner;

public class LCM {

	/*
	 * 문제
		정수 B를 0보다 큰 정수인 N으로 곱해 정수 A를 구할 수 있다면 A는 B의 배수이다.

		10과 20의 최소공배수는 20이다.
		5와 3의 최소공배수는 15이다.
		당신은 두 수에 대하여 최소공배수를 구하는 프로그램을 작성 하는 것이 목표이다.  
		
		입력
		한 줄에 두 자연수 A와 B가 공백으로 분리되어 주어진다.
		
		A와 B는 100,000,000(10^8)보다 작다.
		
		참고: 큰 수 입력에 대하여 변수를 64비트 정수로 선언하시오. C/C++에서는 long long int(%lld)를 사용하고, Java에서는 long을 사용하시오.

		출력
		A와 B의 최소공배수를 한 줄에 출력한다.
		
		==> 유클리드 호제법으로 풀자
		 LCM = GCD*(A/GCD)*(B/GCD)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long r = 0;
		
		long A = a;		// LCM 구할 때 쓸 복사본
		long B = b;
		
		
		long GCD = 0;
		long LCM = 0;
		// 우선 GCD구하기
		while(true) {
			r = a%b;
			if(r==0) {
				GCD = b;
				break;
			}
			a = b;
			b = r;
		}
		
		// LCM구하기
		LCM = (A/GCD)*(B/GCD)*GCD;
		System.out.println(LCM);
		
	}
	
}
