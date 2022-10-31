package com.part03;

import java.util.Scanner;

public class AttackrangeRe {

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

		int arr[][] = new int[N+1][N+1];	// 이거 까먹지 말자 2차원 배열 0으로 채울꺼면 배열의 크기를 지정하고 초기화만 해줘도 기본값0으로 초기화됨	
		
		// 배열값 초기화	이거 까먹지말자
		/*for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				arr[i][j] = 0;
			}
		}*/
		
		// x,y좌표 기준으로 거리만큼의 숫자 넣기
		while(ran>0) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					if(Math.abs(i-x)+Math.abs(j-y) == ran) { 
						arr[i][j]=ran;
					}
				}
			}
			ran--;
		}
		
		
		for(int i=1;i<=N; i++) {
			for(int j=1;j<=N;j++) {
				if(i==x && j==y) {
					System.out.print("x ");
					continue;
				}
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
