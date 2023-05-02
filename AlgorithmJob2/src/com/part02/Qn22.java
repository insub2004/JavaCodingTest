package com.part02;

import java.util.Scanner;

public class Qn22 {

	//rook
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int flag = 0;

		int ry = 0;	//i
		int rx = 0;	//j
		
		for(int i=1; i<9; i++) {
			for(int j=1; j<9;j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j]==1) {
					ry = i;
					rx = j;
				}
			}
		}
		
		for(int i=1; i<9; i++) {
			if(arr[i][rx]==2) {
				
			}
		}
		
		
		
	}
}
