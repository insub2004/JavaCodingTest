package com.part02;

import java.util.Scanner;

public class Qn24 {

	//mine
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n+2][m+2];
		int cnt=0;
		
		int ry = sc.nextInt();	//클릭 행
		int rx = sc.nextInt();	//클릭 열
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=ry-1; i<=ry+1; i++) {
			for(int j=rx-1; j<=rx+1; j++) {
				if(arr[i][j]==1) cnt++;
			}
		}
		if(arr[ry][rx]==1) System.out.println("game over");
		else System.out.println(cnt);
	}
}
