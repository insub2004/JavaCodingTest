package com.part03;

import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		int A[] = new int[5];
		for(int i=0; i<5; i++) {
			A[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for(int i=0;i<5;i++) {
			if(day == A[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
