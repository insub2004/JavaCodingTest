package com.part02;

import java.util.Scanner;

public class Qn26 {

	//colorpaper
	//���̸� ���� �� �ʺ�*���������� �ش� �������� ��� ��ĭ�� 1*1=1 ���簢���̶�� �����Ƿ�
	//�����ǥ �ϳ� �� ���̰� 1�̹Ƿ� �׳� n��° ������ ��ǥ��ŭ n�� �ְ� n�� ������ �������
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[101][101];
		
		int n = sc.nextInt();
		
		int[] ans = new int[n+1];

		int y = 0; //��
		int x = 0; //��
		int H = 0; //����(�� �þ)
		int N = 0; //�ʺ�(�� �þ)
		//n���� �����̸� 2������� ��ǥ�� n�Է��ϱ�
		for(int i=1; i<=n; i++) {
			y = sc.nextInt(); //��
			x = sc.nextInt(); //��
			H = sc.nextInt(); //����(�� �þ)
			N = sc.nextInt(); //�ʺ�(�� �þ)
			for(int j=y;j<y+H;j++) {
				for(int k=x;k<x+N;k++) {
					arr[j][k] = i;
				}
			}
		}
		
		//0�� �����ϰ� ���̴� n���� ������ ��ŭ n�� ����
		for(int k=1; k<=n; k++) {
			for(int i=0; i<101; i++) {
				for(int j=0; j<101; j++) {
					if(arr[i][j]==k) {
						ans[k]++;
					}
				}
			}
		}

		for(int i=1; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}
}
