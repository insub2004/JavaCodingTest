package com.part02;

import java.util.Scanner;

public class Qn22 {

	//rook
	//2�� �������� ã�ڴ�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[8][8];
		
		int kx = 0;	//ŷ�� ��
		int ky = 0;	//ŷ�� ��
		
		int[] rookX = new int[2];
		int[] rookY = new int[2];
		int rookCnt = 0;	//�� ������ ��ǥ�� �ֱ� ����
		
		boolean flag = false;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				arr[i][j] = sc.nextInt();
				
				if(arr[i][j]==2) {
					rookX[rookCnt] = j;
					rookY[rookCnt] = i;
					rookCnt++;
				}
			}
		}
		
		for(int i=0; i<rookCnt; i++) {
			int rx = rookX[i]; //��
			int ry = rookY[i]; //��
			
			//���� ��,���� ����������
			for(int j=rx+1; j<8; j++) {
				if(arr[ry][j]==1) flag = true;
				else if(arr[ry][j]==3) break;
			}for(int j=rx-1; j>=0; j--) {	//���� ��,���� �������� 
				if(arr[ry][j]==1) flag = true;
				else if(arr[ry][j]==3) break;
			}for(int j=ry+1; j<8; j++) {
				if(arr[j][rx]==1) flag = true;
				else if(arr[j][rx]==3) break;
			}for(int j=ry-1; j>=0; j--) {
				if(arr[j][rx]==1) flag = true;
				else if(arr[j][rx]==3) break;
			}
		}
		
		if(flag==true) System.out.println(1);
		else System.out.println(0);
	}
}
