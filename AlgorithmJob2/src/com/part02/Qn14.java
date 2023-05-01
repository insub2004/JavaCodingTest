package com.part02;

import java.util.Scanner;

public class Qn14 {

	//숫자 피라미드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print(s);
				s++;
				if(s==10) s=1;
			}
			System.out.println();
		}
		
	}
}
