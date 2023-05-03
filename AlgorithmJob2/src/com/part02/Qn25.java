package com.part02;

import java.util.Scanner;

public class Qn25 {

	//행렬 뒤집기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[10][10];
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<10; j++) {
				if(arr[i][j]==0) arr[i][j]=1;
				else arr[i][j]=0;
			}
			for(int k=0; k<10; k++) {
				if(arr[k][i]==0) arr[k][i]=1;
				else arr[k][i]=0;
			}
		}
		
		//대각선에 n번 까지 1넣기
		for(int i=0;i<n;i++) {
			arr[i][i] = 1;
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
