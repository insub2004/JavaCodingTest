package com.part02;

import java.util.Scanner;

public class Qn32 {

	//seat
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();	//���� -> 90�� ������ ������
		int c = sc.nextInt();	//���� -> 90�� ������ ����
		
		int k = sc.nextInt();
		
		int[][] arr = new int[r+10][c+10]; //�� 0���� ä���� ����
		arr[1][0] = 1;
		//(1,1)���� �����ؼ� ������ (1,c)�� ��������� or ���ڸ� ��������� ���ڷ� ����� �Ʒ���������
		//(1,c)���� �����ؼ� �Ʒ� (r,c)�� ��������� or ���ڸ� ��������� ���ڷ� ����� ���ʹ�������
		//(r,c)���� �����ؼ� ���� ���ڸ� ��������� ���ڷ� ����� �̰� �ݺ�
		
		//arr[i+dx[0]][j+dy[0]] ������
		//arr[i+dx[1]][j+dy[1]] �Ʒ�����
		//arr[i+dx[2]][j+dy[2]] ���ʹ���
		//arr[i+dx[3]][j+dy[3]] ���ʹ���
		int direc = 0;
		int val = 1;
		
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,-1};
		
		int x=1;
		int y=0;
		//�ϴ� �迭 ��ŭ ���� �� ä���
		
		for(int i=2; i<=r*c; i++) {
			x = x + dx[direc];
			y = y + dy[direc];
			System.out.println(val);
			System.out.println(direc);
			System.out.println(x + " " + y);
			arr[x][y] = val++;
			
			if(y>=c || x>=r || arr[x][y] == 0) direc++;
			
			if(direc==4) {
				direc=0;
			}
		}
		
		for(int i=1; i<=c; i++) {
			for(int j=1; j<=r; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
