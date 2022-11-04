package com.part04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		
		// 런타임에러 나옴 ㅠㅠ
		
		Scanner sc = new Scanner(System.in);
		
		int arr01[][] = new int[5][5];		// 사용할 빙고
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr01[i][j] = sc.nextInt();
			}
		}
		
		Queue<Integer> que = new LinkedList<Integer>();		// 정답 큐
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				que.add(sc.nextInt());
			}
		}
		
		int cnt = 0;	//빙고 갯수 세기
		int value = 0;	//큐에서 하나씩 꺼내서 넣을 변수
		int result = 0;	//큐에서 몇번 꺼냈는지 갯수 세기
		int sum = 0;	//합이 0이 되면 빙고로 판단
		int xsum01 = 0; //오른쪽 아래 대각선 방향 합
		int xsum02 = 0;	//왼쪽 아래 대각선 방향 합
		
		while(cnt!=3) {

			cnt = 0;	// while한번 돌고 다음에 똑같은 것을 중복 카운트하는걸 방지
			value = que.poll();
			result++;
			
			for(int i=0;i<5;i++) {					// 같은 값 찾아서 0 넣어주기
				for(int j=0;j<5;j++ ) {
					if(value == arr01[i][j]) {
						arr01[i][j]=0;
						break;
					}
				}
			}
			
			for(int i=0;i<5;i++) {					// 열 방향으로 빙고 탐색
				for(int j=0;j<5;j++) {
					sum+=arr01[i][j];
				}
				if(sum==0) cnt++;					// 한 줄씩 sum이 0인지 봐야하므로 여기에서 비교
				sum = 0;							// 한 줄씩 더해서 0인지 봐야하므로 여기서 sum = 0;
			}
			for(int i=0;i<5;i++) {					// 행 방향으로 빙고 탐색
				for(int j=0;j<5;j++) {
					sum+=arr01[j][i];
				}
				if(sum==0) cnt++;
				sum=0;
			}
			for(int i=0;i<5;i++) {					// 오른쪽 아래 대각선 방향 합
				for(int j=i;j<=i;j++) {				// 00 11 22 33 44
					xsum01+=arr01[i][j];
				}
			}
			if(xsum01==0) cnt++;
			xsum01=0;
			int k=4;
			for(int i=0; i<5; i++) {				// 왼쪽 아래 대각선 방향 합
				xsum02+=arr01[i][k];
				k--;
			}
			if(xsum02==0) cnt++;
			xsum02=0;
		}
		
		System.out.println(result);
	}
}
