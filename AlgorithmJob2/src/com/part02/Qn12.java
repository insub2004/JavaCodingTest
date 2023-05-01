package com.part02;

import java.util.Scanner;

public class Qn12 {

	//array1
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		int idx = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(idx+" ");
				idx++;
			}
			System.out.println();
		}
	}
}
