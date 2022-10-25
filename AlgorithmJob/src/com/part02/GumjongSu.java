package com.part02;

import java.util.Scanner;

public class GumjongSu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int tmp = 0;
		
		for(int i=0; i<a.length; i++) {
			tmp += (a[i]*a[i]);
		}
		
		System.out.println(tmp%10);
		
	}
}
