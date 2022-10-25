package com.part02;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int r = sc.nextInt();
		
		int A[][] = new int[h][r];
		
		int num = 1;
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<r; j++) {
				A[i][j] = num++;
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
