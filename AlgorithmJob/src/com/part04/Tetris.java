package com.part04;

import java.util.Scanner;

public class Tetris {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();	// ї­
		int r = sc.nextInt();	// За
		
		int arr[][] = new int[r][c];
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		int maxY = 0;
		int maxCnt = 0;
		int Ycnt=0;
		for(int i=0; i<c; i++) {
			int zCnt = 0;
			for(int j=0; j<r; j++) {
				if(arr[j][i]==0) zCnt++;
			}
			if(zCnt>maxCnt) {
				maxCnt = zCnt;
				maxY = i;
			}
		}
		int yCnt = 0;
		for(int i=0; i<r; i++) {
			if(arr[i][maxY-1] == 1 && arr[i][maxY+1]==1) yCnt++;
		}
		System.out.print(maxY+1);
		System.out.printf(" %d" ,yCnt);
	}
}
