package com.part02;

import java.util.Scanner;

public class Qn31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n+5][3];
		int result = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				for(int k=1; k<=9; k++) {
					//ijk생성
					if(i!=j&&i!=k&&j!=k) {
						
						boolean flag = false;
						
						//arr에 들어있는 조건 만큼 볼 것임
						for(int p=0; p<n; p++) {
							
							//arr조건[p][0]에 있는 숫자 떼오기
							int first = arr[p][0] / 100;
							int second = (arr[p][0] / 10) % 10;
							int third = arr[p][0] % 10;
							
							// 스트라이크랑 볼 세기
							int strike = 0;
							int ball = 0;
							
							if(first == i) strike++;
							if(second == j) strike++;
							if(third == k) strike++;
							
							if(i==second || i==third) ball++;
							if(j==first || j==third) ball++;
							if(k==first || k==second) ball++;
							
							//만약에 조건들 중에서 하나라도 스트라이크와 볼의 갯수가 같지 않으면 답이 아님
							if(arr[p][1] != strike || arr[p][2] != ball) flag=true;
						}
						
						if(flag==false) result++;
					}
				}
			}
		}
		System.out.println(result);
		
	}
}
