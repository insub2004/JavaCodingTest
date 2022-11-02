package com.part03;

import java.util.Scanner;

public class Mine {

	public static void main(String[] args) {
		
		/*
		 * 문제
		지뢰찾기라는 게임은 맵에서 지뢰들이 어디에 있는지 유추해내는 게임이다. 이 게임 프로그램은 플레이어가 어떤 지점을 클릭했을 때 그 지점 주변(상, 하, 좌, 우, 대각선, 총 8곳)에 지뢰가 몇개가 있는지를 알려준다.
		
		플레이어는 가장 적은 클릭을 통해, 지뢰들이 어디에 있는지를 유추해 내는 것이 목적인 게임이다. 중간에 지뢰가 있는 지점을 클릭하면 게임오버된다.
		
		이때 어떤 지점을 클릭했을 때, 주변에 몇개의 지뢰들이 존재하는지를 출력하는 프로그램을 작성해보자  
		
		입력
		첫째 줄에 게임의 맵의 크기를 나타내는 정수 N과 M이 주어진다. N은 맵의 행 수, M은 맵의 열 수를 나타낸다. N, M은 5이상 100이하의 수이다.
		
		둘째 줄에는 플레이어가 클릭한 지점의 위치 X와 Y가 주어진다. X는 행 번호, Y는 열 번호를 나타낸다. (행 번호는 1이상 N이하, 열 번호는 1이상 M이하의 수이다.)
		
		셋째 줄부터 N줄에 걸쳐 NxM 게임 맵의 상태가 주어진다. 이때 0은 지뢰가 없는 지점을 1은 지뢰가 있는 지점을 나타낸다.
		
		 
		
		출력
		클릭된 지점 주변에 있는 지뢰의 개수를 출력한다. 클릭된 지점이 지뢰가 있는 지점이면 game over를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 행
		int M = sc.nextInt();	// 열
		
		int x = sc.nextInt();	// 선택 지점 행 좌표
		int y = sc.nextInt();	// 선택 지점 열 좌표
		
		int flag = 0;	// 선택 지점에 1이 있을 경우 game over 출력하게 할 변수
		int cnt = 0;	// 1의 갯수를 셀 변수
		
		int arr[][] = new int[N+1][M+1];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				arr[i][j] = sc.nextInt();		// 지뢰판 입력받기
			}
		}
		
		for(int i=x-1; i<=x+1; i++) {
			if(arr[x][y] == 1) {
				flag = 1;
				break;
			}
			for(int j=y-1; j<=y+1; j++) {
				if(arr[i][j]==1) {
					cnt++;
				}
			}
		}
		
		if(flag==0) System.out.println(cnt); 
		else System.out.println("game over");

	}
}
