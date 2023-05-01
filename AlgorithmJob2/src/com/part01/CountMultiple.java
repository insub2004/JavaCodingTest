package com.part01;

import java.util.Scanner;

public class CountMultiple {

	public static void main(String[] args) {
		
		//A B C 입력받아
		//A~B 중에서 C의 배수의 갯수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = 0;
		int max = 0;
		int cnt = 0;
		
		if(a>b) {
			min = b;
			max = a;
		}
		else {
			min = a;
			max = b;
		}
		
		while(min<=max) {
			if(min%c==0)cnt++;
			min++;
		}
		System.out.println(cnt);
		
	}
}
