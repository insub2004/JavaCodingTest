package com.final01;

import java.util.Scanner;

public class QnC01 {
	
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] arr = new int[n+1][n+1];
			
			for(int i=1; i<=m; i++) {
				int y = sc.nextInt();
				int x = sc.nextInt();
				
				arr[y][x] = 1;
			}
			
//			for(int i=1; i<=n; i++) {
//				for(int j=1; j<=n; j++) {
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			//�� �������� ���� ���� ��ǥ ���ϱ�
			int upY=0;
			for(int i=1; i<=n; i++){
				for(int j=1; j<=n; j++) {
					if(arr[i][j]!=0) {
						upY = i;
						break;
					}
				}
				if(upY!=0) break;
			}
			//�� �������� ���� ���� ��ǥ ���ϱ�
			int leftX=0;
			for(int i=1; i<=n; i++){
				for(int j=1; j<=n; j++) {
					if(arr[j][i]!=0) {
						leftX = i;
						break;
					}
				}
				if(leftX!=0) break;
			}
			//�� �������� ���� �Ʒ� ��ǥ ���ϱ�
			int downY=0;
			for(int i=n; i>0; i--) {
				for(int j=n; j>0; j--) {
					if(arr[i][j]!=0) {
						downY=i;
						break;
					}
				}
				if(downY!=0) break;
			}
			//�� �������� ���� ������ ��ǥ ���ϱ�
			int rightX=0;
			for(int i=n; i>0; i--) {
				for(int j=n; j>0; j--) {
					if(arr[j][i]!=0) {
						rightX=i;
					}
				}
				if(rightX!=0) break;
			}
			
			int ansY = 0;
			
			if(Math.abs(upY-1)>Math.abs(n-downY)) { //�Ʒ����� ����
				ansY += n-upY;
			}else {									//������ ����
				ansY += downY-1;
			}
			
			if(ansY==0) {
				System.out.printf("#%d %d",test_case,0);
				System.out.println();
				continue;
			}
			
			int ansX = 0;
			
			if(Math.abs(leftX-1) > Math.abs(n-rightX)) {	//�������� ����
				ansX += n-leftX;
			}else {									//������ ����
				ansX += rightX-1;
			}
			
			if(ansX==0) {
				System.out.printf("#%d %d",test_case,0);
				System.out.println();
				continue;
			}
			
			System.out.printf("#%d %d",test_case,ansY+ansX);
			System.out.println();
			
		}
		
	}
}
