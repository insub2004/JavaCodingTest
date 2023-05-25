package com.final01;

import java.util.Scanner;

public class QnC02 {

	//∏¡º≥¿”
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int n = sc.nextInt();
			
			char[] arr = new char[n+2];
			arr[0] = 't';
			arr[n+1] = 't';
			
			String str = sc.next();
			for(int i=1; i<=n; i++) {
				arr[i] = str.charAt(i);
			}
			
			int cnt = 0;
			
			for(int i=1; i<n; i++) {
				char ch = arr[i];
			}
			
		}
		
	}
}
