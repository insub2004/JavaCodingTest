package com.part08;

import java.util.Scanner;

public class RecursionFullSearch {

	/*
	 * n��for��
	 * n�� �Է��ϸ�
	 * 1���� n������ ���� �� �ߺ����� �ʴ� ���ڸ� ���� �����϶�
	 * 
	 * �Է�
	 * 3
	 * 
	 * ���
	 * 123
	 * 132
	 * 213
	 * 231
	 * 312
	 * 321
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//�Է�
		int arr[] = new int[n];
		
		getResult(0, n, arr);
		
	}
	
	//current�� n��° for���̶�� ��������
	//
	private static void getResult(int current, int n, int[] result) {
		
		if(current>=n) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) {
				if(isNotContain(result,i)) {
					result[current] = i;
					getResult(current + 1, n, result);
					result[current] = 0;
				}
			}
		}
		
	}

	private static boolean isNotContain(int[] result, int a) {
		for(int i=0; i<result.length; i++) {					//���� �迭�� ������ result�� ������ �����ϹǷ�
			if(result[i] == a) return false;					//0~result�� ������ ���°� �´�
		}
		return true;
	}
	
}
