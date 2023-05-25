package com.d3;

import java.util.Scanner;

public class Qn4406 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			String str = sc.next();
			
			System.out.printf("#%d %s", test_case,str.replaceAll("[aeiou]", ""));
			
		}
		
	}
}
