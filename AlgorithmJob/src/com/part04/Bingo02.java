package com.part04;

import java.util.Scanner;

public class Bingo02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextInt();	
			}
		}
		
		//(1) arr���� a�� ��ġ�� ã��
		//(2) a�� -1�� �ٲ���
		//(3) ��� ���� ��������
		//(4) 3�� �̻��� ���� ���������� ��
		
		int result = 0;
		int flag = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int a = sc.nextInt();
				result++;
				
				for(int k=0; k<5; k++) {
					for(int p=0; p<5;p++) {
						if(arr[k][p] == a) {
							// (k,p)�� a�� �ֱ���!
							arr[k][p] = -1;
						}
					}
				}
				
				int cnt = 0;
				
				
				for(int k=0; k<5; k++) {
					// k��° ���� X�� ���� ���ڴ�.
					int Xcnt = 0;
					for(int p=0;p<5;p++) {
						if(arr[k][p] == -1) {
							Xcnt++;
						}
					}
					if(Xcnt==5) cnt++;
				}
				
				for(int k=0; k<5; k++) {
					int Xcnt = 0;
					for(int p=0; p<5; p++) {
						if(arr[p][k] == -1) {
							Xcnt++;
						}
					}
					if(Xcnt==5) cnt++;
				}
				
				if(arr[0][0]==-1 && arr[1][1]==-1 && arr[2][2]==-1 && arr[3][3]==-1 && arr[4][4]==-1) cnt++;
				if(arr[0][4]==-1 && arr[1][3]==-1 && arr[2][2]==-1 && arr[3][1]==-1 && arr[4][0]==-1) cnt++;
				
				if(cnt>=3) {
					System.out.println(result);
					flag = 1;
					break;
				}
				
			}
			if(flag == 1) break;
		}
		
	}
}
