package com.part03;

import java.util.Scanner;

public class ClassPresident {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();			// 학생의 수 
		
		int arr[][] = new int[1005][5];	// 1~5학년까지의 반
		
		int result = -1; // 만난 횟수의 최댓값, -1을 넣는 경우는 전부다 0번씩 만났으면 1번째 학생이 임시반장이 되야함으로
		int resultNum = 0;
		
		// 2차원 배열에 반 입력
		for(int i=1; i<=N; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<N; i++) {
			// i번째 학생에 대하여 겹치는 숫자 구하기
			int numStudent = 0;			// i번째 학생이 나머지 학생들과의 겹치는 횟수
			
			for(int j=1; j<N; j++) {
				
				if(i==j) continue;
				
				if(arr[i][0] == arr[j][0] ||
						arr[i][1] == arr[j][1] ||
						arr[i][2] == arr[j][2] ||
						arr[i][3] == arr[j][3] ||
						arr[i][4] == arr[j][4]) numStudent++;
			}
			
			if(result < numStudent) {	// 방금 비교한 i번째 학생의 만난 횟수가 제일 크면 그 값을 result에 넣어주고 i를 resultNum에 넣기
				result = numStudent;
				resultNum = i;
			}
		}
		
		System.out.println(resultNum);
		
		
		
	}
}
