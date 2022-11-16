package com.part06;

import java.util.Scanner;

public class MulIsHard {
	
	// 7분 소요
	// if(a<10 && b<10) syso 이걸로 한방에 끝낼 수 있네
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("#%d ", t);
			
			if(1<=a&&a<=9) {
				if(1<=b&&b<=9) {
					System.out.print(a*b+"\n");
				}else {
					System.out.print("-1\n");
				}
			}else {
				System.out.print("-1\n");
			}
			
 		}
	}
	
}
