package com.d3;

import java.util.Scanner;

public class Qn3431 {

	//준환이 운동
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();

			if(X>U) System.out.printf("#%d -1", t);
			else if(X>=L) System.out.printf("#%d 0",t);
			else {
				System.out.printf("#%d %d", t,L-X);
			}
			
		}
		
	}
}
