package com.part04;

import java.util.Scanner;

public class Bingo02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextInt();	
			}
		}
		
		//(1) arr에서 a의 위치를 찾고
		//(2) a를 -1로 바꾸자
		//(3) 몇개의 줄이 지워졌나
		//(4) 3개 이상의 줄이 지워졌으면 끝
		
		int result = 0;
		int flag = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int a = sc.nextInt();
				result++;
				
				for(int k=0; k<5; k++) {
					for(int p=0; p<5;p++) {
						if(arr[k][p] == a) {
							// (k,p)에 a가 있구나!
							arr[k][p] = -1;
						}
					}
				}
				
				int cnt = 0;
				
				
				for(int k=0; k<5; k++) {
					// k번째 줄의 X의 갯수 세겠다.
					int Xcnt = 0;
					for(int p=0;p<5;p++) {
						if(arr[k][p] == -1) {
							Xcnt++;
						}
					}
					if(Xcnt==5) cnt++;
				}
				
				for(int k=0; k<5; k++) {
					int Xcnt = 0;
					for(int p=0; p<5; p++) {
						if(arr[p][k] == -1) {
							Xcnt++;
						}
					}
					if(Xcnt==5) cnt++;
				}
				
				if(arr[0][0]==-1 && arr[1][1]==-1 && arr[2][2]==-1 && arr[3][3]==-1 && arr[4][4]==-1) cnt++;
				if(arr[0][4]==-1 && arr[1][3]==-1 && arr[2][2]==-1 && arr[3][1]==-1 && arr[4][0]==-1) cnt++;
				
				if(cnt>=3) {
					System.out.println(result);
					flag = 1;
					break;
				}
				
			}
			if(flag == 1) break;
		}
		
	}
}
