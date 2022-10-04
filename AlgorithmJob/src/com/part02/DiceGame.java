package com.part02;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
	
		/*
		 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

			규칙(1) 같은 눈이 3개가 나오면 10,000원+(같은 눈)*1,000원의 상금을 받게 된다.
				
			규칙(2) 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)*100원의 상금을 받게 된다.
				
			규칙(3) 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)*100원의 상금을 받게 된다.
				
			예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3 * 100으로 계산되어 1,300원을 받게 된다.
			또 3개의 눈이 2, 2, 2로 주어지면 10,000+2 * 1,000 으로 계산되어 12,000원을 받게 된다. 
			3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6 * 100으로 계산되어 600원을 상금으로 받게 된다.
				
			N(2≤N≤1,000) 명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.
			
			입출력 예제
			3
			3 3 6
			2 2 2
			6 2 5
			
			12000 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//참가자 수
		int num = sc.nextInt();
		
		
		//참가자 숫자대로 값비교할 배열 생성
		int valueArr[] = new int[num];
		
		//2차배열
		int arr[][] = new int[num][3];
		
		//2차배열로 값 입력받기
		for(int i=0;i<num;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<1;j++) {
				if(arr[i][j]==arr[i][j+1]&&arr[i][j+1]==arr[i][j+2]) {										//규칙1
					valueArr[i] = 10000 + arr[i][j]*1000;
				}else if(arr[i][j]!=arr[i][j+1]&&arr[i][j]!=arr[i][j+2]&&arr[i][j+1]!=arr[i][j+2]) {		//규칙3
					if(arr[i][j] > arr[i][j+1] && arr[i][j] > arr[i][j+2]) {								//규칙3 - [][0]값이 가장 클 때 
						valueArr[i] = arr[i][j]*100; 
					}else if(arr[i][j+1]>arr[i][j] && arr[i][j+1]>arr[i][j+2]) {							//규칙3 - [][1]값이 가장 클 때
						valueArr[i] = arr[i][j+1]*100;
					}else{																					//규칙3 -	 [][2]값이 가장 클 때
						valueArr[i] = arr[i][j+2]*100;
					}
				}else {																						//규칙2
					if(arr[i][j]==arr[i][j+1] || arr[i][j]==arr[i][j+2]) {									//규칙2 - [0][0]==[0][1] or [0][0]==[0][2]
						valueArr[i] = 1000+arr[i][j]*100;
					}else valueArr[i] = 1000+arr[i][j+1]*100;												//규칙2 - [0][1]==[0][2]
				}
			}
		}
		
		//for(int i=0; i<num; i++) {
		//	System.out.println(valueArr[i]);
		//}

		//최댓값
		int maxValue = valueArr[0];
		
		for(int i=1; i<num; i++) {
			if(maxValue < valueArr[i]) {
				maxValue = valueArr[i];
			}
		}
		System.out.println(maxValue);
	}
}
