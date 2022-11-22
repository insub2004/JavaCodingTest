package com.partq20;

import java.util.Scanner;

public class OddEven {

	// 6Ка
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String st = sc.next();
			
			int num = Character.getNumericValue(st.charAt(st.length()-1));
			
			if(num%10==0 || (num%10)%2 == 0)System.out.printf("#%d %d\n", t, 0);
			else System.out.printf("#%d %d\n", t, 1);
			
		}
		
	}
}
