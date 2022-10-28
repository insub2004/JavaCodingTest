package com.part03;

import java.util.Scanner;

public class Rook {

	public static void main(String[] args) {
		
		/*
		 * 입력
			8줄에 걸쳐 8x8 체스판의 상태가 주어진다. 
			이때 0은 기물이 없는 상태이고, 
			1은 알랩이의 킹을 의미하고, 
			2는 상대의 룩을 의미하며 3은 그 외 다른 기물들을 의미한다. 
			(킹은 하나만 존재하며, 상대의 룩은 최대 2개까지 있을 수 있다. 그 외 기물들은 최대 29개까지 있을 수 있다.)
			
			출력
			킹이 룩에게 잡힐 가능성이 있으면 1, 아니면 0을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[8][8];
		
		int rookX[] = new int[2];	// 룩의 x좌표(열)	룩의 갯수가 최대 2여서
		int rookY[] = new int[2];	// 룩의 y좌표(행)
		int rookCnt = 0;	// 룩의 갯수 카운트
		
		boolean flag = false;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				
				arr[i][j] = sc.nextInt();
				
				if(arr[i][j]==2) {
					rookY[rookCnt] = i;		// 행이 y
					rookX[rookCnt] = j;		// 열이 x
					
					rookCnt++;	// 룩이 2개 들어올 경우 대비
				}
				
			}
		}
		for(int k=0; k<2; k++) {
			int rx = rookX[k];
			int ry = rookY[k];
			
			for(int i=rx+1; i<8; i++) {				// rx기준 오른쪽부터 끝까지
				if(arr[ry][i] == 1) flag=true;	
				else if(arr[ry][i] == 3) break;
			}
			
			for(int i=rx-1; i>=0; i--) {
				if(arr[ry][i] == 1) flag=true;
				else if(arr[ry][i] == 3) break;
			}
			
			for(int i=ry+1; i<8; i++) {
				if(arr[i][rx] == 1) flag=true;
				else if(arr[i][rx] == 3) break;
			}
			
			for(int i=ry-1; i>=0; i--) {
				if(arr[i][rx] == 1) flag=true;
				else if(arr[i][rx] == 3) break;
			}
		}
		
		if(flag == true) System.out.println(1);
		else System.out.println(0);
		
	}
}
