package com.part02;

import java.util.Scanner;

public class Qn30 {

	//tetris
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt(); //열
		int r = sc.nextInt(); //행
		
		int[][] arr = new int[25][25];
		int x = 0; 
		int y = 0;
		int min = 0;
		int max = 0;
		
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int idx = 0;
		
		for(int i=1; i<=c; i++) {	//열 방향 탐색
			for(int j=1; j<=r; j++) {
				if(arr[j][i]==1) {	//j번 행 탐색하면서 첫번째 1을 만나면 그 위에가 최소지점 시작점
					idx = j-1;
					break;
				}else if(j==r) idx = j;
			}
			//1로 채우기
			int cnt = 0;
			for(int k=idx; k>0; k--) {
				if(cnt==4) break;
				arr[k][i]=1;
				cnt++;
			}
//			System.out.println(i+"번 1로------------------");
//			for(int p=1;p<=r;p++) {
//				for(int q=1;q<=c;q++) {
//					System.out.print(arr[p][q]+ " ");
//				}
//				System.out.println();
//			}
			cnt = 0;
			//가로 연산해보기
			int sum = 0;
			int cntX = 0;
			for(int z=1;z<=r;z++) {
				for(int h=1;h<=c;h++) {
					sum += arr[z][h];
				}
				if(sum==c) cntX++;
				sum=0;
			}
			if(cntX>max) {
				max = cntX;
				x = i;
			}
			//다시 0으로 만들기
			for(int k=idx; k>0; k--) {
				if(cnt==4) break;
				arr[k][i]=0;
				cnt++;
			}
//			System.out.println(i+"번 0로------------------");
//			for(int g=1;g<=r;g++) {
//				for(int f=1;f<=c;f++) {
//					System.out.print(arr[g][f]+ " ");
//				}
//				System.out.println();
//			}
		}
		
		
		System.out.print(x + " " + max);
	}
}
