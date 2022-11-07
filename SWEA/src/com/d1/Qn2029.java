package com.d1;

import java.util.Scanner;

public class Qn2029 {

	// 몫과 나머지 출력하기
	// 2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
	/*
	 * 입력
	 * 	3	<-테스트 케이스
	 * 	9 2  
		15 6 
		369	15    
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//System.out.println("#"+test_case + ' ' + a/b + ' ' + a%b);
		System.out.printf("%d %d", a/b, a%b);
		
	}
}
