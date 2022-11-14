package com.part09;

import java.util.Scanner;

public class GraphAdjacencyMatrix02 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� �� �Է�
		int v = sc.nextInt();
		//������ �� �Է�
		int e = sc.nextInt();
		
		int [][]adjMatrix = new int[v+1][v+1];
		
		for(int i=0; i<e;i++) {		//������ ���� ��ŭ �Է¹ޱ�
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adjMatrix[a][b] = 1;	//����⼺�� ��� �� �� �־��ش�.
			adjMatrix[b][a] = 1;	//���⼺�� ��� [a][b]�� ���ش�.
		}
		
		for(int i=1; i<=v; i++) {
			for(int j=1; j<=v; j++) {
				System.out.printf("%d ",adjMatrix[i][j]);
			}
			System.out.println();
		}
		
	}
}
