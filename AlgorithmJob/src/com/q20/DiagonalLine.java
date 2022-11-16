package com.q20;

import java.util.Scanner;

public class DiagonalLine {

	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 int [][]arr = new int[n][n];
		 
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 if(i==j)arr[i][j] = 1;
			 }
		 }
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
	}
	
}
