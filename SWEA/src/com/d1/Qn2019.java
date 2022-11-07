package com.d1;

import java.util.Scanner;

public class Qn2019 {

	//더블더블
	//1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.
	//주어질 숫자는 30을 넘지 않는다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mul = 1;
		for(int i=n;i>=0;i--) {
			System.out.printf("%d ",mul);
			mul=mul*2;
		}
		
	}
}
