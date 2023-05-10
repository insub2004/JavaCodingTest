package com.part02;

import java.util.Scanner;

public class Qn28 {

	//attackrange
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		
		int[][] arr = new int[105][105];
		int dist = 0;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				dist = Math.abs(x-i)+Math.abs(y-j);
				
				if(dist<=r) arr[i][j] = dist;
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==x && j==y) System.out.print("x ");
				else System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
