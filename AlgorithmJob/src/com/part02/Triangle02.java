package com.part02;

import java.util.Scanner;

public class Triangle02 {

	public static void main(String[] args) {
		//n층의 삼각형을 출력하는 프로그램을 작성하여라. Input, Output의 예제를 참고한다.
		//입력
		//첫째 줄에 정수n이 주어진다. (0≤n≤100)
		//출력
		//다음 예제와 같이 삼각형 모양으로 ‘*’을 출력한다.
				
		//입력 출력 예제
		//3
		//  *
		// **
		//***
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int z=0; z<i+1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
