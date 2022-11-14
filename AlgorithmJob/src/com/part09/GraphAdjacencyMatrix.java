package com.part09;

import java.util.Scanner;

public class GraphAdjacencyMatrix {

	
	//인접행렬
	// 5 6 (정점의 갯수, 간선의 갯수)
	// 1 2
	// 1 3
	// 1 4
	// 2 4
	// 4 5
	// 3 5
	
	// Q1. 정점 x와 y가 연결이 되어 있는가?(Y/N)
	// Q2. 정점 x와 연결되어 있는 정점을 모두 출력하라.
	
	public static int MAX = 10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();	//정점의 갯수
		int e = sc.nextInt();	//간선의 갯수
		
		int arr[][] = new int[MAX][MAX];
		
		for(int i=0; i<e; i++) {			// 간선의 갯수 만큼 입력 받기
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a][b] = 1;				
			arr[b][a] = 1;					// b a 도 연결되있으니깐 반대로도 넣어줘야함!!
		}
		
		for(int i=1; i<=v; i++) {
			for(int j=1; j<=v; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println(isConnected(arr,1,2));	//1
		System.out.println(isConnected(arr,1,5));	//0
		System.out.println(isConnected(arr,3,5));	//1
		
		getAdj(arr,v,2);	//1, 4
		getAdj(arr,v,4);	//1, 2, 5
	}

	private static void getAdj(int[][] arr, int v, int a) {
		// 정점i와 연결되어 있는 정점들을 출력
		
		for(int i=1; i<=v; i++) {
			if(arr[a][i] == 1) System.out.printf("%d ", i);
		}
		System.out.println();
	}

	private static Boolean isConnected(int[][] arr, int i, int j) {
		// 만약 두 좌표가 연결되어 있으면 1, 연결 안되어 있으면 0을 출력 
		return (arr[i][j] == 1) ? true:false;
	}
}
