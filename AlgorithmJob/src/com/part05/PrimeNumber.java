package com.part05;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// 소수 판별
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean flag = false;
		// flag가 false면 소수임
		// flag가 true면 소수가 아님
		
		for(int i=2; i<n; i++) {
			if(n%i==0) flag=true;
		}
		
		if(flag==true) System.out.println("소수가 아닙니다!");
		else System.out.println("소수입니다!");
		
		
		
	}
}
