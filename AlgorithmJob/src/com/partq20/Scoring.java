package com.partq20;

import java.util.Scanner;

public class Scoring {

	//14Ка
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int arr[][] = new int[n+1][m+1];
			int score[] = new int[n+1];
			int sum = 0;
			int max = 0;
			int cnt = 0;
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i=1; i<=n; i++) {
				sum = 0;
				for(int j=1; j<=m; j++) {
					sum += arr[i][j];
				}
				score[i] = sum;
			}
			
			for(int i=1; i<=n; i++) {
				if(max<score[i]) max = score[i];
			}
			for(int i=1; i<=n; i++) {
				if(max==score[i]) cnt++;
			}
			
			System.out.printf("#%d %d %d\n", t,cnt,max);
			
		}
		
	}
}
