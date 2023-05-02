package com.part02;

import java.util.Scanner;

public class Qn1401 {

	//숫자 피라미드
	//1)홀수 줄의 첫번째 숫자와 바로 다음 짝수 줄의 첫번째 숫자 차이는 +1이다.
	//2)홀수 줄의 경우 마지막 직전의 값과 몇번 째 이후의 숫자인지 생각
	//3)짝수 줄의 경우 직전 홀수 줄의 첫번째 값에서 +1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
		}
		
	}
}
