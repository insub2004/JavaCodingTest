package com.part05;

import java.util.Scanner;

public class CombinationPascal {

	/*
	 * 문제
		n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.
		이 조합은 파스칼의 삼각형과 아주 밀접한 관련이 있다고 한다.
		n과 m이 주어졌을때 nCm의 값을 출력하는 프로그램을 작성하시오.  
		
		입력
		첫째 줄에 정수 n, m(0 ≤ m ≤ n ≤ 30)이 들어온다.
		
		출력
		첫째 줄에 nCm의 값을 출력한다.
		
		=> 파스칼 삼각형으로 풀자
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//파스칼 삼각형 만들기
		int arr[][] = new int[n+1][n+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<i+1; j++) {
				if(j==0 || i==j) arr[i][j] = 1;
				else if(j<i) arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		/*
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<i+1; j++) {
					System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		*/
		System.out.println(arr[n][m]);
		
	}
	
}
