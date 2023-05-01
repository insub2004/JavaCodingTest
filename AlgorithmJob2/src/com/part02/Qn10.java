package com.part02;

import java.util.Scanner;

public class Qn10 {

	//Card game
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int a = 0;
		int b = 0;
		
		for(int i=0; i<arr[0].length; i++) {
			if(arr[0][i]>arr[1][i]) a++;
			else if(arr[0][i]<arr[1][i]) b++;
		}
		
		System.out.println((a>b) ? "A" : (a<b) ? "B" : "D");
		
	}
}
