package com.part01;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		// A~B까지 연속된 숫자 중 홀수는 더하고 짝수는 빼기
		// A<=B
		
		Scanner sc = new Scanner(System.in);
		
		int startInt = sc.nextInt();
		int endInt = sc.nextInt();
		
		int total = 0;
		
		for(int i=startInt; i<=endInt; i++) {
			if(i%2==0) total-=i;
			else total+=i;
		}
		
		System.out.println(total);
		
	}
}
