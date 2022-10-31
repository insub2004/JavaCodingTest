package com.part03;

import java.util.Scanner;

public class AttackrangeReRe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ran = sc.nextInt();
		
		int arr[][] = new int[100][100];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				
				int first = x-i;
				int second = y-j;
				
				if(first<=0) first*=-1;
				if(second<=0) second*=-1;
				
				int dist = first+second;
				
				if(dist <= ran) arr[i][j] = dist;
			}
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1;j<=N;j++) {
				if(i==x && j==y) {
					System.out.print("x ");
					continue;
				}
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
