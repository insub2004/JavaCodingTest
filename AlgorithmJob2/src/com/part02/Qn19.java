package com.part02;

import java.util.Scanner;

public class Qn19 {
	
	//offset
	public static void main(String[] args) {
		
		//5*5 행렬이지만 7*7로 만들어서 제일 바깥을 0으로 만들어 준 뒤 상하좌우를 비교해주자
		//행과열을 1~5만 입력 받으면 나머지는 0
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[7][7];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=10;
			}
		}
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(arr[i][j] < arr[i-1][j] && 
				   arr[i][j] < arr[i+1][j] &&
				   arr[i][j] < arr[i][j-1] &&
				   arr[i][j] < arr[i][j+1]) {
					System.out.print("* ");
				}
				else System.err.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
