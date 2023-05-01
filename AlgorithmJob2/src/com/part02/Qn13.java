package com.part02;

import java.util.Scanner;

public class Qn13 {

	//array2
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(arr[a][b]);
	}
}
