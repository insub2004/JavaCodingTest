package com.q20;

import java.util.Scanner;

public class CompleteSqrRe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			
			int x4 = 0;		//정답
			int y4 = 0;		//정답
			
			//xor 연산		//같은거 끼리 지워짐
			x4 = x1 ^ x2 ^ x3;
			y4 = y1 ^ y2 ^ y3;
			
			/*
			if(x1==x2) x4 = x3;
			else if(x1==x3) x4 = x2;
			else x4 = x1;
			
			if(y1==y2) y4=y3;
			else if(y1==y3) y4=y2;
			else y4=y1;
			*/
			System.out.printf("#%d %d %d\n", t, x4,y4);
			
		}
		
	}
	
}
