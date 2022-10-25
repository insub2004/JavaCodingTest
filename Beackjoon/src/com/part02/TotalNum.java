package com.part02;

import java.util.Scanner;

public class TotalNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		
		// 아스키코드 문자'1'과 숫자1의 차이(변화)는 48 or '0'
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		
		System.out.print(sum);
	}
}
