package com.part02;

import java.util.Scanner;

public class Qn32 {

	//seat
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();	//가로 -> 90도 돌려서 행으로
		int c = sc.nextInt();	//세로 -> 90도 돌려서 열로
		
		int k = sc.nextInt();
		
		int[][] arr = new int[r+10][c+10]; //다 0으로 채워져 있음
		arr[1][0] = 1;
		//(1,1)부터 시작해서 오른쪽 (1,c)를 만나기까지 or 숫자를 만나기까지 숫자로 만들고 아래방향으로
		//(1,c)부터 시작해서 아래 (r,c)를 만나기까지 or 숫자를 만나기까지 숫자로 만들고 왼쪽방향으로
		//(r,c)부터 시작해서 위로 숫자를 만나기까지 숫자로 만들고 이걸 반복
		
		//arr[i+dx[0]][j+dy[0]] 오른쪽
		//arr[i+dx[1]][j+dy[1]] 아래방향
		//arr[i+dx[2]][j+dy[2]] 왼쪽방향
		//arr[i+dx[3]][j+dy[3]] 위쪽방향
		int direc = 0;
		int val = 1;
		
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,-1};
		
		int x=1;
		int y=0;
		//일단 배열 만큼 숫자 다 채우기
		
		for(int i=2; i<=r*c; i++) {
			x = x + dx[direc];
			y = y + dy[direc];
			System.out.println(val);
			System.out.println(direc);
			System.out.println(x + " " + y);
			arr[x][y] = val++;
			
			if(y>=c || x>=r || arr[x][y] == 0) direc++;
			
			if(direc==4) {
				direc=0;
			}
		}
		
		for(int i=1; i<=c; i++) {
			for(int j=1; j<=r; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
