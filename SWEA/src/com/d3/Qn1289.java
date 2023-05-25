package com.d3;

import java.util.Scanner;

public class Qn1289 {

	/*
	 * 00110110
	 * 00001001
	 * 00000110
	 * 00000001
	 * 00000000
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String n = sc.next();
			
			int idx = n.indexOf("1")+1;
			
			System.out.printf("#%d %d\n", t,n.length()-idx);
		}
		
	}
}
