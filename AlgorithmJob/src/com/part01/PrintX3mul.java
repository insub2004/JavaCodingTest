package com.part01;

import java.util.Scanner;

public class PrintX3mul {

	public static void main(String[] args) {
		
		//1부터 N까지의 숫자를 출력한다. 단, 3의 배수에서는 문자 X를 출력한다.
		
		//입력 예제
		//10
		//출력 예제
		//1 2 X 4 5 X 7 8 X 10
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//1부터 출력하니 for문으로 i부터 출력
		//3의 배수이면 X를 아니면 i를 출력하자
		
		for(int i=1; i<=n; i++) {
			if(i%3==0) {
				System.out.print("X");
			}else System.out.print(i);
			System.out.print(" ");
		}
		
	}
}
