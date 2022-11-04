package com.part05;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 * ���� ����
		 * (�������� ����)
		 * �ּڰ��� ã�Ƽ� ���ĵ� �κ� �ٷ� ���� �ڸ��� �ٲٰ� 
		 * ���ĵ� �κ��� ��ĭ ������ ������ Ž�� ���κб��� �ݺ��Ѵ�.
		 * 
		 * 10
		 * 1 5 6 8 3 4 5 9 2 10
		 * ---
		 * 1 2 3 4 5 5 6 8 9 10
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// ����
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;	// �ּڰ��� ���� ��ġ 
		
		while(i<n) {
			int inx = i;						// ���� �ε��� ���� inx�� Ž���� ������ ù��° ������ ���� �� �ְ� �ؾ��Ѵ�.
			for(int k=i; k<n; k++) {			// 1) k=i���� �ؾ� Ž�� ������ ���ĵ� �κ� ���ĺ��� �� �� �ִ�. (i������ ������ �� �Ǿ�����)
				if(arr[k] < arr[inx]) {			// 2) arr[k] < arr[i]�� �ϸ� Ž�� ������ �κп� arr[i]���� �۱⸸ �ϸ� �ּҰ����� �����ؼ�
					inx = k;					//    arr[k] < arr[inx]�� �ؾ��� Ž���ϴ� ���� �� ���� ���� ���� ã�� �� �ִ�.
				}
			}
			int tmp = arr[i];
			arr[i] = arr[inx];
			arr[inx] = tmp;
			
			i++;
		}
		
		for(int j=0; j<n; j++) {
			System.out.printf("%d ", arr[j]);
		}
	}
}
