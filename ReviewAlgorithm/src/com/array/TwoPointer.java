package com.array;

import java.util.Scanner;

public class TwoPointer {

	// ���� 2018��
	
	// 15 �Է�
	//  i(start)
	//  1,2,3~14,15 �� �迭����
	//  j(end)
	// i�� j�� �Űܰ��鼭 sum�� n(15)���� ������ end�� ���������� ũ�� start�� ���������� �����ش�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int start_index = 1;
		int end_index = 1;
		int cnt = 0;
		int sum = 1;
		
		while(end_index<=n) {		//end_index�� n�Ѿ�� �Ǹ� �� <-���� Ȯ��
			if(sum < n) {			//sum�� n���� ������ �� ū���� ������� �ϹǷ�
				end_index++;		//end_index�� ���� ������Ű��
				sum+=end_index;		//sum�� �����ָ� end_index�� ���������� ��ĭ �̵��� ä�� sum�� �������
			}
			else if(sum == n) {		//sum�� n�� ������ 
				cnt++;				//cnt�� �ϳ� �÷��ְ�
				end_index++;		//���� ������ ���� end_index�� ���� ������Ű��
				sum+=end_index;		//������Ų end_index�� ���ؼ� sum�� �����
			}
			else if(sum > n){					//sum�� n���� Ŭ ���
				sum-=start_index;	//������ start_index�� ���� ���ְ�
				start_index++;		//start_index�� �ϳ� �������� �ش�.
			}
		}
		System.out.println(cnt);
		
	}
	
}
