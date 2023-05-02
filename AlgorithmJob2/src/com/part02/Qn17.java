package com.part02;

import java.util.Scanner;

public class Qn17 {

	//°ËÁõ¼ö
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		for(int i=0; i<5; i++) {
			num = sc.nextInt();
			sum += num*num;
		}
		
		System.out.println(sum%10);
		
	}
}
