package com.part03;

import java.util.Scanner;

public class Attackrange {

	public static void main(String[] args) {
		/*
		 * 문제
			윤성이는 어렸을 적부터 수없이 몰려오는 적으로부터 기지를 방어하는 디펜스 유형의 게임을 플레이하는 것을 좋아했다. 그래서 간단한 디펜스 게임을 만들어 보려고 한다.
			
			당신은 윤성이를 도와, 디펜스 게임 내에서 플레이어가 설치하는 유닛의 사거리를 나타내는 기능을 구현하면 된다.  
			
			입력
			입력 첫째 줄에는 디펜스 게임의 맵 크기 N이 주어딘다. 맵은 N×N 크기의 2차원 형태이다. (N은 6이상 100이하의 짝수)
			
			둘째 줄에는 유닛이 설치될 위치 X, Y와 유닛의 사거리 R이 주어진다. X는 행의 번호, Y는 열의 번호를 의미한다. (X, Y는 1이상 N이하의 자연수, R은 N/2이하의 자연수)
			
			 
			
			출력
			예제 출력과 같이 유닛의 사거리를 나타내어 출력한다. (유닛의 사거리가 아무리 길어도 맵을 벗어날 수는 없다.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int x = sc.nextInt();			// 행
		int y = sc.nextInt();			// 열
		int ran = sc.nextInt();			// 사거리
		
		int arr[][] = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = 0;
			}
		}
		
		arr[x][y] = 'x';
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j]+' ');
			}
			System.out.println();
		}
		
	}
}
