package com.part09;

import java.util.Scanner;

public class GraphAdjacencyMatrix02 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정점 수 입력
		int v = sc.nextInt();
		//간선의 수 입력
		int e = sc.nextInt();
		
		int [][]adjMatrix = new int[v+1][v+1];
		
		for(int i=0; i<e;i++) {		//간선의 갯수 만큼 입력받기
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adjMatrix[a][b] = 1;	//비방향성의 경우 둘 다 넣어준다.
			adjMatrix[b][a] = 1;	//방향성의 경우 [a][b]만 해준다.
		}
		
		for(int i=1; i<=v; i++) {
			for(int j=1; j<=v; j++) {
				System.out.printf("%d ",adjMatrix[i][j]);
			}
			System.out.println();
		}
		
	}
}
