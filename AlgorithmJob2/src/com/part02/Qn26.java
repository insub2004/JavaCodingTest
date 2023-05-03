package com.part02;

import java.util.Scanner;

public class Qn26 {

	//colorpaper
	//넓이를 구할 때 너비*높이이지만 해당 문제에서 행렬 한칸이 1*1=1 정사각형이라고 했으므로
	//행렬좌표 하나 당 넓이가 1이므로 그냥 n번째 색종이 좌표만큼 n을 넣고 n의 갯수를 출력하자
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[101][101];
		
		int n = sc.nextInt();
		
		int[] ans = new int[n+1];

		int y = 0; //행
		int x = 0; //열
		int H = 0; //높이(행 늘어남)
		int N = 0; //너비(열 늘어남)
		//n개의 색종이를 2차행렬의 좌표에 n입력하기
		for(int i=1; i<=n; i++) {
			y = sc.nextInt(); //행
			x = sc.nextInt(); //열
			H = sc.nextInt(); //높이(행 늘어남)
			N = sc.nextInt(); //너비(열 늘어남)
			for(int j=y;j<y+H;j++) {
				for(int k=x;k<x+N;k++) {
					arr[j][k] = i;
				}
			}
		}
		
		//0을 제외하고 보이는 n개의 색종이 만큼 n을 세기
		for(int k=1; k<=n; k++) {
			for(int i=0; i<101; i++) {
				for(int j=0; j<101; j++) {
					if(arr[i][j]==k) {
						ans[k]++;
					}
				}
			}
		}

		for(int i=1; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}
}
