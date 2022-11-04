package com.part05;

import java.util.Scanner;

public class BubleSort {

	public static void main(String[] args) {
		
		/*
		 * ��������
		 * (�������� ����)
		 * 
		 * N���� N�� Ž��	O(n^2)
		 * 
		 * Ž���κ� ���� ���������� ���ĵ� �κ�(S)�̶�� �����ϰ�
		 * �� �պ��� 2�ڸ� ���ڸ� S���� ���ϸ鼭 ū ���� �������� swap�ϰ�
		 * S���� swap�� �Ϸ��ϸ� S�� ��ĭ ������ ����.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {			// n�� ���� n-1�� ���� ���������ϱ�
			for(int j=0; j<n-1-i;j++) {		// n-1-i��ü�� ���ĵ� �κб��� �ݺ��� �� �ְ� ���ش�.
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			for(int p=0; p<n; p++) {
				System.out.printf("%d ", arr[p]);
			}
			System.out.println();
		}	
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
	}
}
