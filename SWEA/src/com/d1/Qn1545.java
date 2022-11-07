package com.d1;

import java.util.Scanner;

public class Qn1545 {

	// 거꾸로 출력해 보아요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n; i>=0; i--) {
			System.out.printf("%d ", i);
		}
	}
}
