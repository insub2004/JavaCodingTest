package com.part03;

import java.util.Scanner;

public class ClassPresident {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();			// �л��� �� 
		
		int arr[][] = new int[1005][5];	// 1~5�г������ ��
		
		int result = -1; // ���� Ƚ���� �ִ�, -1�� �ִ� ���� ���δ� 0���� �������� 1��° �л��� �ӽù����� �Ǿ�������
		int resultNum = 0;
		
		// 2���� �迭�� �� �Է�
		for(int i=1; i<=N; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<N; i++) {
			// i��° �л��� ���Ͽ� ��ġ�� ���� ���ϱ�
			int numStudent = 0;			// i��° �л��� ������ �л������ ��ġ�� Ƚ��
			
			for(int j=1; j<N; j++) {
				
				if(i==j) continue;
				
				if(arr[i][0] == arr[j][0] ||
						arr[i][1] == arr[j][1] ||
						arr[i][2] == arr[j][2] ||
						arr[i][3] == arr[j][3] ||
						arr[i][4] == arr[j][4]) numStudent++;
			}
			
			if(result < numStudent) {	// ��� ���� i��° �л��� ���� Ƚ���� ���� ũ�� �� ���� result�� �־��ְ� i�� resultNum�� �ֱ�
				result = numStudent;
				resultNum = i;
			}
		}
		
		System.out.println(resultNum);
		
		
		
	}
}
