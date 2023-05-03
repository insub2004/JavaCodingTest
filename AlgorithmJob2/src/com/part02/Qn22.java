package com.part02;

import java.util.Scanner;

public class Qn22 {

	//rook
	//2를 기준으로 찾겠다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[8][8];
		
		int kx = 0;	//킹의 열
		int ky = 0;	//킹의 행
		
		int[] rookX = new int[2];
		int[] rookY = new int[2];
		int rookCnt = 0;	//룩 갯수와 좌표를 넣기 위함
		
		boolean flag = false;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				arr[i][j] = sc.nextInt();
				
				if(arr[i][j]==2) {
					rookX[rookCnt] = j;
					rookY[rookCnt] = i;
					rookCnt++;
				}
			}
		}
		
		for(int i=0; i<rookCnt; i++) {
			int rx = rookX[i]; //열
			int ry = rookY[i]; //행
			
			//같은 행,열의 오른쪽으로
			for(int j=rx+1; j<8; j++) {
				if(arr[ry][j]==1) flag = true;
				else if(arr[ry][j]==3) break;
			}for(int j=rx-1; j>=0; j--) {	//같은 행,열의 왼쪽으로 
				if(arr[ry][j]==1) flag = true;
				else if(arr[ry][j]==3) break;
			}for(int j=ry+1; j<8; j++) {
				if(arr[j][rx]==1) flag = true;
				else if(arr[j][rx]==3) break;
			}for(int j=ry-1; j>=0; j--) {
				if(arr[j][rx]==1) flag = true;
				else if(arr[j][rx]==3) break;
			}
		}
		
		if(flag==true) System.out.println(1);
		else System.out.println(0);
	}
}
