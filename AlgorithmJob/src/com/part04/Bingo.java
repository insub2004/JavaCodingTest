package com.part04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		
		// ��Ÿ�ӿ��� ���� �Ф�
		
		Scanner sc = new Scanner(System.in);
		
		int arr01[][] = new int[5][5];		// ����� ����
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr01[i][j] = sc.nextInt();
			}
		}
		
		Queue<Integer> que = new LinkedList<Integer>();		// ���� ť
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				que.add(sc.nextInt());
			}
		}
		
		int cnt = 0;	//���� ���� ����
		int value = 0;	//ť���� �ϳ��� ������ ���� ����
		int result = 0;	//ť���� ��� ���´��� ���� ����
		int sum = 0;	//���� 0�� �Ǹ� ����� �Ǵ�
		int xsum01 = 0; //������ �Ʒ� �밢�� ���� ��
		int xsum02 = 0;	//���� �Ʒ� �밢�� ���� ��
		
		while(cnt!=3) {

			cnt = 0;	// while�ѹ� ���� ������ �Ȱ��� ���� �ߺ� ī��Ʈ�ϴ°� ����
			value = que.poll();
			result++;
			
			for(int i=0;i<5;i++) {					// ���� �� ã�Ƽ� 0 �־��ֱ�
				for(int j=0;j<5;j++ ) {
					if(value == arr01[i][j]) {
						arr01[i][j]=0;
						break;
					}
				}
			}
			
			for(int i=0;i<5;i++) {					// �� �������� ���� Ž��
				for(int j=0;j<5;j++) {
					sum+=arr01[i][j];
				}
				if(sum==0) cnt++;					// �� �پ� sum�� 0���� �����ϹǷ� ���⿡�� ��
				sum = 0;							// �� �پ� ���ؼ� 0���� �����ϹǷ� ���⼭ sum = 0;
			}
			for(int i=0;i<5;i++) {					// �� �������� ���� Ž��
				for(int j=0;j<5;j++) {
					sum+=arr01[j][i];
				}
				if(sum==0) cnt++;
				sum=0;
			}
			for(int i=0;i<5;i++) {					// ������ �Ʒ� �밢�� ���� ��
				for(int j=i;j<=i;j++) {				// 00 11 22 33 44
					xsum01+=arr01[i][j];
				}
			}
			if(xsum01==0) cnt++;
			xsum01=0;
			int k=4;
			for(int i=0; i<5; i++) {				// ���� �Ʒ� �밢�� ���� ��
				xsum02+=arr01[i][k];
				k--;
			}
			if(xsum02==0) cnt++;
			xsum02=0;
		}
		
		System.out.println(result);
	}
}
