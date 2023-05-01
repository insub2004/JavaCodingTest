package com.part02;

import java.util.Scanner;

public class Qn01 {
	
	//삼각형 출력1
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.err.print("*");
			}
			System.out.println();
		}
		
	}
}
