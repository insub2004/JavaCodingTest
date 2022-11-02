package com.part03;

import java.util.Scanner;

public class ReverseMatrix02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 뒤집을 횟수

		int start = 0; // 처음 뒤집기 시작할 변수 + 뒤집을 행과 열의 고정 변수

		int[][] arr = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		while (start < N) {
			for (int i = 0; i < 10; i++) { // 열부분 변환
				if (arr[start][i] == 0) {
					arr[start][i] = 1;
				} else if (arr[start][i] == 1) {
					arr[start][i] = 0;
				}
			}
			for (int j = 0; j < 10; j++) { // 행부분 변환
				if (start == j)
					continue; // 0,0 1,1 같이 행과 열이 같은 부분을 위의 열부분 변환에서 바꿔주었으니 무시
				if (arr[j][start] == 0) {
					arr[j][start] = 1;
				} else if (arr[j][start] == 1) {
					arr[j][start] = 0;
				}
			}
			start++;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}
}
