package com.part05;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		
		//정수론 약수
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(n);
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.printf("%d ", i);
			}
		}
		
	}
}
