package com.part03;

import java.util.Scanner;

public class Eightnine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[][] = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=m-1; j>=0; j--) {			// 큰수에서 감소시킬때 값 범위 확인 잘하자
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
