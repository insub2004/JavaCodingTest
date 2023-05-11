package com.part02;

import java.util.Scanner;

public class Qn31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n+5][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
	}
}
