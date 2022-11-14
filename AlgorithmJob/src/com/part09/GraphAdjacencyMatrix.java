package com.part09;

import java.util.Scanner;

public class GraphAdjacencyMatrix {

	
	//�������
	// 5 6 (������ ����, ������ ����)
	// 1 2
	// 1 3
	// 1 4
	// 2 4
	// 4 5
	// 3 5
	
	// Q1. ���� x�� y�� ������ �Ǿ� �ִ°�?(Y/N)
	// Q2. ���� x�� ����Ǿ� �ִ� ������ ��� ����϶�.
	
	public static int MAX = 10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();	//������ ����
		int e = sc.nextInt();	//������ ����
		
		int arr[][] = new int[MAX][MAX];
		
		for(int i=0; i<e; i++) {			// ������ ���� ��ŭ �Է� �ޱ�
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a][b] = 1;				
			arr[b][a] = 1;					// b a �� ����������ϱ� �ݴ�ε� �־������!!
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
		// ����i�� ����Ǿ� �ִ� �������� ���
		
		for(int i=1; i<=v; i++) {
			if(arr[a][i] == 1) System.out.printf("%d ", i);
		}
		System.out.println();
	}

	private static Boolean isConnected(int[][] arr, int i, int j) {
		// ���� �� ��ǥ�� ����Ǿ� ������ 1, ���� �ȵǾ� ������ 0�� ��� 
		return (arr[i][j] == 1) ? true:false;
	}
}
