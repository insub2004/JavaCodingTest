package com.part02;

import java.util.Scanner;

public class Qn29 {

	//bingo
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int val = 0;
		int ans = 0;
		int x = 0;	//행
		int y = 0;	//열
		int cnt = 0;
		int sum = 0;
		
		while(true) {
			val = sc.nextInt();
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(arr[i][j]==val) {
						arr[i][j]=0;
						x=i;			//행 좌표 기억하기
						y=j;			//열 좌표 기억하기
					}
				}
			}
			
			if(x==y) {					//왼쪽에서 오른쪽 아래 대각선 방향
				for(int i=0; i<5; i++) {
					sum+=arr[i][i];
				}
				if(sum==0) cnt++;
				sum=0;
			}
			if(x+y==4) {			//오른쪽에서 왼쪽 아래 대각선 방향
				if(arr[0][4] + 
				   arr[1][3] +
				   arr[2][2] +
				   arr[3][1] +
				   arr[4][0] == 0) cnt++;
			}
			//대각선을 제외한 행,열 방향의 합들
			//행 조회
			for(int i=0; i<5; i++) {
				sum += arr[i][y];
			}
			if(sum==0) cnt++;
			sum=0;
			//열 조회
			for(int j=0; j<5; j++) {
				sum += arr[x][j];
			}
			if(sum==0) cnt++;
			sum=0;
			
			
			ans++;	// 입력한 횟수 카운팅
			
			if(cnt>=3) {
				break;
			}
		}
		System.out.println(ans);
	}
}
