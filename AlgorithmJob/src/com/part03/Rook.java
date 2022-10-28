package com.part03;

import java.util.Scanner;

public class Rook {

	public static void main(String[] args) {
		
		/*
		 * �Է�
			8�ٿ� ���� 8x8 ü������ ���°� �־�����. 
			�̶� 0�� �⹰�� ���� �����̰�, 
			1�� �˷����� ŷ�� �ǹ��ϰ�, 
			2�� ����� ���� �ǹ��ϸ� 3�� �� �� �ٸ� �⹰���� �ǹ��Ѵ�. 
			(ŷ�� �ϳ��� �����ϸ�, ����� ���� �ִ� 2������ ���� �� �ִ�. �� �� �⹰���� �ִ� 29������ ���� �� �ִ�.)
			
			���
			ŷ�� �迡�� ���� ���ɼ��� ������ 1, �ƴϸ� 0�� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[8][8];
		
		int rookX[] = new int[2];	// ���� x��ǥ(��)	���� ������ �ִ� 2����
		int rookY[] = new int[2];	// ���� y��ǥ(��)
		int rookCnt = 0;	// ���� ���� ī��Ʈ
		
		boolean flag = false;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				
				arr[i][j] = sc.nextInt();
				
				if(arr[i][j]==2) {
					rookY[rookCnt] = i;		// ���� y
					rookX[rookCnt] = j;		// ���� x
					
					rookCnt++;	// ���� 2�� ���� ��� ���
				}
				
			}
		}
		for(int k=0; k<2; k++) {
			int rx = rookX[k];
			int ry = rookY[k];
			
			for(int i=rx+1; i<8; i++) {				// rx���� �����ʺ��� ������
				if(arr[ry][i] == 1) flag=true;	
				else if(arr[ry][i] == 3) break;
			}
			
			for(int i=rx-1; i>=0; i--) {
				if(arr[ry][i] == 1) flag=true;
				else if(arr[ry][i] == 3) break;
			}
			
			for(int i=ry+1; i<8; i++) {
				if(arr[i][rx] == 1) flag=true;
				else if(arr[i][rx] == 3) break;
			}
			
			for(int i=ry-1; i>=0; i--) {
				if(arr[i][rx] == 1) flag=true;
				else if(arr[i][rx] == 3) break;
			}
		}
		
		if(flag == true) System.out.println(1);
		else System.out.println(0);
		
	}
}
