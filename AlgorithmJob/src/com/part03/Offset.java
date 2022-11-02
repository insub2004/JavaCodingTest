package com.part03;

import java.util.Scanner;

public class Offset {

	public static void main(String[] args){
		
		/*
		 * 5x5 2차원 배열이 주어질 때 어떤 원소가 상하좌우에 있는 원소보다 작을 때 
		 * 해당 위치에 * 을 표시하는 프로그램을 작성하시오. 경계선에 있는 수는 상하좌우 중 
		 * 존재하는 원소만을 비교한다.
		 * 
		 */
		
		/*
		 * 	3 4 1 4 9
			2 9 4 5 8
			9 0 8 2 1
			7 0 2 8 4
			2 7 2 1 4
			
			풀이 : 가장자리에 큰 숫자들을 넣어서 마치 상하좌우가 있는 것처럼 해주자
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[10][10];
		
		// 1~5까지 범위에 배열 넣기
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		//가장자리 0~6 a[0][i], a[6][i], a[i][0], a[6][i] 에 큰수 넣기 99
		for(int i=0; i<=6; i++) {
			a[0][i] = 99;
			a[6][i] = 99;
			a[i][0] = 99;
			a[i][6] = 99;
		}
		
		//상하좌우 비교하기
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(a[i][j] < a[i-1][j] &&
					a[i][j] < a[i+1][j] &&
					a[i][j] < a[i][j-1] &&
					a[i][j] < a[i][j+1]) System.out.print("* ");
				else System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
