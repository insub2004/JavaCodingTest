package com.part01;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		
		//1부터 N까지의 숫자 중 짝수의 합
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		while(n>0) {
			if(n%2==0) sum+=n;
			n--;
		}
		
		System.out.println(sum);
	}
}
